package shopfashion.service;

import java.util.List;

import shopfashion.model.Order;

public interface OrderService {
	void add(Order order);

	void edit(Order order);

	void delete(int idOrder);

	Order getById(int idOrder);

	List<Order> getAll();
}
