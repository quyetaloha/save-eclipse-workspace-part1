<%@page import="java.util.Date"%>
<%@page import="com.trungtamjava.model.User"%>
<%@page import="com.trungtamjava.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		//request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		UserService userService=new UserService();
		User user=userService.getUserById(Integer.valueOf(id));
		request.setAttribute("user", user);
	%>
	${param["id"]}
	<c:set value="quyết đai k" var="quyet"></c:set>
	<c:set value="<%=new Date() %>" var="now"></c:set>
	<p>${quyet }</p>
	<p><fmt:formatDate value="${now }" type="time"/></p>
	<p><fmt:formatDate value="${now }" type="date"/></p>
	<p><fmt:formatDate value="${now }" pattern="dd/MM/yyy hh:mm"/></p>
	<p>${fn:contains("user.name","u")?"dung":"sai" }</p>
	<table>
		<tr>
			<td>tên</td>
			<td>${user.name }</td>
		</tr>
		<tr>
			<td>mật khẩu</td>
			<td>${user.password }</td>
		</tr>
		<tr>
			<td>điện thoại</td>
			<td>
				<c:out value="${user.phone }"></c:out>
			</td>
		</tr>
		<tr>
			<td>thông tin</td>
			<td>${user.about }</td>
		</tr>
		<tr>
			<td>sở thích</td>
			<td>${user.favourites}</td>
		</tr>
		<tr>
			<td>Vai trò</td>
			<c:choose>
				<c:when test="${user.role eq 'ROLE_ADMIN' }">
					<td>amdin hệ thống</td>
				</c:when>
				<c:otherwise>
					<td>người dùng</td>
				</c:otherwise>
			</c:choose>
			
				
		</tr>
	</table>
</body>
</html>