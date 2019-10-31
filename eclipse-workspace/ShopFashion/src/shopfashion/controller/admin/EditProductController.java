package shopfashion.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import shopfashion.model.DanhMuc;
import shopfashion.model.Product;
import shopfashion.service.DanhMucService;
import shopfashion.service.ProductService;
import shopfashion.service.imp.DanhMucServiceImp;
import shopfashion.service.imp.ProductServiceImp;

@WebServlet(urlPatterns = { "/admin/product/edit" })
public class EditProductController extends HttpServlet {
	private ProductService productService = new ProductServiceImp();
	private DanhMucService danhMucService = new DanhMucServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product product = productService.getById(Integer.parseInt(req.getParameter("idProduct")));
		List<DanhMuc> listDanhMuc = danhMucService.getAll();
		req.setAttribute("product", product);
		req.setAttribute("listDanhMuc", listDanhMuc);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/admin/editProduct.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product product = new Product();
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		diskFileItemFactory
				.setRepository(new File("C:\\Users\\LuongChinh\\eclipse-workspace\\ShopFashion\\WebContent\\META-INF"));

		ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
		try {
			List<FileItem> fileItems = fileUpload.parseRequest(req);
			List<DanhMuc> list = new ArrayList<DanhMuc>();
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {
					if (fileItem.getFieldName().equals("fileImage")) {
						if(fileItem.getString().length()!=0) {
						File file = new File(
								"C:\\Users\\LuongChinh\\eclipse-workspace\\ShopFashion\\WebContent\\static\\images\\"
										+ fileItem.getName());
						fileItem.write(file);
						product.setImage("/ShopFashion/static/images/" + fileItem.getName());
						}
					}
				} else {
					if (fileItem.getFieldName().equals("nameProduct")) {
						product.setNameProduct(fileItem.getString());
					}
					if (fileItem.getFieldName().equals("giaMua")) {
						product.setGiaMua(Long.parseLong(fileItem.getString()));
					}
					if (fileItem.getFieldName().equals("giaBan")) {
						product.setGiaBan(Long.parseLong(fileItem.getString()));
					}
					if (fileItem.getFieldName().equals("nameProduct")) {
						product.setNameProduct(fileItem.getString());
					}
					if (fileItem.getFieldName().equals("nhaSanXuat")) {
						product.setNhaSanXuat(fileItem.getString());
					}
					if (fileItem.getFieldName().equals("thongTin")) {
						product.setThongTin(fileItem.getString());
					}
					if (fileItem.getFieldName().equals("namSanXuat")) {
						product.setNamSanXuat(Integer.parseInt(fileItem.getString()));
					}
					if (fileItem.getFieldName().equals("danhMuc")) {
						String id = fileItem.getString();
						String[] ids = id.split(" ");
						for (String s : ids) {
							list.add(danhMucService.getByIdDanhMuc(Integer.parseInt(s)));
						}
						product.setListDanhMuc(list);
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		productService.edit(product);
		resp.sendRedirect(req.getContextPath() + "/admin/product/list");
	}
}
