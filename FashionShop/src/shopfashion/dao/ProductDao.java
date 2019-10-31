package shopfashion.dao;

import java.util.List;

import shopfashion.model.Product;

public interface ProductDao {
	void add(Product product);
	void edit(Product product);
	void delete(int idProduct);
	Product getById(int idProduct);
	List<Product> getAll();
	List<Product> searchByName(String nameProduct);
}
