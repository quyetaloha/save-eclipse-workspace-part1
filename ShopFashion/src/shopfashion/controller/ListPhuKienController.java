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
import shopfashion.service.DanhMucService;
import shopfashion.service.imp.DanhMucServiceImp;

@WebServlet(urlPatterns = { "/product/phu-kien" })
public class ListPhuKienController extends HttpServlet {
	private DanhMucSanPhamDao danhMucDao = new DanhMucSanPhamDaoImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listProduct", danhMucDao.getByProduct(3));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/listPhuKien.jsp");
		requestDispatcher.forward(req, resp);
	}
}
