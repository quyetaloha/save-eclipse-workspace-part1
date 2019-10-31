package DAO;

import java.sql.*;

public class ConnectionManager {

	static Connection con;
	static String url;

	public static Connection getConnection() {

		try {
			String url = "jdbc:sqlserver://DESKTOP-EBV3QLN\\\\\\\\SQLEXPRESS:1433";
			// assuming "DataSource" is your DataSource name

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			try {
				con = DriverManager.getConnection(url, "sa", "123");

				// assuming your SQL Server's username is "username"
				// and password is "password"

			}

			catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		return con;
	}
}
