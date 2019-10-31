package shopfashion.dao;

import java.util.List;

import shopfashion.model.DanhMuc;

public interface DanhMucDao {
	void add(DanhMuc danhMuc);
	void edit(DanhMuc danhMuc);
	void delete(int idDanhMuc);
	DanhMuc getByIdDanhMuc(int idDanhMuc);
	List<DanhMuc> getAll();
	List<DanhMuc> searchByNameDanhMuc(String nameDanhMuc);
}
