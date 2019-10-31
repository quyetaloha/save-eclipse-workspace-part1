package shopfashion.model;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable{
	private int idProduct;
	private List<DanhMuc> listDanhMuc;
	private String nameProduct;
	private String image;
	private long giaMua;
	private long giaBan;
	private int namSanXuat;
	private String nhaSanXuat;
	private String thongTin;

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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

	public long getGiaMua() {
		return giaMua;
	}

	public void setGiaMua(long giaMua) {
		this.giaMua = giaMua;
	}

	public long getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}

	public List<DanhMuc> getListDanhMuc() {
		return listDanhMuc;
	}

	public void setListDanhMuc(List<DanhMuc> listDanhMuc) {
		this.listDanhMuc = listDanhMuc;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public String getThongTin() {
		return thongTin;
	}

	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	
}
