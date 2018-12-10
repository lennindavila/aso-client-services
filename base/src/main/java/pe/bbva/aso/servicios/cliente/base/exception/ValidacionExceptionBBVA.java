package pe.bbva.aso.servicios.cliente.base.exception;

import java.io.Serializable;

import org.springframework.validation.Errors;

public class ValidacionExceptionBBVA extends ServiceExceptionBBVA implements Serializable {

	private static final long serialVersionUID = 1L;

	private Errors errores;

	public ValidacionExceptionBBVA() {

	}

	public ValidacionExceptionBBVA(Exception e) {
		super(e);
	}

	public ValidacionExceptionBBVA(Errors errores, String codigoError) {
		this.errores = errores;
		this.setCodigo(codigoError);
	}
	
	public ValidacionExceptionBBVA(Errors errores, String codigoError, String mensaje) {
		super(codigoError, mensaje);
		this.errores = errores;
	}

	public ValidacionExceptionBBVA(String codigoError, String mensaje) {
		super(codigoError, mensaje);		
	}

	public Errors getErrores() {
		return errores;
	}

	public void setErrores(Errors errores) {
		this.errores = errores;
	}

}
