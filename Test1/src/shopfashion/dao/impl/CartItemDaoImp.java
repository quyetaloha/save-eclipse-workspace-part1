package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.CartItemDao;
import shopfashion.model.CartItem;

public class CartItemDaoImp extends RootDao implements CartItemDao {
	private PreparedStatement ppst;
	private ResultSet rs;

	@Override
	public void add(CartItem cartItem) {
		String sql = "INSERT INTO cartitem(`idProduct`,`idOrder`,`nameProduct`,`image`,`quantity`,`unitPrice`) VALUES(?,?,?,?,?,?)";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, cartItem.getIdProduct());
			ppst.setInt(2, cartItem.getIdOrder());
			ppst.setString(3, cartItem.getNameProduct());
			ppst.setString(4, cartItem.getImage());
			ppst.setInt(5, cartItem.getQuantity());
			ppst.setLong(6, cartItem.getUnitPrice());
			ppst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	@Override
	public void edit(CartItem cartItem) {
		String sql = "UPDATE cartitem SET `idProduct`=?, `idOrder`=?, `nameProduct`=?, `image`=?, `quantity`=?, `unitPrice`=? WHERE idCartItem=?";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, cartItem.getIdProduct());
			ppst.setInt(2, cartItem.getIdOrder());
			ppst.setString(3, cartItem.getNameProduct());
			ppst.setString(4, cartItem.getImage());
			ppst.setInt(5, cartItem.getQuantity());
			ppst.setLong(6, cartItem.getUnitPrice());
			ppst.setInt(7, cartItem.getIdCartItem());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idCartItem) {
		String sql = "DELETE FROM cartitem WHERE `idCartItem`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idCartItem);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public CartItem getById(int idCartItem) {
		String sql = "SELECT *FROM cartitem WHERE `idCartItem`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idCartItem);
			rs = ppst.executeQuery();
			while (rs.next()) {
				CartItem cartItem = new CartItem();
				cartItem.setIdCartItem(idCartItem);
				cartItem.setIdProduct(rs.getInt("idProduct"));
				cartItem.setIdOrder(rs.getInt("idOrder"));
				cartItem.setNameProduct(rs.getString("nameProduct"));
				cartItem.setImage(rs.getString("image"));
				cartItem.setQuantity(rs.getInt("quantity"));
				cartItem.setUnitPrice(rs.getLong("unitPrice"));
				return cartItem;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<CartItem> getAll() {
		List<CartItem> list = new ArrayList<CartItem>();
		String sql = "SELECT *FROM cartitem WHERE `idCartItem`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while (rs.next()) {
				CartItem cartItem = new CartItem();
				cartItem.setIdCartItem(rs.getInt("idCartItem"));
				cartItem.setIdProduct(rs.getInt("idProduct"));
				cartItem.setIdOrder(rs.getInt("idOrder"));
				cartItem.setNameProduct(rs.getString("nameProduct"));
				cartItem.setImage(rs.getString("image"));
				cartItem.setQuantity(rs.getInt("quantity"));
				cartItem.setUnitPrice(rs.getLong("unitPrice"));
				list.add(cartItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteByIdOrder(int idOrder) {
		String sql = "DELETE FROM cartitem WHERE `idOrder`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idOrder);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CartItem> getByIdOrder(int idOrder) {
		List<CartItem> list = new ArrayList<CartItem>();
		String sql = "SELECT *FROM cartitem WHERE `idOrder`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while (rs.next()) {
				CartItem cartItem = new CartItem();
				cartItem.setIdCartItem(rs.getInt("idCartItem"));
				cartItem.setIdProduct(rs.getInt("idProduct"));
				cartItem.setIdOrder(rs.getInt("idOrder"));
				cartItem.setNameProduct(rs.getString("nameProduct"));
				cartItem.setImage(rs.getString("image"));
				cartItem.setQuantity(rs.getInt("quantity"));
				cartItem.setUnitPrice(rs.getLong("unitPrice"));
				list.add(cartItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
