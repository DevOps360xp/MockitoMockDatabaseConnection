package com.javacodegeeks.db;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection x = new DBConnection();
		try {
			x.getDBConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conexão realizada com sucesso!!!");
	}

}
