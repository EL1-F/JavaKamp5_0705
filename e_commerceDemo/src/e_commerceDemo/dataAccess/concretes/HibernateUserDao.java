package e_commerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import e_commerceDemo.dataAccess.abstracts.UserDao;
import e_commerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	//Datalar�n projeye ba�land��� yer oldu�u i�in i�lenecek listeyi burada a�t�m
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		for(User member:users) {
			if(member.getId()==user.getId()) {
				member.setName(user.getName());
				member.setLastName(user.getLastName());
				member.seteMail(user.geteMail());
				member.setPassword(user.getPassword());
				System.out.println("Bilgiler ba�ar�yla g�ncellenmi�tir.\n ");
			}
		}
		
	}

	@Override
	public void delete(String name, String lastName, String password) {
		for(User member:users) {
			if(member.getName()==name&& 
					member.getLastName()==lastName&& 
					member.getPassword()==password) {
				users.remove(member);
				System.out.println("Hesab�n�z silinmi�tir "+ member.getName());
			}
		}
		
	}

	@Override
	public User get(int id) {
		User user = new User();
		for(User member: users) {
			if(member.getId()==id) {
				user= member;
			}
		}
		return user;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
