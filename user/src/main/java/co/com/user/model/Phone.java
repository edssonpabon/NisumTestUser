package co.com.user.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author Edsson Pabon
 *
 */
@Entity
@Table(name = "Phone")
public class Phone {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name="UUID",strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="UUID",updatable = false,nullable = false)
	private UUID id;

	@Column(name="user",updatable = false,nullable = false)
	private UUID user;

	@Column(name="number",updatable = false,nullable = false)
	private String number;

	@Column(name="citycode",updatable = false,nullable = false)
	private String citycode;

	@Column(name="contrycode",updatable = false,nullable = false)
	private String contrycode;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getUser() {
		return user;
	}

	public void setUser(UUID user) {
		this.user = user;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getContrycode() {
		return contrycode;
	}

	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}



}
