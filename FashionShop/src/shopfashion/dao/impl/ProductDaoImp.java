package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.ProductDao;
import shopfashion.model.Product;

public class ProductDaoImp extends RootDao implements ProductDao {
	private PreparedStatement ppst;
	private ResultSet rs;

	@Override
	public void add(Product product) {
		String sql = "INSERT INTO product(`nameProduct`,`image`,`giaMua`,`giaBan`,`nhaSanXuat`,`namSanXuat`,`thongTinProduct`) VALUES(?,?,?,?,?,?,?);";
		try {
			ppst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ppst.setString(1, product.getNameProduct());
			ppst.setString(2, product.getImage());
			ppst.setLong(3, product.getGiaMua());
			ppst.setLong(4, product.getGiaBan());
			ppst.setString(5, product.getNhaSanXuat());
			ppst.setInt(6, product.getNamSanXuat());
			ppst.setString(7, product.getThongTin());
			ppst.executeUpdate();
			rs = ppst.getGeneratedKeys();
			while (rs.next()) {
				product.setIdProduct(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void edit(Product product) {
		String sql = "UPDATE product SET `nameProduct`=?,`image`=?,`giaMua`=?,`giaBan`=?, `nhaSanXuat`=?,`namSanXuat`=?,`thongTinProduct`=? WHERE `idProduct`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setString(1, product.getNameProduct());
			ppst.setString(2, product.getImage());
			ppst.setLong(3, product.getGiaMua());
			ppst.setLong(4, product.getGiaBan());
			ppst.setString(5, product.getNhaSanXuat());
			ppst.setInt(6, product.getNamSanXuat());
			ppst.setString(7, product.getThongTin());
			ppst.setInt(8, product.getIdProduct());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idProduct) {
		String sql = "DELETE FROM product WHERE idProduct=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idProduct);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Product getById(int idProduct) {
		String sql = "SELECT *FROM product WHERE idProduct=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idProduct);
			rs = ppst.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setIdProduct(idProduct);
				product.setNameProduct(rs.getString("nameProduct"));
				product.setImage(rs.getString("image"));
				product.setGiaMua(rs.getLong("giaMua"));
				product.setGiaBan(rs.getLong("giaBan"));
				product.setNamSanXuat(rs.getInt("namSanXuat"));
				product.setNhaSanXuat(rs.getString("nhaSanXuat"));
				product.setThongTin(rs.getString("thongTinProduct"));
				return product;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Product();
	}

	@Override
	public List<Product> getAll() {
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT *FROM product;";
		try {
			ppst = getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setIdProduct(rs.getInt("idProduct"));
				product.setNameProduct(rs.getString("nameProduct"));
				product.setImage(rs.getString("image"));
				product.setGiaMua(rs.getLong("giaMua"));
				product.setGiaBan(rs.getLong("giaBan"));
				product.setNamSanXuat(rs.getInt("namSanXuat"));
				product.setNhaSanXuat(rs.getString("nhaSanXuat"));
				product.setThongTin(rs.getString("thongTinProduct"));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> searchByName(String nameProduct) {
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT *FROM product WHERE nameProduct LIKE ?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setString(1, "%" + nameProduct + "%");
			rs = ppst.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setIdProduct(rs.getInt("idProduct"));
				product.setNameProduct(rs.getString("nameProduct"));
				product.setImage(rs.getString("image"));
				product.setGiaMua(rs.getLong("giaMua"));
				product.setGiaBan(rs.getLong("giaBan"));
				product.setNamSanXuat(rs.getInt("namSanXuat"));
				product.setNhaSanXuat(rs.getString("nhaSanXuat"));
				product.setThongTin(rs.getString("thongTinProduct"));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
