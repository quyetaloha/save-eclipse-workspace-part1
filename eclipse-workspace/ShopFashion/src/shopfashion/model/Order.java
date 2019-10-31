package shopfashion.model;

import java.util.List;

public class Order {
	private int idOrder;
	private int idUser;
	private List<CartItem> listCartItem;

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public List<CartItem> getListCartItem() {
		return listCartItem;
	}

	public void setListCartItem(List<CartItem> listCartItem) {
		this.listCartItem = listCartItem;
	}

}
