package shopfashion.controller;

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

@WebServlet(urlPatterns = { "/dang-ky" })
public class DangKyController extends HttpServlet {
	private UserService userService = new UserServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/dangky.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		if (userService.checkUsername(req.getParameter("username"))) {
			if (req.getParameter("password").equals(req.getParameter("nlpassword"))) {
				user.setUsername(req.getParameter("username"));
				user.setPassword(req.getParameter("password"));
				user.setName(req.getParameter("name"));
				user.setAdd(req.getParameter("add"));
				user.setPhone(req.getParameter("phone"));
				userService.add(user);
				resp.sendRedirect(req.getContextPath() + "/login");
			} else {
				resp.sendRedirect(req.getContextPath() + "/dang-ky");
			}
		} else {
			resp.sendRedirect(req.getContextPath() + "/dang-ky");
		}
	}
}
