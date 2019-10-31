package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.dao.ProductDao;
import shopfashion.dao.impl.ProductDaoImp;
import shopfashion.service.ProductService;
import shopfashion.service.imp.ProductServiceImp;

@WebServlet(urlPatterns = { "/admin/product/listDanhMuc" })
public class ViewDanhMucController extends HttpServlet {
	private ProductService productService = new ProductServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("product", productService.getById(Integer.parseInt(req.getParameter("idProduct"))));
		RequestDispatcher requestDispatcher =req.getRequestDispatcher("/view/admin/viewDanhMuc.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}
