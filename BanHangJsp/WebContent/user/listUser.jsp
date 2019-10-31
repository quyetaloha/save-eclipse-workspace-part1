<%@page import="com.trungtamjava.service.UserService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.trungtamjava.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/WEB-INF/myTag.tld" prefix="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h:hello message="lap trinh vien">ahihichimchim</h:hello>
	<%
		UserService userService=new UserService();
		List<User> users=userService.getAllUsers();
		request.setAttribute("users", users);
	%>
	
	<table>
		<tr>
			<th>ID</th>
			<th>tên</th>
			<th>tài khoản</th>
			<th>vai trò</th>
			<th>chọn</th>
		</tr>
		
		<c:forEach items="${users }" var="user">
		
		<tr>
			<td>${user.id }></td>
			<td>${user.name }</td>
			<td>${user.username }</td>
			<c:choose>
				<c:when test="${user.role eq 'ROLE_ADMIN' }">
					<td>amdin hệ thống</td>
				</c:when>
				<c:otherwise>
					<td>người dùng</td>
				</c:otherwise>
			</c:choose>
			<td><a href="editUser.jsp?id=${user.id }">edit</a>
				<a href="deleteUser.jsp?id=${user.id }">delete</a>
				<a href="viewUser.jsp?id=${user.id }">view</a>
			</td>
		</tr>
			
		</c:forEach>
		
		
	</table>
	<%
	Cookie cookie=new Cookie("name","trungtamjava");
	cookie.setMaxAge(20);
	response.addCookie(cookie);
	%>
</body>
</html>