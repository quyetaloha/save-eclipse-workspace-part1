package shopfashion.service.imp;

import java.util.ArrayList;
import java.util.List;

import shopfashion.dao.DanhMucSanPhamDao;
import shopfashion.dao.impl.DanhMucDaoImp;
import shopfashion.dao.impl.DanhMucSanPhamDaoImp;
import shopfashion.model.DanhMuc;
import shopfashion.service.DanhMucService;

public class DanhMucServiceImp implements DanhMucService {
	private DanhMucDaoImp danhMucDao = new DanhMucDaoImp();
	private DanhMucSanPhamDao danhMucSanPhamDao = new DanhMucSanPhamDaoImp();

	@Override
	public void add(DanhMuc danhMuc) {
		danhMucDao.add(danhMuc);
	}

	@Override
	public void edit(DanhMuc danhMuc) {
		danhMucDao.edit(danhMuc);
	}

	@Override
	public void delete(int idDanhMuc) {
		danhMucSanPhamDao.deleteDanhMuc(idDanhMuc);
		danhMucDao.delete(idDanhMuc);
	}

	@Override
	public DanhMuc getByIdDanhMuc(int idDanhMuc) {
		DanhMuc danhMuc = danhMucDao.getByIdDanhMuc(idDanhMuc);
		danhMuc.setDsProduct(danhMucSanPhamDao.getByProduct(idDanhMuc));
		return danhMuc;
	}

	@Override
	public List<DanhMuc> getAll() {
		List<DanhMuc> dsDanhMuc =danhMucDao.getAll();
		for(DanhMuc danhMuc: dsDanhMuc) {
			danhMuc.setDsProduct(danhMucSanPhamDao.getByProduct(danhMuc.getIdDanhMuc()));
		}
		return dsDanhMuc;
	}

	@Override
	public List<DanhMuc> searchByNameDanhMuc(String nameDanhMuc) {
		return danhMucDao.searchByNameDanhMuc(nameDanhMuc);
	}

}
