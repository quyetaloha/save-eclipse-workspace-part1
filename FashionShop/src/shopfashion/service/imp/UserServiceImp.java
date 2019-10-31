package shopfashion.service.imp;

import java.util.List;

import shopfashion.dao.UserDao;
import shopfashion.dao.impl.UserDaoImp;
import shopfashion.model.User;
import shopfashion.service.UserService;

public class UserServiceImp implements UserService{
	private UserDao userDao= new UserDaoImp();
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void edit(User user) {
		userDao.edit(user);
	}

	@Override
	public void delete(int idUser) {
		userDao.delete(idUser);
	}

	@Override
	public User getByIdUser(int idUser) {
		return userDao.getById(idUser);
	}

	@Override
	public User getByUsernamePassword(String username, String password) {
		for(User user: userDao.getAll()) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public boolean checkUsername(String username) {
		for(User user: userDao.getAll()) {
			if(user.getUsername().equals(username)) {
				return false;
			}
		}
		return true;
	}

}
