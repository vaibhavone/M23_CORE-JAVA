package com.cg.entities;
public class Student 
{
	private int ID;
	private String Sname;
	
	
	
	@Override
	public String toString() {
		return String.format("Student [ID=%s, Sname=%s]", ID, Sname);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Student(int iD, String sname) {
		super();
		ID = iD;
		Sname = sname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

