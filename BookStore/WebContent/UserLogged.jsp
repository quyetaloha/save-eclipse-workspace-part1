<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="DAO.UserBean"
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));%>

		Welcome
		<%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
</body>
</html>