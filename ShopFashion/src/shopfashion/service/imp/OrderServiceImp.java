package shopfashion.service.imp;

import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.CartItemDao;
import shopfashion.dao.OrderDao;
import shopfashion.dao.impl.CartItemDaoImp;
import shopfashion.dao.impl.OrderDaoImp;
import shopfashion.model.CartItem;
import shopfashion.model.Order;
import shopfashion.service.OrderService;

public class OrderServiceImp implements OrderService {
	private OrderDao orderDao = new OrderDaoImp();
	private CartItemDao cartItemDao = new CartItemDaoImp();

	@Override
	public void add(Order order) {
		orderDao.add(order);
		for (CartItem cartItem : order.getListCartItem()) {
			cartItem.setIdOrder(order.getIdOrder());
			cartItemDao.add(cartItem);
		}
	}

	@Override
	public void edit(Order order) {
		orderDao.edit(order);
		for (CartItem cartItem : order.getListCartItem()) {
			cartItem.setIdOrder(order.getIdOrder());
			cartItemDao.add(cartItem);
		}
	}

	@Override
	public void delete(int idOrder) {
		cartItemDao.deleteByIdOrder(idOrder);
		orderDao.delete(idOrder);
	}

	@Override
	public Order getById(int idOrder) {
		Order order = orderDao.getById(idOrder);
		order.setListCartItem(cartItemDao.getByIdOrder(idOrder));
		return order;
	}

	@Override
	public List<Order> getAll() {
		List<Order> list = new ArrayList<Order>();
		for (Order order : orderDao.getAll()) {
			order.setListCartItem(cartItemDao.getByIdOrder(order.getIdOrder()));
			list.add(order);
		}

		return list;
	}

}
