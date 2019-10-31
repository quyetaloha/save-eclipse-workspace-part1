package shopfashion.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.DanhMucDao;
import shopfashion.model.DanhMuc;

public class DanhMucDaoImp extends RootDao implements DanhMucDao {
	private PreparedStatement ppst;
	private ResultSet rs;

	@Override
	public void add(DanhMuc danhMuc) {
		String sql = "INSERT INTO danhmuc(`tenDanhMuc`) VALUES(?);";
		try {
			ppst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ppst.setString(1, danhMuc.getNameDanhMuc());
			ppst.executeUpdate();
			rs = ppst.getGeneratedKeys();
			while(rs.next()) {
				danhMuc.setIdDanhMuc(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void edit(DanhMuc danhMuc) {
		String sql = "UPDATE danhmuc SET `tenDanhMuc`=? WHERE `idDanhMuc`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setString(1, danhMuc.getNameDanhMuc());
			ppst.setInt(2, danhMuc.getIdDanhMuc());
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idDanhMuc) {
		String sql = "DELETE FROM danhmuc WHERE `idDanhMuc`=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			ppst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public DanhMuc getByIdDanhMuc(int idDanhMuc) {
		String sql = "SELECT * FROM danhmuc WHERE idDanhMuc=?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setInt(1, idDanhMuc);
			rs = ppst.executeQuery();
			while (rs.next()) {
				DanhMuc danhMuc = new DanhMuc();
				danhMuc.setNameDanhMuc(rs.getString("tenDanhMuc"));
				danhMuc.setIdDanhMuc(rs.getInt("idDanhMuc"));
				return danhMuc;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<DanhMuc> getAll() {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "SELECT *FROM danhmuc;";
		try {
			ppst = getConnection().prepareStatement(sql);
			rs = ppst.executeQuery();
			while (rs.next()) {
				DanhMuc danhMuc = new DanhMuc();
				danhMuc.setNameDanhMuc(rs.getString("tenDanhMuc"));
				danhMuc.setIdDanhMuc(rs.getInt("idDanhMuc"));
				list.add(danhMuc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<DanhMuc> searchByNameDanhMuc(String nameDanhMuc) {
		List<DanhMuc> list = new ArrayList<DanhMuc>();
		String sql = "SELECT *FROM danhmuc WHERE `tenDanhMuc` LIKE ?;";
		try {
			ppst = getConnection().prepareStatement(sql);
			ppst.setString(1, "%" + nameDanhMuc + "%");
			rs = ppst.executeQuery();
			while (rs.next()) {
				DanhMuc danhMuc = new DanhMuc();
				danhMuc.setNameDanhMuc(rs.getString("tenDanhMuc"));
				danhMuc.setIdDanhMuc(rs.getInt("idDanhMuc"));
				list.add(danhMuc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

}
