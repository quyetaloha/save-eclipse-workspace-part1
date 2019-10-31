package com.example.hoangxuanquyet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String masp = request.getParameter("masp");
		 ConnectDB connect = new ConnectDB();
		 try {
		 if(connect.deleteProduct(masp))
		 response.sendRedirect("index.jsp");
		 else
		 response.sendRedirect("error.jsp");
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 
		}

}
