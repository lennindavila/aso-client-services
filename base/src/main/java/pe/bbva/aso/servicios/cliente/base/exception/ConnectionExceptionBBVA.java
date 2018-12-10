package pe.bbva.aso.servicios.cliente.base.exception;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionExceptionBBVA extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String message;

	public ConnectionExceptionBBVA() {
		super();
	}

	public ConnectionExceptionBBVA(Throwable cause) {
		super(cause);
	}

	public ConnectionExceptionBBVA(String codigo) {
		this.codigo = codigo;
	}

	@Autowired
	public ConnectionExceptionBBVA(Throwable cause, String codigo, String message) {
		super(cause);
		this.codigo = codigo;
		this.message = message;
	}


	public ConnectionExceptionBBVA(String codigo, String message) {
		super(message);
		this.codigo = codigo;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
