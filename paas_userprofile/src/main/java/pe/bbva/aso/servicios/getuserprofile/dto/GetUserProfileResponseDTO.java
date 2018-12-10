package pe.bbva.aso.servicios.getuserprofile.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserProfileResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("authMechanism")
	private String authMechanism;

	@JsonProperty("signMechanisms")
	private String signMechanisms;

	@JsonProperty("userData")
	private String userData;

	public String getAuthMechanism() {
		return authMechanism;
	}

	public void setAuthMechanism(String authMechanism) {
		this.authMechanism = authMechanism;
	}
	public String getSignMechanisms() {
		return signMechanisms;
	}

	public void setSignMechanisms(String signMechanisms) {
		this.signMechanisms = signMechanisms;
	}
	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}
}

