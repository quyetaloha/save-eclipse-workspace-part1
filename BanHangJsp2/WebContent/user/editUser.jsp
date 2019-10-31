<%@page import="com.trungtamjava.model.User"%>
<%@page import="com.trungtamjava.service.UserService"%>
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
	String id=request.getParameter("id");
	UserService userService=new UserService();
	User user=userService.getUserById(Integer.valueOf(id));
	Cookie[] cookies=request.getCookies();
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("name")){
			%>
			<h2><%=cookie.getValue()%></h2>
	<%
	}}
	%>
	<h2>Sửa thông tin người dùng</h2>
	<form action="editUserPost.jsp" method="get">
		<input name="id" value="<%=id %>" type="hidden">
		<input name="name" type="text" placeholder="ten người dùng" value="<%=user.getName() %>"><br>
		<input name="username" type="text" placeholder="tên tài khoản" value="<%=user.getUsername() %>"><br>
		<input name="password" type="password" placeholder="mật khẩu người dùng" value="<%=user.getPassword() %>"><br>
		<input name="phone" type="text" placeholder="điện thoại" value="<%=user.getPhone() %>"><br>
		<textarea rows="3" cols="20" name="about" placeholder="giới thiệu"> <%=user.getAbout() %></textarea><br>
		<%if(user.getRole().equals("ROLE_ADMIN")){ %>
			<input name="role" type="radio" value="ROLE_ADMIN" checked="checked">admin
			<input name="role" type="radio" value="ROLE_USER">người dùng
		<%} else{ %>
			<input name="role" type="radio" value="ROLE_ADMIN">admin
			<input name="role" type="radio" value="ROLE_USER" checked="checked">người dùng
		<%} %>
		
		<%if(user.getFavourites().contains("xem phim")){ %>
			<input name="favourites" type="checkbox" value="xem phim" checked="checked">xem phim
		<%} else{ %>
			<input name="favourites" type="checkbox" value="xem phim">xem phim
		<%} %>
		
		<%if(user.getFavourites().contains("xem phim")){ %>
			<input name="favourites" type="checkbox" value="nghe nhac" checked="checked">nghe nhac
		<%} else{ %>
			<input name="favourites" type="checkbox" value="nghe nhac">nghe nhac
		<%} %>
		
		<input type="submit" value="sửa">
	</form>
</body>
</html>