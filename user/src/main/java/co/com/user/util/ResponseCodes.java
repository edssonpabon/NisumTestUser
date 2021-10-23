package co.com.user.util;

/**
 * 
 * @author Edsson Pabon
 *
 */
public enum ResponseCodes {

	OK(200,"Transaccion exitosa"),
	EMAIL_EXIST(208, "Correo ya existe"),
	EMAIL_FAIL(209, "Correo invalido"),
	UNAUTHORIZED_ERROR(401,"No autorizado"),
	REQUERID_FIELD(402,"Campo requerido"),
	BUSINESS_ERROR(406,"Error de negocio"),
	APPLICATION_ERROR(500,"Error de aplicacion");

	private Integer codigo;
	private String mensaje;

	ResponseCodes(Integer codigo,String mensaje){
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "( Código = " + getCodigo() + ");"
				+ "( Mensaje = " + getMensaje() + ");";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



}
