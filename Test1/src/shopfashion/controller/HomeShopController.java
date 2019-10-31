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
import shopfashion.service.ProductService;
import shopfashion.service.imp.ProductServiceImp;

@WebServlet(urlPatterns = { "/home-shop" })
public class HomeShopController extends HttpServlet {
	private ProductService productService = new ProductServiceImp();
	private DanhMucSanPhamDao danhMucDao = new DanhMucSanPhamDaoImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listHai", danhMucDao.getByProduct(1));
		req.setAttribute("listMot", danhMucDao.getByProduct(2));
		req.setAttribute("listBon", danhMucDao.getByProduct(3));
		req.setAttribute("listBa", danhMucDao.getByProduct(4));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/homeShop.jsp");
		requestDispatcher.forward(req, resp);
	}
}
