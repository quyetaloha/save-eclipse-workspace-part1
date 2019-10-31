package shopfashion.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shopfashion.model.CartItem;
import shopfashion.model.Order;
import shopfashion.model.User;
import shopfashion.service.OrderService;
import shopfashion.service.imp.OrderServiceImp;

@WebServlet(urlPatterns = { "/member/make-order" })
public class MakeOrderController extends HttpServlet {
	private OrderService orderService = new OrderServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("carts");
		if (obj != null) {
			// nguoi dung hien tai
			User user = (User) session.getAttribute("user");
			// ep kieu doi tuong sang List
			List<CartItem> carts = (List<CartItem>) obj;

			Order order = new Order();
			order.setIdUser(user.getIdUser());
			order.setListCartItem(carts);

			orderService.add(order);
			
			session.removeAttribute("carts");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/member/orderSumary.jsp");
			req.setAttribute("order", order);
			dispatcher.forward(req, resp);
		}
	}
}
