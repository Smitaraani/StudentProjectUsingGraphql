package com.graphql.example.Graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.graphql.example.Graphql.Repositary.StudentDao;
import com.graphql.example.Graphql.entity.StdClass;
import com.graphql.example.Graphql.entity.StdClassInput;
import com.graphql.example.Graphql.entity.Student;
import com.graphql.example.Graphql.entity.StudentInput;
import com.graphql.example.Graphql.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	
	private StudentService studentService;
	
	
	
	
	 @MutationMapping("createStudentClass")
	    public   Student create(@Argument int stdRoll, @Argument String name, @Argument String gender, @Argument int stdClassId,@Argument int adressId) {
		  Student student=studentService.saveStudent(stdRoll, name, gender, stdClassId, adressId);
		 
	       
	        
	        return student;
	    }
	 
	 @QueryMapping("getAllStudent")
		public List<Student> getAllPostDtos() {
			List<Student> postDtos = this.studentService.getAllStudents();
			

			return postDtos;
		}

	
	
	
	
	
	
	
	
	
	

}
