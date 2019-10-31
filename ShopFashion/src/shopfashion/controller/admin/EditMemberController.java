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

@WebServlet(urlPatterns = { "/admin/member/edit" })
public class EditMemberController extends HttpServlet {
	private UserService userService = new UserServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = userService.getByIdUser(Integer.parseInt(req.getParameter("idUser")));
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/editMember.jsp");
		requestDispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		user.setIdUser(Integer.parseInt(req.getParameter("idUser")));
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setName(req.getParameter("name"));
		user.setAdd(req.getParameter("add"));
		user.setPhone(req.getParameter("phone"));
		if (req.getParameter("type").equals("Admin")) {
			user.setType(1);
		} else {
			user.setType(0);
		}
		userService.edit(user);
		resp.sendRedirect(req.getContextPath() + "/admin/member/list");
	}
}
