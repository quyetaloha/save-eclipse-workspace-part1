package shopfashion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.dao.DanhMucSanPhamDao;
import shopfashion.dao.impl.DanhMucSanPhamDaoImp;
@WebServlet(urlPatterns= {"/product/thoi-trang-nu"})
public class ListThoiTrangNuController extends HttpServlet{
	private DanhMucSanPhamDao danhMucDao = new DanhMucSanPhamDaoImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listProduct", danhMucDao.getByProduct(2));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/listThoiTrangNu.jsp");
		requestDispatcher.forward(req, resp);
	}
}
