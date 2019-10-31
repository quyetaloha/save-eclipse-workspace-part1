package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/form-login"})
public class FormLogin extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter printWriter=resp.getWriter();
	resp.setContentType("text/html");
	printWriter.println("<form action='/HelloServlet/login' method='post'>");
	printWriter.println("<input type='text' name='user'>");
	printWriter.println("<input type='submit' value='submit'/>");
	printWriter.println("</form>");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
