package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("destination")
	private DestinationDTO destination;

	@JsonProperty("address")
	private AddressDTO address;

	public DestinationDTO getDestination() {
		return destination;
	}

	public void setDestination(DestinationDTO destination) {
		this.destination = destination;
	}
	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}

