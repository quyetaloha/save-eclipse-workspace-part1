package shopfashion.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.model.DanhMuc;
import shopfashion.model.Product;
import shopfashion.service.imp.DanhMucServiceImp;

@WebServlet(urlPatterns= {"/admin/danh-muc/add"})
public class AddDanhMucController extends HttpServlet {
	private DanhMucServiceImp danhMucService = new DanhMucServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/addDanhMuc.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DanhMuc danhMuc = new DanhMuc();
		danhMuc.setNameDanhMuc(req.getParameter("nameDanhMuc"));
		danhMucService.add(danhMuc);
		resp.sendRedirect(req.getContextPath()+"/admin/danh-muc/list");
	}
}
