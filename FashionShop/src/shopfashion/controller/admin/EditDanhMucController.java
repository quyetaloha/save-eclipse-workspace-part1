package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.model.DanhMuc;
import shopfashion.service.DanhMucService;
import shopfashion.service.imp.DanhMucServiceImp;
@WebServlet(urlPatterns= {"/admin/danh-muc/edit"})
public class EditDanhMucController extends HttpServlet{
	private DanhMucService danhMucService = new DanhMucServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("danhMuc", danhMucService.getByIdDanhMuc(Integer.parseInt(req.getParameter("idDanhMuc"))));
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/editDanhMuc.jsp");
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DanhMuc danhMuc = danhMucService.getByIdDanhMuc(Integer.parseInt(req.getParameter("idDanhMuc")));
		danhMuc.setNameDanhMuc(req.getParameter("nameDanhMuc"));
		danhMucService.edit(danhMuc);
		resp.sendRedirect(req.getContextPath()+"/admin/danh-muc/list");
	}
}
