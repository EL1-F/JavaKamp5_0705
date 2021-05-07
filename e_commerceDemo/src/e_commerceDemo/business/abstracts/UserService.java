package e_commerceDemo.business.abstracts;

import java.util.List;

import e_commerceDemo.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();

}
