package com.graphql.example.Graphql.service;

import java.util.List;

import com.graphql.example.Graphql.entity.StdClass;

public interface StdClassService   {
	

    //create
    StdClass create(StdClass stdClass);
    public List<StdClass> getAllStdClasses();
    

}
