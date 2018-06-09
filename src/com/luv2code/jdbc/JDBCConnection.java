package com.luv2code.jdbc;
import java.sql.*;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcURL="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String userName="root";
		String password="root";
		
		
		try {
 
			Connection myConnection = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connectoin Successfull.....");
			
		}catch (Exception e) {
			System.out.println("We got an error");
			System.out.println(e);
		}
	}

}
