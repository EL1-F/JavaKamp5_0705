package e_commerceDemo.entities.concretes;

import e_commerceDemo.entities.abstracts.Entity;

public class User implements Entity {
	//Temel kullanýcý bilgileri : ad, soyad, e-posta, parola.
	
	private int id;
	private String name;
	private String lastName;
	private String eMail;
	private String password;
	
	public User() {
		
		
	}

	public User(int id, String name, String lastName, String eMail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
