<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Xin chao trung tâm java</h1>
<% int id= Integer.valueOf(request.getParameter("id")); 
	String name=String.valueOf(request.getParameter("name"));
	
%>
<p>ID cua bạn là <%=id %></p>
<p>tên của bạn là <%=name %></p>
<a href="/HelloJSP/user/logout.jsp">logout</a>
</body>
</html>