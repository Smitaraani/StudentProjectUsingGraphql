package com.graphql.example.Graphql.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.example.Graphql.entity.StdClass;

public interface StdClassDao extends JpaRepository<StdClass, Integer> {

}
