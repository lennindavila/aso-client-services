package pe.bbva.aso.servicios.modifycardactivation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyCardActivation implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("card-id")
	private String cardId;

	@JsonProperty("activation-id")
	private String activationId;

	@JsonProperty("isActive")
	private String isActive;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
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
