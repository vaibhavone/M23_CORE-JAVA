package com.cg.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.entities.Student;

public interface StudentRepo 
{
	Statement createStatment();
	PreparedStatement createPreparedStatement(String query);
	public ResultSet RetreiveQuery(String query);
	public int AddQuery(String query,Student s);
	public int updateQuery(String query,Student s);
	public int deleteQuery(String query);

}


