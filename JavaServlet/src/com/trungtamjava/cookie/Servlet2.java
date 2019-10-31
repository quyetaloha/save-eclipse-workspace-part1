package com.trungtamjava.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.client.RequestContext;

@WebServlet(urlPatterns = { "/servlet2" })
public class Servlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter printWriter = resp.getWriter();
	
	Cookie[] cookies=req.getCookies();
	for(Cookie c: cookies) {
		printWriter.println(c.getName()+":"+URLDecoder.decode(c.getValue())+"<br>");
	}
	printWriter.print(cookies.length);

}
}