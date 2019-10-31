package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.UserDao;
import shopfashion.model.User;

public class UserDaoImp extends RootDao implements UserDao{
	private PreparedStatement ppst;
	private ResultSet rs;
	@Override
	public void add(User user) {
		String sql="INSERT INTO user(`username`, `password`, `name`, `add`, `phone`, `type`) VALUES (?,?,?,?,?,?);";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setNString(1, user.getUsername());
			ppst.setNString(2, user.getPassword());
			ppst.setNString(3, user.getName());
			ppst.setNString(4, user.getAdd());
			ppst.setNString(5, user.getPhone());
			ppst.setInt(6, user.getType());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void edit(User user) {
		String sql="UPDATE user SET `username`=?, `password`=?, `name`=?, `add`=?, `phone`=?, `type`=? WHERE `idUser`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setNString(1, user.getUsername());
			ppst.setNString(2, user.getPassword());
			ppst.setNString(3, user.getName());
			ppst.setNString(4, user.getAdd());
			ppst.setNString(5, user.getPhone());
			ppst.setInt(6, user.getType());
			ppst.setInt(7, user.getIdUser());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int idUser) {
		String sql="DELETE FROM user WHERE idUser=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idUser);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getById(int idUser) {
		String sql="SELECT *FROM user WHERE idUser=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idUser);
			rs = ppst.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setIdUser(idUser);
				user.setUsername(rs.getNString("username"));
				user.setPassword(rs.getNString("password"));
				user.setName(rs.getNString("name"));
				user.setAdd(rs.getNString("add"));
				user.setPhone(rs.getNString("phone"));
				user.setType(rs.getInt("type"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new User();
	}

	@Override
	public List<User> getAll() {
		List<User> list = new ArrayList<User>();
		String sql="SELECT *FROM user;";
		try {
			ppst = getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setIdUser(rs.getInt("idUser"));
				user.setUsername(rs.getNString("username"));
				user.setPassword(rs.getNString("password"));
				user.setName(rs.getNString("name"));
				user.setAdd(rs.getNString("add"));
				user.setPhone(rs.getNString("phone"));
				user.setType(rs.getInt("type"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
