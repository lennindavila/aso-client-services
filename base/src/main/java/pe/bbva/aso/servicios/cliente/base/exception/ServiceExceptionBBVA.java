package pe.bbva.aso.servicios.cliente.base.exception;

import java.io.Serializable;

public class ServiceExceptionBBVA extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;

	public ServiceExceptionBBVA() {
		super();
	}

	public ServiceExceptionBBVA(Throwable cause) {
		super(cause);
	}

	public ServiceExceptionBBVA(String codigo) {
		this.codigo = codigo;
	}

	public ServiceExceptionBBVA(Throwable cause, String codigo) {
		super(cause);
		this.codigo = codigo;
	}

	public ServiceExceptionBBVA(String codigo, String message) {
		super(message);
		this.codigo = codigo;
	}

	public ServiceExceptionBBVA(Throwable cause, String codigo, String message) {
		super(message, cause);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
