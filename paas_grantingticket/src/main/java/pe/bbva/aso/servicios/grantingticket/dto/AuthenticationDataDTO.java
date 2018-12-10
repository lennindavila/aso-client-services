package pe.bbva.aso.servicios.grantingticket.dto;

import java.io.Serializable;
import java.util.List;

public class AuthenticationDataDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String idAuthenticationData;
	private List<String> authenticationData;
	
	public String getIdAuthenticationData() {
		return idAuthenticationData;
	}
	public void setIdAuthenticationData(String idAuthenticationData) {
		this.idAuthenticationData = idAuthenticationData;
	}
	public List<String> getAuthenticationData() {
		return authenticationData;
	}
	public void setAuthenticationData(List<String> authenticationData) {
		this.authenticationData = authenticationData;
	}	
}
