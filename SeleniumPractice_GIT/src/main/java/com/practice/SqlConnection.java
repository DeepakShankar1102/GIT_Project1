package com.practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {
	
	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Employee_Detail", "root","dP_k99j@");	 
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Details where EmployeeID=1;");
		System.out.println(rs);
		 while(rs.next()) {
			 System.out.println(rs.getString("UserName"));
			 System.out.println(rs.getString("Password"));
			 
			
			 
		 }
		 
		 con.close();
		
		
	}

}
