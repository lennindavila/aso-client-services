package pe.bbva.servicios.biometricclient.dto;

import java.io.Serializable;

public class AuthenticateResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	protected AuditResponse auditResponse;
	protected Parametros listaParametrosResponse;

	public AuditResponse getAuditResponse() {
		return auditResponse;
	}

	public void setAuditResponse(AuditResponse auditResponse) {
		this.auditResponse = auditResponse;
	}

	public Parametros getListaParametrosResponse() {
		return listaParametrosResponse;
	}

	public void setListaParametrosResponse(Parametros listaParametrosResponse) {
		this.listaParametrosResponse = listaParametrosResponse;
	}
}
