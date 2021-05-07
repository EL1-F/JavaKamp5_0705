package e_commerceDemo.core;


import e_commerceDemo.entities.concretes.User;

public class MailSender implements MailSenderservice{

	String verifyCode;
	
	@Override
	public String toProduceCode(User user) {
		 this.verifyCode = String.valueOf(user.getId())+user.getPassword();
		 return verifyCode;	
	}

	@Override
	public void sendMail(User user) {
		
		System.out.println(user.getName() +" "+user.getLastName()+
				" kiþisine e-mail gönderildi.\n"+ verifyCode);
		
		
	}

	@Override
	public boolean certifyCode(String code) {
		
		if(this.userCheck()) {
			if(this.verifyCode ==code) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

	@Override
	public boolean userCheck() {
		//kullanýcýnýn uzantýya týklayýp týklamadýðý durumu simule eder
		return true;
	}
	
}
