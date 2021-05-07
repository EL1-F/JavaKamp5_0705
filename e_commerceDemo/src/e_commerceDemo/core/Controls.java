package e_commerceDemo.core;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_commerceDemo.entities.concretes.User;


public class Controls {
	
	public static boolean checkPassword(String password) {
		
		if(password.length()<6) {
			System.out.println("Þifre en az 6 karakter olmalýdýr.");
			return false;
		}else {
			//System.out.println("check password");
			return true;
		}
		
	}
	
	
	public static boolean checkEmail(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			//System.out.println("check mail");
			return true;
		}else {
			
			return false;
		}
	}
	
	
	public static boolean checkName(String name) {
		if(name.length()<2) {
			System.out.println("En az iki karakter olmalýdýr.");
			return false;
		}else {
			//System.out.println("check name");
			return true;
		}
	}
	
	
	public static boolean checkUserExists(List<User> users, String email) {
		
		for(User user:users) {
			if (user.geteMail() == email) 
				
				return false;
		}
		//System.out.println("kullanýcý mevcut deðil");
		return true;
	}
	
	public static boolean checkUserPassword(List<User> users, String password) {
			
			for(User user:users) {
				if (user.getPassword() == password) 
					return true;
			}
			return false;
		}

}
