package e_commerceDemo.JGoogle;

import e_commerceDemo.entities.concretes.User;

public class JGoogleManager {
	
	public void registerWithGoogle(User user)
	{
		System.out.println("Google ile giriþ: " + user.getLastName());
	}

}
