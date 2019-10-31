package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns= {"/test-config"},initParams= {
//		@WebInitParam(name="name",value="trung tam java"),
//		@WebInitParam(name="name2",value="trung tam java2")
//})
public class ServletConfigDemo extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=super.getServletConfig().getInitParameter("name");
	resp.setContentType("text/html");
	PrintWriter printWriter=resp.getWriter();
	printWriter.println("xin chao "+name);
	printWriter.println(getServletConfig().getServletName());
}
}
