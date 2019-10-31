package shopfashion.service;

import java.util.List;

import shopfashion.model.Product;

public interface ProductService {
	void add(Product product);
	void edit(Product product);
	void delete(int idProduct);
	Product getById(int idProduct);
	List<Product> getAll();
	List<Product> searchByName(String nameProduct);
}
