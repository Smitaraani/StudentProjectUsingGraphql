package com.graphql.example.Graphql.entity;



public class StdClassInput {

	
	private  String classCode;
	private String stdClass;
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
	public StdClassInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StdClassInput(String classCode, String stdClass) {
		super();
		this.classCode = classCode;
		this.stdClass = stdClass;
	}
	@Override
	public String toString() {
		return "StdClassInput [classCode=" + classCode + ", stdClass=" + stdClass + "]";
	}
	
}
