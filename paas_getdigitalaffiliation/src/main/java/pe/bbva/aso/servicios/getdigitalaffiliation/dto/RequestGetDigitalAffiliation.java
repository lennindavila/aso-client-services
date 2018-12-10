package pe.bbva.aso.servicios.getdigitalaffiliation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestGetDigitalAffiliation implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("customer")
	private CustomerDTO customer;

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
}
