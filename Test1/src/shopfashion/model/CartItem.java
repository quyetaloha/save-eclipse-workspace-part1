package shopfashion.model;

import java.io.Serializable;

public class CartItem implements Serializable {
	private int idCartItem;
	private int idProduct;
	private int idOrder;
	private String nameProduct;
	private String image;
	private int quantity;
	private Long unitPrice;

	public int getIdCartItem() {
		return idCartItem;
	}

	public void setIdCartItem(int idCartItem) {
		this.idCartItem = idCartItem;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

}
