package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BbvaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("target-user-id")
	private String targetUserId;

	public String getTargetUserId() {
		return targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
	}
}

