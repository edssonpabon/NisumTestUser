package co.com.user.bean;

import java.util.ArrayList;
/**
 * 
 * @author Edsson Pabon
 *
 */
public class User {
	private String name;
	private String email;
	private String password;
	private String UUID;
	private String created;
	private String modified;
	private String last_login;
	private String token;
	private String isactive;
	private ArrayList<Phone> listPhone;

	public User() {
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

	public ArrayList<Phone> getListPhone() {
		return listPhone;
	}

	public void setListPhone(ArrayList<Phone> listPhone) {
		this.listPhone = listPhone;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}



}
