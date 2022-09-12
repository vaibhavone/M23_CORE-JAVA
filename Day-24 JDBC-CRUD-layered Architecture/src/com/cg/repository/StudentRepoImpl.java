package com.cg.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.dao.StudentDao;
import com.cg.entities.Student;

public  class StudentRepoImpl implements StudentRepo  

{
	StudentDao dao;
	
	
	public StudentRepoImpl() 
	{
		dao=new StudentDao();
	}

	@Override
	public Statement createStatment() {
		Connection c=dao.createConnection();
		Statement s;
		try {
			s=c.createStatement();
		} catch (SQLException e) {
			s=null;
			
		}
		return s;
	}

	@Override
	public PreparedStatement createPreparedStatement(String query) {
		Connection c=dao.createConnection();
		PreparedStatement s;
		try {
			s=c.prepareStatement(query);
		} catch (SQLException e) {
			s=null;
			
		}
		return s;
	}

	@Override
	public ResultSet RetreiveQuery(String query) {
		Statement s=createStatment();
		ResultSet r;
		try {
			r=s.executeQuery(query);
		} catch (SQLException e) {
			r=null;
			
		}
		return r;
		
		

		
	}

	@Override
	public int AddQuery(String query, Student s) {
		PreparedStatement s1=createPreparedStatement(query);
		int count=0;
		
		try {
			s1.setInt(1,  s.getID());
			s1.setString(2, s.getSname());
			count=s1.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateQuery(String query, Student s) {
		PreparedStatement s1=createPreparedStatement(query);
		int count=0;
		
		try {
			s1.setInt(2, s.getID());
			s1.setString(1, s.getSname());
			count=s1.executeUpdate();
		} catch (SQLException s2) {
			
			s2.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteQuery(String query) {
		Statement s=createStatment();
		int count;
		try {
			count=s.executeUpdate(query);
		} catch (SQLException e) {
			count=0;
			//e.printStackTrace();
		}
		return count;
	}

}



