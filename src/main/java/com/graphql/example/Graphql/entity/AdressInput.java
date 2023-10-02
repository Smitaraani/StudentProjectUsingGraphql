package com.graphql.example.Graphql.entity;

public class AdressInput {
	private String addCode;
	private  String address;
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
	public AdressInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdressInput(String addCode, String address) {
		super();
		this.addCode = addCode;
		this.address = address;
	}
	@Override
	public String toString() {
		return "AdressInput [addCode=" + addCode + ", address=" + address + "]";
	}
	
	

}
