package pe.bbva.aso.servicios.getuserprofile.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserProfileRequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("userId")
	private UserIdDTO userId;

	public UserIdDTO getUserId() {
		return userId;
	}

	public void setUserId(UserIdDTO userId) {
		this.userId = userId;
	}
}

