package e_commerceDemo.business.abstracts;

import e_commerceDemo.entities.concretes.User;

public interface AuthService {
	
	void logIn(String email, String password);
	void register(User user);

}
