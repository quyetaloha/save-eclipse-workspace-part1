package shopfashion.service;

import java.util.List;

import shopfashion.model.DanhMuc;

public interface DanhMucService {
	void add(DanhMuc danhMuc);
	void edit(DanhMuc danhMuc);
	void delete(int idDanhMuc);
	DanhMuc getByIdDanhMuc(int idDanhMuc);
	List<DanhMuc> getAll();
	List<DanhMuc> searchByNameDanhMuc(String nameDanhMuc);
}
