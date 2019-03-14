package pe.bbva.aso.servicios.cliente.base.exception;

import java.io.Serializable;

import pe.bbva.aso.servicios.cliente.base.enumerators.ServiceNameEnum;

public class ServiceExceptionBBVA extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	protected ServiceNameEnum serviceName;

	public ServiceExceptionBBVA() {
		super();
	}

	public ServiceExceptionBBVA(Throwable cause) {
		super(cause);
	}

	public ServiceExceptionBBVA(String codigo) {
		this.codigo = codigo;
	}
	
	public ServiceExceptionBBVA(Throwable cause, String message) {
		super(message,cause);		
		//this.codigo = codigo;	
	}

	public ServiceExceptionBBVA(ServiceNameEnum serviceName,Throwable cause, String message) {
		super(message,cause);		
		//this.codigo = codigo;
		this.serviceName = serviceName;
	}
	
	public ServiceExceptionBBVA(ServiceNameEnum serviceName,Throwable cause,String codigo, String message) {
		super(message,cause);		
		this.codigo = codigo;
		this.serviceName = serviceName;
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

	public ServiceNameEnum getServiceName() {
		return serviceName;
	}

	public void setServiceName(ServiceNameEnum serviceName) {
		this.serviceName = serviceName;
	}	
}
