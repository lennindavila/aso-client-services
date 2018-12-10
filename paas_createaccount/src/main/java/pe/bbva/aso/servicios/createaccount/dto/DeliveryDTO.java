package pe.bbva.aso.servicios.createaccount.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("deliveryType")
	private String deliveryType;

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
}

