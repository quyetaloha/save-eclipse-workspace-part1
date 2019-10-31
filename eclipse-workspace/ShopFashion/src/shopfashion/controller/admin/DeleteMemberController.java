package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.service.UserService;
import shopfashion.service.imp.UserServiceImp;
@WebServlet(urlPatterns= {"/admin/member/delete"})
public class DeleteMemberController extends HttpServlet{
	private UserService userService= new UserServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userService.delete(Integer.parseInt(req.getParameter("idUser")));
		resp.sendRedirect(req.getContextPath()+"/admin/member/list");
	}
}
