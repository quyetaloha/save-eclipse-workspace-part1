package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.User;

public class UserDao {

	public List<User> getAllUsers(){
		List<User> list=new ArrayList<User>();
		String sql="SELECT * FROM USERS";
		Connection connection=JDBCConnection.getJDBCConnection();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				User user=new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setPhone(resultSet.getString(3));
				user.setUsername(resultSet.getString(4));
				user.setPassword(resultSet.getString(5));
				user.setAbout(resultSet.getString(6));
				user.setRole(resultSet.getString(7));
				user.setFavourites(resultSet.getString(8));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	public User getUserById(int id) {
		User user=new User();
		String sql="SELECT * FROM USERS WHERE ID = ?";
		Connection connection=JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next()) {
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setPhone(resultSet.getString(3));
				user.setUsername(resultSet.getString(4));
				user.setPassword(resultSet.getString(5));
				user.setAbout(resultSet.getString(6));
				user.setRole(resultSet.getString(7));
				user.setFavourites(resultSet.getString(8));
				return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void addUser(User user) {
		String sql="INSERT INTO USERS(name,phone,username,password,about,role,favourites) values(?,?,?,?,?,?,?);";
		Connection connection=JDBCConnection.getJDBCConnection();
		try {
			
			
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPhone());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getAbout());
			preparedStatement.setString(6, user.getRole());
			preparedStatement.setString(7, user.getFavourites());
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateUser(User user) {
		String sql="UPDATE USERS SET NAME=?,PHONE=?,USERNAME=?,PASSWORD=?,ABOUT=?,ROLE=?,FAVOURITES=? WHERE ID=?";
		Connection connection=JDBCConnection.getJDBCConnection();
		try {
			System.out.println( user.getId());
			System.out.println( user.getName());
			System.out.println( user.getPhone());
			System.out.println( user.getUsername());
			System.out.println( user.getPassword());
			System.out.println( user.getAbout());
			System.out.println( user.getRole());
			System.out.println( user.getFavourites());
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPhone());
			preparedStatement.setString(3, user.getUsername());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getAbout());
			preparedStatement.setString(6, user.getRole());
			preparedStatement.setString(7, user.getFavourites());
			preparedStatement.setInt(8, user.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int id) {
		String sql="DELETE FROM USERS WHERE ID=?";
		Connection connection=JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}







