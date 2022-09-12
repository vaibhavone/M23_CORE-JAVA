package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao 
{
	public Connection createConnection() 
	{
		String URL="jdbc:mysql://localhost:3306/tns";
		String user="root";
		String password="localhost";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection c;
		try
		{
			c=DriverManager.getConnection(URL, user, password);
		}
		catch(SQLException e)
		{
			c=null;
		}
		return c;
			
	
		
	}
	
}
