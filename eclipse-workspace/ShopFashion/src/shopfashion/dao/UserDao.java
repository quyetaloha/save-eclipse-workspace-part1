package shopfashion.dao;

import java.util.List;

import shopfashion.model.User;


public interface UserDao {
	void add(User user);
	void edit(User user);
	void delete(int idUser);
	User getById(int idUser);
	List<User> getAll();
	
}
