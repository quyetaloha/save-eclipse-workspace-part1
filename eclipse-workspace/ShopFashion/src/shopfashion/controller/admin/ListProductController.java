package shopfashion.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.model.Product;
import shopfashion.service.ProductService;
import shopfashion.service.imp.ProductServiceImp;

@WebServlet(urlPatterns = { "/admin/product/list" })
public class ListProductController extends HttpServlet {
	private ProductService productService = new ProductServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> listProduct = productService.getAll();
		req.setAttribute("listProduct", listProduct);	
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/listProduct.jsp");
		requestDispatcher.forward(req, resp);
	}
}
