package co.com.user.util;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class ResGeneric<T> extends ResponseDto {

	private T resultado;

	public ResGeneric() {
	}

	public ResGeneric(T resultado) {
		super();
		this.resultado = resultado;
	}

	public ResGeneric(ResponseCodes status) {
		this.setCodigoEstado(String.valueOf(status.getCodigo()));
		this.setMensaje(status.getMensaje());
	}

	public ResGeneric(ResponseCodes status, T resultado) {
		this.setCodigoEstado(String.valueOf(status.getCodigo()));
		this.setMensaje(status.getMensaje());
		this.resultado = resultado;
	}

	public T getResultado() {
		return resultado;
	}

	public void setResultado(T resultado) {
		this.resultado = resultado;
	}
}
