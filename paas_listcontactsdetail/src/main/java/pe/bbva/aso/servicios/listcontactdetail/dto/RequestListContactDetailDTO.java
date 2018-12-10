package pe.bbva.aso.servicios.listcontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestListContactDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("unmasked")
	private String unmasked;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getUnmasked() {
		return unmasked;
	}

	public void setUnmasked(String unmasked) {
		this.unmasked = unmasked;
	}
}
