package com.cg.services;

import java.util.List;

import com.cg.entities.Student;

public interface StudentService

{

	public boolean AddStudent(Student s);

	public Student updateStudent(Student s);

	public Student getStudent(int ID);

	public List<Student> getstudents();

	public boolean deleteStudent(int ID);

}

