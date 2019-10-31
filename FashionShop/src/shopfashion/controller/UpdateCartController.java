package shopfashion.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shopfashion.model.CartItem;

@WebServlet(urlPatterns = { "/update-cart" })
public class UpdateCartController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productId = req.getParameter("idProduct");// product id
		String quantity = req.getParameter("quantity");// product id
		// them vao session
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("carts");
		if (obj != null) {
			// ep kieu doi tuong sang List
			List<CartItem> carts = (List<CartItem>) obj;
			// tim trong list xem co thang product hay chua
			if (Integer.parseInt(quantity) != 0) {
				for (CartItem cartItem : carts) {
					if (cartItem.getIdProduct() == Integer.valueOf(productId)) {
						cartItem.setQuantity(Integer.parseInt(quantity));
						break;
					}
				}
			}

			session.setAttribute("carts", carts);
		}
		// end
		resp.sendRedirect(req.getContextPath() + "/cart-item");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
