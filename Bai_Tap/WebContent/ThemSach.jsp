<%@page import="com.example.hoangxuanquyet.SachStoreDB"%>
<%@page import="com.example.hoangxuanquyet.Sach"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Edit Product</title>
</head>
<body style="background-color: #E0F8F7 ;">
<form action="ThemSach">
<div align="center">
	 <h1>Thêm Sách</h1>
	 <table>
	 <tr>
	 <td>Mã Sách</td>
	 <td><input type="text" name="maSach"/></td>
	 </tr>
	 <tr>
	 <td>Tên Sách</td>
	 <td><input type="text" name="tenSach"/></td>
	 </tr>
	 <tr>
	 <td>Thể loại</td>
	 <td><input type="text" name="theLoai" /></td>
	 </tr>
	 <tr>
	 <td>Nhà Xuất Bản</td>
	 <td><input type="text" name="nhaXuatBan" /></td>
	 </tr>
	  <tr>
	 <td>Giá</td>
	 <td><input type="text" name="gia"/></td>
	 </tr>
	 <tr>
	 
	 <td colspan="2" align="right">
	 <button type="submit" name="submit">Update</button>
	 <button type="reset" name="reset">Reset</button>
	 </td>
	 </tr>
	 </table>
</div>
</form>
</body>
</html>
