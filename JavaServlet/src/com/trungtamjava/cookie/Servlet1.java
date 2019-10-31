package com.trungtamjava.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet1" })
public class Servlet1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter printWriter = resp.getWriter();
	printWriter.print(" xin chao trung tam java 1");
	
//	Cookie cookie=new Cookie("name", "trung%20tam%20java");
	Cookie cookie=new Cookie("name", URLEncoder.encode("trung tam java","UTF-8"));
	
	cookie.setMaxAge(100);

	resp.addCookie(cookie);
	Cookie cookie2=new Cookie("age", "10");
	cookie2.setMaxAge(20);
	resp.addCookie(cookie2);
}
}