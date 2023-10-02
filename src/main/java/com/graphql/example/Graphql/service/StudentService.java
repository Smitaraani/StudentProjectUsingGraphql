package com.graphql.example.Graphql.service;

import java.util.List;

import com.graphql.example.Graphql.entity.Student;
import com.graphql.example.Graphql.entity.StudentInput;

public interface StudentService {
	
	
	
	public Student saveStudent(int stdRoll,String  name,String gender,int stdClassId,int adressId );
	
	public List<Student>getAllStudents();

	public String insertChildService(String classCode, String stdClass, String addCode, String address, int stdRoll,
			String name, String gender);


}
