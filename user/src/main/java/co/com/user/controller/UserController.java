package co.com.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.com.user.bean.User;
import co.com.user.request.RequestCreateUser;
import co.com.user.response.ResponseCreateUSer;
import co.com.user.service.IUserService;
import co.com.user.service.impl.UserServiceImpl;
import co.com.user.util.ResGeneric;
import co.com.user.util.ResponseCodes;
import co.com.user.util.ResponseDto;
import co.com.user.util.exeption.ExceptionUtility;

/**
 * 
 * @author Edsson Pabon
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);

	private IUserService iUser;

	@RequestMapping(value="/createUser",method = RequestMethod.GET)
	public ResponseEntity<ResponseDto> createUser(@RequestBody RequestCreateUser req) {
		log.info("Inicio de ejecución guardar Usuario");
		ResponseDto responseDto;
		try {
			User user = new User();
			user.setName(req.getName());
			user.setEmail(req.getEmail());
			user.setPassword(req.getPassword());
			user.setListPhone(req.getPhones());
			iUser = new UserServiceImpl();
			responseDto = new ResGeneric<ResponseCreateUSer>(ResponseCodes.OK, iUser.guardarUsuario(user));
			log.info("Usuario guardado con exito");
			return new ResponseEntity<>(responseDto,HttpStatus.OK);
		} catch (Exception e) {
			log.error("Error guardando el usuario" +e.getMessage());
			return ExceptionUtility.getResponse(e);
		}
	}
}
