package com.graphql.example.Graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.example.Graphql.Repositary.AdressDao;

import com.graphql.example.Graphql.entity.Adress;

@Service
public class AdressServiceImpl implements AdressService {
	

	@Autowired
	private AdressDao adressDao;

	@Override
	public Adress create(Adress adress) {
		// TODO Auto-generated method stub
		 Adress adress2=adressDao.save(adress);
		return adress2;
	}

	@Override
	public List<Adress> getAllAdress() {
		// TODO Auto-generated method stub
		 List<Adress> adress=adressDao.findAll();
		return  adress;
	}


}
