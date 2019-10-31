package com.trungtamjava.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "/jdbc" })
public class JDBCServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(" xin chao trung tam java 1");
		Connection connection= JDBCConnection.getJDBCConnection();
		try {
			Statement statement= connection.createStatement();
			String sql="SELECT * FROM USERS";
			
			ResultSet resultSet=statement.executeQuery(sql);
			
			while(resultSet.next()) {
				
				printWriter.println(resultSet.getString(1)+":"+resultSet.getString(2)+":"+resultSet.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
