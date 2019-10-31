package com.trungtamjava.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/wellcome-session"})
public class WellcomeSession extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		String name="";
		HttpSession httpSession=req.getSession();
		Object object=httpSession.getAttribute("username");
		if(object!=null) {
			name=String.valueOf(object);
		}
		else {
			resp.sendRedirect("/JavaServlet/session-login");
		}
		printWriter.println("xin chao "+ name+"<br>");
		printWriter.println("<a href='/JavaServlet/logout'>logout</a>");
	}
	
}
