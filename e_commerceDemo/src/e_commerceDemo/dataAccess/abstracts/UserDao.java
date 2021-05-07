package e_commerceDemo.dataAccess.abstracts;

import java.util.List;

import e_commerceDemo.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(String name, String lastName, String password);
	
	User get(int id);
	List<User> getAll();
	

}
