package pe.bbva.aso.servicios.getcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestGetCustomerTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("term-id")
	private String termId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	} 
}
