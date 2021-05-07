package e_commerceDemo.business.concretes;

import e_commerceDemo.business.abstracts.AuthService;
import e_commerceDemo.business.abstracts.UserService;
import e_commerceDemo.core.Controls;
import e_commerceDemo.core.MailSenderservice;
import e_commerceDemo.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private MailSenderservice senderService;
	
	public AuthManager(UserService userService,MailSenderservice senderService) {
		super();
		this.userService = userService;
		this.senderService=senderService;
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
						String code= senderService.toProduceCode(user);
						senderService.sendMail(user);
						if(senderService.certifyCode(code)) {
							userService.add(user);
						}
						
					}
				}
			}
		}else {
			System.out.println("Kaydýnýz zaten mevcuttur.");
		}
		
		
					
	}

}
