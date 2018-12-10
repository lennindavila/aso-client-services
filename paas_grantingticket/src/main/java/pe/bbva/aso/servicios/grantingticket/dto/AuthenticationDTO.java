package pe.bbva.aso.servicios.grantingticket.dto;

import java.io.Serializable;
import java.util.List;

public class AuthenticationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userID;
	private String consumerID;
	private String authenticationType;
	private List<AuthenticationDataDTO> authenticationData;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getConsumerID() {
		return consumerID;
	}
	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public List<AuthenticationDataDTO> getAuthenticationData() {
		return authenticationData;
	}
	public void setAuthenticationData(List<AuthenticationDataDTO> authenticationData) {
		this.authenticationData = authenticationData;
	}	
}
