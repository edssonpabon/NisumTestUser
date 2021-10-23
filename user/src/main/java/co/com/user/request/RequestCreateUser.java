package co.com.user.request;

import java.util.ArrayList;

import co.com.user.bean.Phone;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class RequestCreateUser {

	private String name;
	private String email;
	private String password;
	private ArrayList<Phone> phones;

	public RequestCreateUser() {

	}

	public RequestCreateUser(String name, String email, String password, ArrayList<Phone> phones) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Phone> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<Phone> phones) {
		this.phones = phones;
	}
}
