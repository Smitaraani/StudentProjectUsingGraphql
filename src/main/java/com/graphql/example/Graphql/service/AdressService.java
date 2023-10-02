package com.graphql.example.Graphql.service;

import java.util.List;

import com.graphql.example.Graphql.entity.Adress;

public interface AdressService {

	 //create
    Adress create(Adress adress);
    public List<Adress> getAllAdress();
}
