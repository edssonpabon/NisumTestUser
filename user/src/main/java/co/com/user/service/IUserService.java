package co.com.user.service;

import co.com.user.bean.User;
import co.com.user.response.ResponseCreateUSer;

/**
 * 
 * @author Edsson Pabon
 *
 */
public interface IUserService {

	public ResponseCreateUSer guardarUsuario(User user) throws Exception;

}
