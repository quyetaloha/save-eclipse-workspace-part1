<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.sym"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="user/profile.jsp?id=11&name=trung tam java">Thông tin người dùng</a>
<%
	int x=10;
	int y=15;
	int z=x+y;
	System.out.print(request.getHeader("Location"));
%>
<h1><%= z %></h1>
</body>
</html>