package com.graphql.example.Graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.example.Graphql.Repositary.StdClassDao;
import com.graphql.example.Graphql.entity.StdClass;

@Service
public class StdClassServiceImpl implements StdClassService {
	
	@Autowired
	private StdClassDao stdClassDao;

	@Override
	public StdClass create(StdClass stdClass) {
		// TODO Auto-generated method stub
		 StdClass stdClass2=stdClassDao.save(stdClass);
		return stdClass2;
	}

	@Override
	public List<StdClass> getAllStdClasses() {
		// TODO Auto-generated method stub
		 List<StdClass> stdClass=stdClassDao.findAll();
		return  stdClass;
	}
	

}
