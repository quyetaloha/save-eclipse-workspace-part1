package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.DanhMucDao;
import shopfashion.dao.DanhMucSanPhamDao;
import shopfashion.dao.ProductDao;
import shopfashion.model.DanhMuc;
import shopfashion.model.Product;

public class DanhMucSanPhamDaoImp extends RootDao implements DanhMucSanPhamDao {
	private PreparedStatement ppst;
	private ResultSet rs;
	@Override
	public void add(int idDanhMuc, int idProduct) {
		String sql = "INSERT INTO danhmucsanpham(`idDanhMuc`, `idProduct`) VALUES(?,?);";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			ppst.setInt(2, idProduct);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idDanhMuc, int idProduct) {
		String sql = "DELETE FROM danhmucsanpham WHERE `idDanhMuc`=?, `idProduct`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			ppst.setInt(2, idProduct);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDanhMuc(int idDanhMuc) {
		String sql = "DELETE FROM danhmucsanpham WHERE `idDanhMuc`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int idProduct) {
		String sql = "DELETE FROM danhmucsanpham WHERE `idProduct`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idProduct);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<DanhMuc> getByDanhMuc(int idProduct) {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "SELECT * FROM danhmucsanpham WHERE `idProduct`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idProduct);
			rs = ppst.executeQuery();
			while (rs.next()) {
				DanhMucDao danhMucDao = new DanhMucDaoImp();
				DanhMuc danhMuc = danhMucDao.getByIdDanhMuc(rs.getInt("idDanhMuc"));
				list.add(danhMuc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> getByProduct(int idDanhMuc) {
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT *FROM danhmucsanpham WHERE `idDanhMuc`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			rs = ppst.executeQuery();
			while (rs.next()) {
				ProductDao productDao = new ProductDaoImp();
				Product product = productDao.getById(rs.getInt("idProduct"));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
