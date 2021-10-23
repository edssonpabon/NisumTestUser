package co.com.user.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import co.com.user.bean.Phone;
import co.com.user.bean.User;
import co.com.user.repository.UserRepository;
import co.com.user.response.ResponseCreateUSer;
import co.com.user.service.IPhoneService;
import co.com.user.service.IUserService;
import co.com.user.util.ResponseCodes;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class UserServiceImpl implements IUserService{

	private static final Logger log = LogManager.getLogger(UserServiceImpl.class);
	public static final  String ACTIVO ="Active";
	public static final  String IN_ACTIVO ="Desactive";

	@Autowired
	private UserRepository iUserRepository;

	@Autowired
	private IPhoneService iPhoneService;

	@Override
	public ResponseCreateUSer guardarUsuario(User user) throws Exception {
		try {
			log.error("Mapeando el usuario");
			co.com.user.model.User userEntity = convertToEntityUser(user);
			userEntity.setCreated(new Date());
			userEntity.setModified(new Date());
			userEntity.setLast_login(new Date());
			userEntity.setToken(UUID.randomUUID().toString().toUpperCase());
			userEntity.setIsactive(ACTIVO);
			userEntity = iUserRepository.save(userEntity);
			for (int i = 0; i < user.getListPhone().size(); i++) {
				Phone phone = user.getListPhone().get(i);
				log.info("Guardando telefono "+phone.getNumber()+" asociado al usuario "+String.valueOf(userEntity.getId()));
				iPhoneService.guardarTelefono(phone, String.valueOf(userEntity.getId()));
			}
			user = convertToDtoUser(userEntity);
			ResponseCreateUSer responseCreateUSer = new ResponseCreateUSer(user.getName(),user.getUUID(), user.getCreated(), user.getModified(), user.getLast_login(), user.getToken(), user.getIsactive());
			return responseCreateUSer;
		} catch (Exception e) {
			log.error("Error guardando el usuario" +e.getCause());
			log.error("Error guardando el usuario" +e.getStackTrace());
			throw new Exception(e);
		}
	}


	public co.com.user.model.User convertToEntityUser(User userDto) throws Exception{
		co.com.user.model.User userEntity = new co.com.user.model.User();
		userEntity.setName(userDto.getName());
		try {
			log.info("Validando correo...");
			if(!validarFormatoEmail(userDto.getEmail()))
				userEntity.setEmail(userDto.getEmail());
			else {
				log.error("Correo invalido");
				throw new Exception(ResponseCodes.EMAIL_FAIL.getMensaje());
			}
		} catch (Exception e) {
			throw new Exception(ResponseCodes.EMAIL_FAIL.getMensaje());
		}
		log.info("Correo validado con exito");
		userEntity.setEmail(userDto.getEmail());

		userEntity.setPassword(userDto.getPassword());
		return userEntity;
	}

	public boolean validarFormatoEmail(String email) {
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher mather = pattern.matcher(email);
		return mather.find();
	}

	public User convertToDtoUser(co.com.user.model.User userEntity){
		User userDto = new User();
		userDto.setUUID(String.valueOf(userEntity.getId()));
		userDto.setName(userEntity.getName());
		userDto.setEmail(userEntity.getEmail());
		userDto.setPassword(userEntity.getPassword());
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		userDto.setCreated(format.format(userEntity.getCreated()));
		userDto.setLast_login(format.format(userEntity.getLast_login()));
		userDto.setModified(format.format(userEntity.getModified()));
		userDto.setToken(userEntity.getToken());
		userDto.setIsactive(userEntity.getIsactive());
		return userDto;
	}
}
