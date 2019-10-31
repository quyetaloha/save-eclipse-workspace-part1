package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.OrderDao;
import shopfashion.model.Order;

public class OrderDaoImp extends RootDao implements OrderDao{
	private PreparedStatement ppst;
	private ResultSet rs;
	@Override
	public void add(Order order) {
		String sql="INSERT INTO `order` (`idUser`) VALUES (?);";
		try {
			ppst = getConnection().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ppst.setInt(1, order.getIdUser());
			ppst.executeUpdate();
			rs = ppst.getGeneratedKeys();
			while(rs.next()) {
				order.setIdOrder(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void edit(Order order) {
		String sql="UPDATE order SET `idUser`=? WHERE `idOrder`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, order.getIdUser());
			ppst.setInt(2, order.getIdOrder());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idOrder) {
		String sql="DELETE FROM order WHERE `idOrder`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idOrder);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Order getById(int idOrder) {
		String sql="SELECT *FROM order WHERE `idOrder`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idOrder);
			rs = ppst.executeQuery();
			while(rs.next()) {
				Order order = new Order();
				order.setIdUser(rs.getInt("idUser"));
				order.setIdOrder(idOrder);
				return order;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAll() {
		List<Order> list = new ArrayList<Order>();
		String sql="SELECT *FROM order;";
		try {
			ppst =  getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while(rs.next()) {
				Order order = new Order();
				order.setIdUser(rs.getInt("idUser"));
				order.setIdOrder(rs.getInt("idOrder"));
				list.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
