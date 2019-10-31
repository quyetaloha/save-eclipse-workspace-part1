<%@page import="com.example.hoangxuanquyet.SachStoreDB"%>
<%@page import="com.example.hoangxuanquyet.Sach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product Information</title>
</head>
<body style="background-color: #E0F8F7">
 <% ArrayList<Sach> lst = new SachStoreDB().getAllSach(); %>
 <h1 align="center">Danh sách Sách</h1>
 <table border="4" width="80%" align="center" bordercolor="red">
 <tr>
 <th>Mã Sách</th>
 <th>Tên Sách</th>
 <th>Thể loại</th>
 <th>Nhà xuất bản</th>
 <th>Giá</th>
 </tr>
 <%
 for(Sach sp : lst){
 %>
 <tr align="center">
 <td><%=sp.getMaSach() %></td>
 <td><%=sp.getTenSach() %></td>
 <td><%=sp.getTheLoai() %></td>
 <td><%=sp.getNhaXuatBan() %></td>
 <td><%=sp.getGia() %></td>
 </tr>
 <%
 }
 %>
 </table>
</body>
</html>
