package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.service.ProductService;
import shopfashion.service.imp.ProductServiceImp;
@WebServlet(urlPatterns= {"/admin/product/delete"})
public class DeletePeoductController extends HttpServlet{
	private ProductService productService = new ProductServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		productService.delete(Integer.parseInt(req.getParameter("idProduct")));
		resp.sendRedirect(req.getContextPath()+"/admin/product/list");
	}
}
