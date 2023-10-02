package com.graphql.example.Graphql.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.example.Graphql.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
