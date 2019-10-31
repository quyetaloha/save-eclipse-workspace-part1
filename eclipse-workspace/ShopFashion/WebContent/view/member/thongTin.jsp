<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin cá nhân</title>
</head>
<body>
	<jsp:include page="/view/giaodien/header.jsp"></jsp:include>
	<jsp:include page="/view/giaodien/banner.jsp"></jsp:include>
	<div>
		<table>
			<tr>
				<td>Họ tên:</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>Tên  tài khoản:</td>
				<td>${user.username}</td>
			</tr>
			<tr>
				<td>Mật khẩu:</td>
				<td>${user.password}</td>
			</tr>
			<tr>
				<td>Địa chỉ:</td>
				<td>${user.add}</td>
			</tr>
			<tr>
				<td>Số điện thoại:</td>
				<td>${user.phone}</td>
			</tr>
		</table>
	</div>
	
	<jsp:include page="/view/giaodien/footer.jsp"></jsp:include>
</body>
</html>