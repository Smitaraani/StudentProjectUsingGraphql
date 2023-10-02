package com.graphql.example.Graphql.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.example.Graphql.entity.Adress;

public interface AdressDao  extends JpaRepository<Adress, Integer>{

}
