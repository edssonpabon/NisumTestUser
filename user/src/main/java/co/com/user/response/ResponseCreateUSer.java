package co.com.user.response;

import java.io.Serializable;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class ResponseCreateUSer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String UUID;
	private String created;
	private String modified;
	private String last_login;
	private String token;
	private String isactive;

	public ResponseCreateUSer() {
	}


	public ResponseCreateUSer(String name, String uUID, String created, String modified, String last_login, String token,
			String isactive) {
		super();
		this.name = name;
		this.UUID = uUID;
		this.created = created;
		this.modified = modified;
		this.last_login = last_login;
		this.token = token;
		this.isactive = isactive;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
