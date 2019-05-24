package com.javacodegeeks.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private Connection dbConnection;
	
	public void getDBConnection() throws ClassNotFoundException, SQLException {		
		Class.forName("com.mysql.cj.jdbc.Driver");
		dbConnection = DriverManager.getConnection("jdbc:mysql://0.0.0.0:3306", "root", "root");		
	}
	
	public int executeQuery(String query) throws ClassNotFoundException, SQLException {
		return dbConnection.createStatement().executeUpdate(query);
	}

}
