package shopfashion.dao;

import java.util.List;

import shopfashion.model.CartItem;

public interface CartItemDao {
	void add(CartItem cartItem);

	void edit(CartItem cartItem);

	void delete(int idCartItem);
	
	void deleteByIdOrder(int idOrder);

	CartItem getById(int idCartItem);

	List<CartItem> getByIdOrder(int idOrder);
	
	List<CartItem> getAll();
	
}
