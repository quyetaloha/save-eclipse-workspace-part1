<%@page import="com.trungtamjava.service.UserService"%>
<%@page import="com.trungtamjava.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String about=request.getParameter("about");
		String role=request.getParameter("role");
		String[] favourites=request.getParameterValues("favourites");
		String fav="";
		for(String s:favourites){
			fav+=s+" ";
		}
		User user=new User();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAbout(about);
		user.setRole(role);
		user.setFavourites(fav);
		UserService userService=new UserService();
		userService.addUser(user);
%>
	<c:url value="listUser.jsp" var="url"></c:url>
	<c:redirect url="${url }"></c:redirect>