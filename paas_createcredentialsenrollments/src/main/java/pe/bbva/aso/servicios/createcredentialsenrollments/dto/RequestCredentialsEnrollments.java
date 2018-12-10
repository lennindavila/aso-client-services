package pe.bbva.aso.servicios.createcredentialsenrollments.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCredentialsEnrollments implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("originAppId")
	private String originAppId;

	@JsonProperty("originUserId")
	private String originUserId;

	@JsonProperty("passwordValue")
	private String passwordValue;

	public String getOriginAppId() {
		return originAppId;
	}

	public void setOriginAppId(String originAppId) {
		this.originAppId = originAppId;
	}
	public String getOriginUserId() {
		return originUserId;
	}

	public void setOriginUserId(String originUserId) {
		this.originUserId = originUserId;
	}
	public String getPasswordValue() {
		return passwordValue;
	}

	public void setPasswordValue(String passwordValue) {
		this.passwordValue = passwordValue;
	}    
}
