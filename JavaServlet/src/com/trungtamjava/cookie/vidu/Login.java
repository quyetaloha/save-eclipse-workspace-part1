package com.trungtamjava.cookie.vidu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/login"})
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("<form action='/JavaServlet/login' method='post'>");
		printWriter.println("username:<input type='text' name='username'/>");
		printWriter.println("password:<input type='text' name='password'/>");
		printWriter.println("<input type='submit' value='submit'/>");
		printWriter.println("</form>");
		printWriter.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		if(username.equals("trungtamjava")&&password.equals("123456")) {
			Cookie cookie=new Cookie("username", username);
			cookie.setMaxAge(30);
			resp.addCookie(cookie);
			resp.sendRedirect("/JavaServlet/wellcome");
		}
		else {
			resp.sendRedirect("/JavaServlet/login");
		}
	}
}
