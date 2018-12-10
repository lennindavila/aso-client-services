package pe.bbva.aso.servicios.listcustomerindicators.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestListCustomersIndicators implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("customer-id")
	private String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
