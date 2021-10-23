package co.com.user.response;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class ResponseCreatePhone {

	private String uuid;
	private String userId;
	private String number;
	private String citycode;
	private String contrycode;

	public ResponseCreatePhone() {

	}

	public ResponseCreatePhone(String uuid, String userId, String number, String citycode, String contrycode) {
		super();
		this.uuid = uuid;
		this.userId = userId;
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
	}

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
