package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivationsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("activationId")
	private String activationId;

	@JsonProperty("isActive")
	private String isActive;

	public String getActivationId() {
		return activationId;
	}

	public void setActivationId(String activationId) {
		this.activationId = activationId;
	}
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}

