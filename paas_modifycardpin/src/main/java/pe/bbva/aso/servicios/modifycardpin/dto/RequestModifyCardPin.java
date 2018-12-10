package pe.bbva.aso.servicios.modifycardpin.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyCardPin implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("pin")
	private Object pin;

	public Object getPin() {
		return pin;
	}

	public void setPin(Object pin) {
		this.pin = pin;
	}
}
