package com.example.hoangxuanquyet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CapNhatSach
 */
@WebServlet("/ThemSach")
public class ThemSach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemSach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String maSach = request.getParameter("maSach");
		 String tenSach = request.getParameter("tenSach");
		 String theLoai = request.getParameter("theLoai");
		 String nhaXuatBan = request.getParameter("nhaXuatBan");
		 int gia = Integer.parseInt(request.getParameter("gia"));
		 
		 Sach sp = new Sach(maSach, tenSach, theLoai, nhaXuatBan, gia);
		 SachStoreDB db = new SachStoreDB();
		 PrintWriter print=response.getWriter();
		 try {
			 if(db.insertSach(sp)) {
				 
			 	 print.println("<script>  alert('successfully') </script>");
			 }
			 else
				 print.println("error");
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
