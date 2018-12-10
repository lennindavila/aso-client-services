package pe.bbva.aso.servicios.getuserprofile.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestGetUserProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("card-id")
	private String cardId;
    
	@JsonProperty("pin")
	private Object pin;	

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Object getPin() {
		return pin;
	}

	public void setPin(Object pin) {
		this.pin = pin;
	}
}
