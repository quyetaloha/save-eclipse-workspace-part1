package com.example.hoangxuanquyet;

public class Sach {
	private String maSach;
	private String tenSach;
	private String theLoai;
	private String nhaXuatBan;
	private int gia;
	public Sach(String maSach,String tenSach,String theLoai,String nhaXuatBan,int gia) {
		this.maSach = maSach;
		 this.tenSach = tenSach;
		 this.theLoai = theLoai;
		 this.nhaXuatBan = nhaXuatBan;
		 this.gia=gia;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
}
