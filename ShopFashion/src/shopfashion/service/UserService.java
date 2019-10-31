package shopfashion.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import shopfashion.model.User;

public interface UserService {
	void add(User user);
	void edit(User user);
	void delete(int idUser);
	User getByIdUser(int idUser);
	User getByUsernamePassword(String username, String password);
	boolean checkUsername(String username);
	List<User> getAll();
}
