package com.example.hoangxuanquyet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DangNhap
 */
@WebServlet("/DangNhap")
public class DangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter print= response.getWriter();
//		 String account = request.getParameter("account");
//		 String password = request.getParameter("password");
//		 
//		 String tk=account+password;
//		 SachStoreDB db = new SachStoreDB();
//		 ArrayList<String> tkDaTa=new ArrayList<String>();
//		 int xet=0;
//		 try {
//			tkDaTa=db.getAllTaiKhoan();
//			for(String s:tkDaTa) {
//				if(s.equals(tk)) {
//					xet=1;break;
//				}
//			}
//			System.out.println(xet);
//			for(String s:tkDaTa) {
//				System.out.println(s);
//			}
//			if(xet==1) {
//				response.sendRedirect("option.jsp");
//			}
//			else {
//				print.println("<script>  alert('account or password is not correct!') </script>");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 try {
//		 if(db.insertNew(sp))
//		 response.sendRedirect("index.jsp");
//		 else
//		 response.sendRedirect("error.jsp");
//		 } catch (Exception e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		 PrintWriter print= response.getWriter();
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
//		 String tk=account+password;
//		 System.out.println("taikhoan:"+tk);
		 SachStoreDB db = new SachStoreDB();
//		 ArrayList<String> tkDaTa=new ArrayList<String>();
//		 int xet=0;
		 try {
			
			if(db.checkLogin(username, password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser",false);
				response.sendRedirect("option.jsp");
			}
			else {
				response.sendRedirect("invalidLogin.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
