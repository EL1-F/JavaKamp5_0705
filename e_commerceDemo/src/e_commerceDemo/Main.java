package e_commerceDemo;

import e_commerceDemo.business.abstracts.AuthService;
import e_commerceDemo.business.abstracts.UserService;
import e_commerceDemo.business.concretes.AuthManager;
import e_commerceDemo.business.concretes.UserManager;
import e_commerceDemo.core.MailSender;
import e_commerceDemo.dataAccess.concretes.HibernateUserDao;
import e_commerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userManager = new UserManager(new HibernateUserDao());
		AuthService authManager = new AuthManager(userManager,new MailSender());
		User user = new User(1,"elif","ipek","elif@gmail.com","123456");
		
		authManager.register(user);
		
		
		//authManager.logIn("elif@gmail.com","123456");
		

	}

}
