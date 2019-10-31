<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setContentType("text/html;charset=UTF-8");
%>
	<h1>${cookie.name.value}</h1>
	<form action="addUserPost.jsp" method="get">
		<input name="name" type="text" placeholder="ten người dùng"><br>
		<input name="username" type="text" placeholder="tên tài khoản"><br>
		<input name="password" type="password" placeholder="mật khẩu người dùng"><br>
		<input name="phone" type="text" placeholder="điện thoại"><br>
		<textarea rows="3" cols="20" name="about" placeholder="giới thiệu"></textarea><br>
		
		<input name="role" type="radio" value="ROLE_ADMIN">admin
		<input name="role" type="radio" value="ROLE_USER">người dùng
		<input name="favourites" type="checkbox" value="xem phim">xem phim
		<input name="favourites" type="checkbox" value="nghe nhac">nghe nhac
		<input type="submit" value="thêm">
	</form>
</body>
</html>