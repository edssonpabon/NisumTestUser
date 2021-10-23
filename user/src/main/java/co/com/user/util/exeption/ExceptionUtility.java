package co.com.user.util.exeption;

import java.io.Serializable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import co.com.user.util.ResGeneric;
import co.com.user.util.ResponseCodes;
import co.com.user.util.ResponseDto;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class ExceptionUtility implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ExceptionUtility() {
	}

	public static ResponseEntity<ResponseDto> getResponse(Exception ex) {
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		ResponseDto respuesta = new ResGeneric<Throwable>(ResponseCodes.APPLICATION_ERROR, ex.getCause());
		//			log.info("Error interno del sistema = {}", respuesta);
		return new ResponseEntity<>(respuesta, status);
	}

}
