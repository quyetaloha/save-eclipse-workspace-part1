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
@WebServlet(urlPatterns= {"/member/thong-tin"})
public class ViewThongTinController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user=(User) session.getAttribute("user");
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/member/thongTin.jsp");
		requestDispatcher.forward(req, resp);
	}
}
