package e_commerceDemo.core;

import e_commerceDemo.JGoogle.JGoogleManager;
import e_commerceDemo.business.abstracts.AuthService;
import e_commerceDemo.business.abstracts.UserService;
import e_commerceDemo.entities.concretes.User;

public class JGoogleManagerAdapter implements AuthService{

	
	private UserService userService;

	public JGoogleManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void logIn(String email, String password) {
		if (!Controls.checkUserExists(userService.getAll(),email)) {
			if(Controls.checkUserPassword(userService.getAll(),password)) {
				System.out.println("Sisteme giris yapildi.");			
				return;
			}
		}
		System.out.println("E-mail sisteme kayitli degil. Lütfen önce sisteme kayit olun.");
		
		
	}

	@Override
	public void register(User user) {
		
		if(Controls.checkUserExists(userService.getAll(),user.geteMail())) {
			if(Controls.checkName(user.getName())) {
				if(Controls.checkEmail(user.geteMail())) {
					if(Controls.checkPassword(user.getPassword())) {
						JGoogleManager googleManager = new JGoogleManager();
						googleManager.registerWithGoogle(user);
					}
				}
			}
		}else {
			System.out.println("Kaydýnýz zaten mevcuttur.");
		}
		
	}




}
