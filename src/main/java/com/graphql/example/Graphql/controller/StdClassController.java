package com.graphql.example.Graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.example.Graphql.entity.StdClass;
import com.graphql.example.Graphql.entity.StdClassInput;
import com.graphql.example.Graphql.service.StdClassService;

@Controller
public class StdClassController {
	@Autowired
	private StdClassService stdClassService;
	
	 @MutationMapping("createStdClass")
	    public   StdClass create(@Argument StdClassInput stdClassInput) {
	        StdClass b=new StdClass();
	        b.setClassCode(stdClassInput.getClassCode());
	        b.setStdClass(stdClassInput.getStdClass());
	        
	        return this.stdClassService.create(b);
	    }
	 
	 @QueryMapping("allStdClass")
	    public List<StdClass> getAll() {
	        return this.stdClassService.getAllStdClasses();
	    }


	

}
