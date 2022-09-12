package com.cg.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.entities.Student;
import com.cg.repository.StudentRepo;
import com.cg.repository.StudentRepoImpl;

public  class StudentServiceImpl implements StudentService 
{

	public boolean AddStudent(Student s) {
		String query="INSERT INTO Student VALUES(?,?)";
		StudentRepo repo=new StudentRepoImpl();
		int count=repo.AddQuery(query, s);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public Student updateStudent(Student s) {
		String query="UPDATE STUDENT SET Ename=? WHERE (ID=?)";
		StudentRepo repo=new StudentRepoImpl();
		int count=repo.updateQuery(query, s);
		if(count==1)
		{
			Student s2=getStudent(s.getID());
			return s2;
		}
		else
		{
			return null;
		}
	}

	@Override
	public Student getStudent(int ID) {
		Student s=new Student();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM STUDENT WHERE ID=" +ID;
		ResultSet r=repo.RetreiveQuery(query);
		
		try {
			r.next();
			s.setID(r.getInt(1));
			s.setSname(r.getString(2));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return s;
		
	}

	@Override
	public  List<Student>getstudents() {
		List<Student>std=new ArrayList<Student>();
		StudentRepo repo=new StudentRepoImpl();
		String query="SELECT * FROM Student";
		ResultSet r=repo.RetreiveQuery(query);
		
		try {
			while(r.next())
			{
				Student s=new Student();
				s.setID(r.getInt(1));
				s.setSname(r.getString(2));
				std.add(s);
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return std;

	}

	@Override
	public boolean deleteStudent(int ID) {
		StudentRepo repo=new StudentRepoImpl();
		String query="DELETE FROM STUDENT WHERE ID=" +ID;
		int count=repo.deleteQuery(query);
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
}


