package shopfashion.service.imp;

import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.DanhMucSanPhamDao;
import shopfashion.dao.ProductDao;
import shopfashion.dao.impl.DanhMucSanPhamDaoImp;
import shopfashion.dao.impl.ProductDaoImp;
import shopfashion.model.DanhMuc;
import shopfashion.model.Product;
import shopfashion.service.ProductService;

public class ProductServiceImp implements ProductService {
	private ProductDao productDao = new ProductDaoImp();
	private DanhMucSanPhamDao danhMucSanPhamDao = new DanhMucSanPhamDaoImp();

	@Override
	public void add(Product product) {
		productDao.add(product);
		for (DanhMuc danhMuc : product.getListDanhMuc()) {
			danhMucSanPhamDao.add(danhMuc.getIdDanhMuc(), product.getIdProduct());
		}
	}

	@Override
	public void edit(Product product) {
		productDao.edit(product);
		danhMucSanPhamDao.deleteProduct(product.getIdProduct());
		for (DanhMuc danhMuc : product.getListDanhMuc()) {
			danhMucSanPhamDao.add(danhMuc.getIdDanhMuc(), product.getIdProduct());
		}
	}

	@Override
	public void delete(int idProduct) {
		danhMucSanPhamDao.deleteProduct(idProduct);
		productDao.delete(idProduct);
	}

	@Override
	public Product getById(int idProduct) {
		Product product = productDao.getById(idProduct);
		product.setListDanhMuc(danhMucSanPhamDao.getByDanhMuc(idProduct));
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> list = new ArrayList<Product>();
		for (Product product : productDao.getAll()) {
			product.setListDanhMuc(danhMucSanPhamDao.getByDanhMuc(product.getIdProduct()));
			list.add(product);
		}
		return list;
	}

	@Override
	public List<Product> searchByName(String nameProduct) {
		List<Product> list = new ArrayList<Product>();
		for (Product product : productDao.searchByName(nameProduct)) {
			product.setListDanhMuc(danhMucSanPhamDao.getByDanhMuc(product.getIdProduct()));
			list.add(product);
		}
		return list;
	}

}
