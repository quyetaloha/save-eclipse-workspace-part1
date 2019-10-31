package shopfashion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shopfashion.model.User;
import shopfashion.service.UserService;
import shopfashion.service.imp.UserServiceImp;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private UserService userService = new UserServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/login.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = userService.getByUsernamePassword(username, password);
		if (user == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			if (user.getType() == 1) {
				resp.sendRedirect(req.getContextPath() + "/admin/home");
			} else {
				resp.sendRedirect(req.getContextPath() + "/home-shop");
			}
		}
	}
}
