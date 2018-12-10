package pe.bbva.aso.servicios.grantingticket.dto;

import java.io.Serializable;

public class RequestGrantingTicket implements Serializable {
    private static final long serialVersionUID = 1L;

    private AuthenticationDTO authentication;
    private BackendUserRequestDTO backendUserRequest;
    
	public AuthenticationDTO getAuthentication() {
		return authentication;
	}
	public void setAuthentication(AuthenticationDTO authentication) {
		this.authentication = authentication;
	}
	public BackendUserRequestDTO getBackendUserRequest() {
		return backendUserRequest;
	}
	public void setBackendUserRequest(BackendUserRequestDTO backendUserRequest) {
		this.backendUserRequest = backendUserRequest;
	}    
}
