package com.springbootapi.entitiy;

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String DOB;
	private double marks;
	public int getStudentId() {
		return id;
	}
	
	public Student(int id, String firstname, String lastname, String dOB, double marks) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		DOB = dOB;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", DOB=" + DOB + ", marks="
				+ marks + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}
