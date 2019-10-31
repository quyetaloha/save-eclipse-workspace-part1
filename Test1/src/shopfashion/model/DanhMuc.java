package shopfashion.model;

import java.io.Serializable;
import java.util.List;

public class DanhMuc implements Serializable{
	private int idDanhMuc;
	private String nameDanhMuc;
	private List<Product> dsProduct;

	public int getIdDanhMuc() {
		return idDanhMuc;
	}

	public void setIdDanhMuc(int idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}

	public String getNameDanhMuc() {
		return nameDanhMuc;
	}

	public void setNameDanhMuc(String nameDanhMuc) {
		this.nameDanhMuc = nameDanhMuc;
	}

	public List<Product> getDsProduct() {
		return dsProduct;
	}

	public void setDsProduct(List<Product> dsProduct) {
		this.dsProduct = dsProduct;
	}

}
