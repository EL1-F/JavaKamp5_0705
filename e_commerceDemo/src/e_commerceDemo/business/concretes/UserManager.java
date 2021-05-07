package e_commerceDemo.business.concretes;


import java.util.List;

import e_commerceDemo.business.abstracts.UserService;
import e_commerceDemo.dataAccess.abstracts.UserDao;
import e_commerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("Kayýt baþarýlý.");
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	

}
