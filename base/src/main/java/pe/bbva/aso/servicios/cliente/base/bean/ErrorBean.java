package pe.bbva.aso.servicios.cliente.base.bean;

public class ErrorBean {

	private String codigoError;
	private String mensajeError;

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	@Override
	public String toString() {
		return "ErrorBean [codigoError=" + codigoError + ", mensajeError=" + mensajeError + "]";
	}

}
