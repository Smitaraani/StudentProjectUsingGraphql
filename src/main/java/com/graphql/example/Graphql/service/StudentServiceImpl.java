package com.graphql.example.Graphql.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.graphql.example.Graphql.Repositary.AdressDao;
import com.graphql.example.Graphql.Repositary.StdClassDao;
import com.graphql.example.Graphql.Repositary.StudentDao;
import com.graphql.example.Graphql.entity.Adress;
import com.graphql.example.Graphql.entity.StdClass;
import com.graphql.example.Graphql.entity.StdClassInput;
import com.graphql.example.Graphql.entity.Student;
import com.graphql.example.Graphql.entity.StudentInput;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private StdClassDao stdClassDao;
	
	@Autowired
	private AdressDao adressDao;
	

//	@Override
//	public Student saveStudent(StudentInput studentInput) {
//		// TODO Auto-generated method stub
//		Student st=new Student();
//		
//		StdClass stdClass=stdClassDao.findById(studentInput.getStdClassId()).get();
//		Adress adress=adressDao.findById(studentInput.getAdressId()).get();
//		st.setName(studentInput.getName());
//		st.setStdRoll(studentInput.getStdRoll());
//		st.setGender(studentInput.getGender());
//		st.setStdclass(stdClass);
//		st.setAdress(adress);
//		Student student2=studentDao.save(st);
//		return student2;
//	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		List<Student> stud=studentDao.findAll();
		return stud;
	}


	
	@Override
	public Student saveStudent(int stdRoll, String name, String gender, int stdClassId, int adressId) {
		// TODO Auto-generated method stub
		
		
		Student student=new Student();
		StdClass stdClass=stdClassDao.findById(stdClassId).get();
		Adress adress=adressDao.findById(adressId).get();
		student.setStdclass(stdClass);
		student.setAdress(adress);
		student.setStdRoll(stdRoll);
		student.setName(name);
		student.setGender(gender);
		
		
		Student student2=studentDao.save(student);
		return student2;
	}


	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	@Override
	public String insertChildService(String classCode, String stdClass, String addCode, String address, int stdRoll,
			String name, String gender) {
		// TODO Auto-generated method stub
		
		StdClass stdClass2=new StdClass();	
		stdClass2.setClassCode(classCode);
		stdClass2.setStdClass(stdClass);
		StdClass stdClass3=stdClassDao.save(stdClass2);
		
		
		Adress adress2=new Adress();
		adress2.setAddCode(addCode);
		adress2.setAddress(address);
		Adress adress3=adressDao.save(adress2);
		
		
		Student student2=new Student();
		student2.setStdRoll(stdRoll);
		student2.setName(name);
		student2.setGender(gender);
		student2.setStdclass(stdClass3);
		student2.setAdress(adress3);
		Student student3=studentDao.save(student2);
		System.out.println(student3);
		
		return "data saved";
		
	}


	

}
