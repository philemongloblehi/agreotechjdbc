package com.agreotech.dao.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	private final static String URL = "jdbc:mysql://localhost/agreotechdb";
	private final static String LOGIN = "root";
	private final static String PASSW = "";
	static Connection connx = null;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
 public static Connection getInstance() {
	 if(connx == null) {
		 try {
			connx = DriverManager.getConnection(URL,LOGIN,PASSW);
			System.err.print("******* Connection is ok ********");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.print("******* connection Failed ********");
		}
	 }
	 return connx;
 }
 
}
