package shopfashion.controller.member;

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

@WebServlet(urlPatterns = { "/member/update-thong-tin" })
public class UpdateThongTinController extends HttpServlet {
	private UserService userService = new UserServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/member/updateThongTin.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if (req.getParameter("password1").equals(user.getPassword())) {
			if (req.getParameter("passwrod2").equals(req.getParameter("password3"))) {
				user.setName(req.getParameter("name"));
				user.setPassword(req.getParameter("password2"));
				user.setAdd(req.getParameter("add"));
				user.setPhone(req.getParameter("phone"));
				userService.edit(user);
				resp.sendRedirect(req.getContextPath() + "/member/thong-tin");
			} else {
				doGet(req, resp);
			}
		} else {
			doGet(req, resp);
		}
	}
}
