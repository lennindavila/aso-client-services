package pe.bbva.aso.servicios.modifycard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyCard implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("card-id")
	private String cardId;

	@JsonProperty("status")
	private StatusDTO status;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
}
