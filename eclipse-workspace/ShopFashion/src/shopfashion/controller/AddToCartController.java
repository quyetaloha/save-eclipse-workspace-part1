package shopfashion.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shopfashion.dao.ProductDao;
import shopfashion.dao.impl.ProductDaoImp;
import shopfashion.model.CartItem;
import shopfashion.model.Product;

@WebServlet(urlPatterns = { "/add-cart" })
public class AddToCartController extends HttpServlet {
	private ProductDao productDao = new ProductDaoImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idProduct = req.getParameter("idProduct");
		Product product = productDao.getById(Integer.parseInt(idProduct));
		HttpSession session = req.getSession();
		Object obj = session.getAttribute("carts");
		if (obj == null) {
			CartItem cartItem = new CartItem();
			cartItem.setIdProduct(Integer.parseInt(idProduct));
			cartItem.setNameProduct(product.getNameProduct());
			cartItem.setImage(product.getImage());
			cartItem.setQuantity(1);
			cartItem.setUnitPrice(product.getGiaBan());

			List<CartItem> carts = new ArrayList<CartItem>();
			carts.add(cartItem);

			session.setAttribute("carts", carts);
		} else {
			List<CartItem> carts = (List<CartItem>) obj;
			// kiem tra xem product xem da co trong cart chua, neu co thi tang so luong,
			// chua co thi tao moi cartItem.
			boolean checkProduct = true;// gia su chua co product
			for (CartItem cartItem : carts) {
				if (cartItem.getIdProduct() == Integer.parseInt(idProduct)) {
					cartItem.setQuantity(cartItem.getQuantity() + 1);
					checkProduct = false;// da co product trong carts
					break;
				}
			}
			if (checkProduct) {
				CartItem cartItem = new CartItem();
				cartItem.setIdProduct(Integer.parseInt(idProduct));
				cartItem.setNameProduct(product.getNameProduct());
				cartItem.setImage(product.getImage());
				cartItem.setQuantity(1);
				cartItem.setUnitPrice(product.getGiaBan());

				carts.add(cartItem);
			}
			session.setAttribute("carts", carts);
		}
		resp.sendRedirect(req.getContextPath() + "/cart-item");
	}
}
