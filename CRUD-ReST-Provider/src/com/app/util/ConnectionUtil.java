package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;


//singleton pattern for DB Connection
public class ConnectionUtil {

	private static Connection con=null;
	

	//static block executed only one time
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	//to read connection outside classes
	public static  Connection getConnection()
	{
		return con;
	}	
}
