package pe.bbva.aso.servicios.getuserprofile.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetuserprofileDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("GetUserProfileRequest")
	private GetUserProfileRequestDTO GetUserProfileRequest;

	@JsonProperty("GetUserProfileResponse")
	private GetUserProfileResponseDTO GetUserProfileResponse;

	public GetUserProfileRequestDTO getGetUserProfileRequest() {
		return GetUserProfileRequest;
	}

	public void setGetUserProfileRequest(GetUserProfileRequestDTO GetUserProfileRequest) {
		this.GetUserProfileRequest = GetUserProfileRequest;
	}
	public GetUserProfileResponseDTO getGetUserProfileResponse() {
		return GetUserProfileResponse;
	}

	public void setGetUserProfileResponse(GetUserProfileResponseDTO GetUserProfileResponse) {
		this.GetUserProfileResponse = GetUserProfileResponse;
	}
}

