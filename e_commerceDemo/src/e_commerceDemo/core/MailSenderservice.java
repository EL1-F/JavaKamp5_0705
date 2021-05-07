package e_commerceDemo.core;


import e_commerceDemo.entities.concretes.User;

public interface MailSenderservice {
	
	String toProduceCode(User user);
	void sendMail(User user);
	boolean certifyCode(String code);
	boolean userCheck();

}
