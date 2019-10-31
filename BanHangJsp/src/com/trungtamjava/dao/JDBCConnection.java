package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	public static Connection getJDBCConnection() {
		final String url="jdbc:mysql://localhost:3306/Ban_Hang?autoReconnect=true&useSSL=false";
		final String user="root";
		final String password="quyetdaik";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
