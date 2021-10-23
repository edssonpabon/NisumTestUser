package co.com.user.util;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class ResponseDto {
	private String codigoEstado;
	private String mensaje;

	public ResponseDto() {
		super();
	}

	public ResponseDto(ResponseCodes status) {
		this.codigoEstado = String.valueOf(status.getCodigo());
		this.mensaje = status.getMensaje();
	}

	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
