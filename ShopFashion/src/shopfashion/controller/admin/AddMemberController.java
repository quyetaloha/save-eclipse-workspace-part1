package shopfashion.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopfashion.model.User;
import shopfashion.service.UserService;
import shopfashion.service.imp.UserServiceImp;

@WebServlet(urlPatterns = { "/admin/member/add" })
public class AddMemberController extends HttpServlet{
	private UserService userService = new UserServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/addMember.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		user.setName(req.getParameter("name"));
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setAdd(req.getParameter("add"));
		user.setPhone(req.getParameter("phone"));
		if (req.getParameter("type").equals("Admin")) {
			user.setType(1);
		} else {
			user.setType(0);
		}
		userService.add(user);
		resp.sendRedirect(req.getContextPath() + "/admin/member/list");
	}
}
