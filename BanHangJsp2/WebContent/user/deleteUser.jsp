<%@page import="com.trungtamjava.model.User"%>
<%@page import="com.trungtamjava.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id=request.getParameter("id");
	UserService userService=new UserService();
	userService.deleteUser(Integer.valueOf(id));
	response.sendRedirect("/BanHangJsp/user/listUser.jsp");
%>