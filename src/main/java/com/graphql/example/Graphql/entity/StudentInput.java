package com.graphql.example.Graphql.entity;

public class StudentInput {
	

	private int stdRoll;

	private String name;

	private String gender;
	
	private int stdClassId;
	private int adressId;
	public int getStdRoll() {
		return stdRoll;
	}
	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStdClassId() {
		return stdClassId;
	}
	public void setStdClassId(int stdClassId) {
		this.stdClassId = stdClassId;
	}
	public int getAdressId() {
		return adressId;
	}
	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	public StudentInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInput(int stdRoll, String name, String gender, int stdClassId, int adressId) {
		super();
		this.stdRoll = stdRoll;
		this.name = name;
		this.gender = gender;
		this.stdClassId = stdClassId;
		this.adressId = adressId;
	}
	@Override
	public String toString() {
		return "StudentInput [stdRoll=" + stdRoll + ", name=" + name + ", gender=" + gender + ", stdClassId="
				+ stdClassId + ", adressId=" + adressId + "]";
	}
	
	

	
}
