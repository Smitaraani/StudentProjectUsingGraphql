package com.graphql.example.Graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.example.Graphql.entity.Adress;
import com.graphql.example.Graphql.entity.AdressInput;
import com.graphql.example.Graphql.service.AdressService;


@Controller
public class AdressController {
	
	@Autowired
	private AdressService adressService;
	
	 @MutationMapping("createAdress")
	    public   Adress create(@Argument AdressInput adressInput) {
	        Adress b=new Adress();
	       b.setAddCode(adressInput.getAddCode());
	       b.setAddress(adressInput.getAddress());
	        
	        return this.adressService.create(b);
	    }
	 
	 @QueryMapping("allAdress")
	    public List<Adress> getAll() {
	        return this.adressService.getAllAdress();
	    }


}
