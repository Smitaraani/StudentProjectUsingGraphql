package com.graphql.example.Graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.graphql.example.Graphql.entity.Adress;
import com.graphql.example.Graphql.service.AdressService;
import com.graphql.example.Graphql.service.StdClassService;
import com.graphql.example.Graphql.service.StudentService;

@Controller
public class TransactionalController {
	
	@Autowired
	private StdClassService stdClassService;
	
	@Autowired
	private AdressService adressService;
	
	@Autowired
	private StudentService studentService;
	
	@MutationMapping("createParentChildClass")
	public String insertParentAndChild(@Argument  String classCode,@Argument String stdClass, @Argument String  addCode,@Argument String address,@Argument int stdRoll,@Argument String name,@Argument String gender){
   
		String messageString= studentService. insertChildService( classCode, stdClass,  addCode, address, stdRoll, name, gender);
			 if  (messageString!=null) {
				 return "sucessful";
			 }
			 else {
				 return "failed";
				
			}
			
			
			 
}
}
