package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.service.DanhMucService;
import shopfashion.service.imp.DanhMucServiceImp;
@WebServlet(urlPatterns= {"/admin/danh-muc/delete"})
public class DeleteDanhMucController extends HttpServlet{
	private DanhMucService danhMucService = new DanhMucServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		danhMucService.delete(Integer.parseInt(req.getParameter("idDanhMuc")));
		resp.sendRedirect(req.getContextPath()+"/admin/danh-muc/list");
	}
}
