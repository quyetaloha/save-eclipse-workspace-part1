package com.trungtamjava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCConnection {
	public static Connection getJDBCConnection() {
		final String url="jdbc:mysql://localhost:3306/test1";
		final String user="root";
		final String password="quyetdaik";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return  DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("ket noi jdbc thanh cong");
		}
		
		return null;
	}
}
