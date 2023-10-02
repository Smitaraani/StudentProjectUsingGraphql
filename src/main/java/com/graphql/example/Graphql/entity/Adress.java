package com.graphql.example.Graphql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Adress_table")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String addCode;
	private  String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddCode() {
		return addCode;
	}
	public void setAddCode(String addCode) {
		this.addCode = addCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(int id, String addCode, String address) {
		super();
		this.id = id;
		this.addCode = addCode;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", addCode=" + addCode + ", address=" + address + "]";
	}
	
	
}
