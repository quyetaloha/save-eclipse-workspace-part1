package shopfashion.dao;

import java.util.List;

import shopfashion.model.DanhMuc;
import shopfashion.model.Product;

public interface DanhMucSanPhamDao {
	void add(int idDanhMuc, int idProduct);
	void delete(int idDanhMuc, int idProduct);
	void deleteDanhMuc(int idDanhMuc);
	void deleteProduct(int idProduct);
	List<DanhMuc> getByDanhMuc(int idProduct);
	List<Product> getByProduct(int idDanhMuc);
}
