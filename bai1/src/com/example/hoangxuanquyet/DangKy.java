package com.example.hoangxuanquyet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DangKy
 */
@WebServlet("/DangKy")
public class DangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hihi");
		// TODO Auto-generated method stub
		 PrintWriter print= response.getWriter();
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 String password2 = request.getParameter("repassword");
		 System.out.println(password);
		 System.out.println(password2);
		 if(!password.equals(password2)) {
			 print.println("<script>  alert('mat khau nhap lai khong chinh xac!') </script>");
			 return;
		 }
		 SachStoreDB db = new SachStoreDB();

			try {
				if(db.insertTaiKhoan(username, password)) {
					print.println("<script>  alert('dang ky thanh cong!') </script>");
					response.sendRedirect("DangNhap.jsp");
				}
				else {
					print.println("<script>  alert('something wrong!') </script>");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			
	}

}
