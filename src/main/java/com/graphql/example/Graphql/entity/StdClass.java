package com.graphql.example.Graphql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud_table")
public class StdClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String classCode;
	private String stdClass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public StdClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StdClass(int id, String classCode, String stdClass) {
		super();
		this.id = id;
		this.classCode = classCode;
		this.stdClass = stdClass;
	}
	@Override
	public String toString() {
		return "StdClass [id=" + id + ", classCode=" + classCode + ", stdClass=" + stdClass + "]";
	}


}
