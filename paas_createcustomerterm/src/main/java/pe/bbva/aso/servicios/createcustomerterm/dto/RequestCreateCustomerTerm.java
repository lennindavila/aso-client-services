package pe.bbva.aso.servicios.createcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateCustomerTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("termType")
	private TermTypeDTO termType;

	@JsonProperty("termVersion")
	private String termVersion;

	@JsonProperty("status")
	private StatusDTO status;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public TermTypeDTO getTermType() {
		return termType;
	}

	public void setTermType(TermTypeDTO termType) {
		this.termType = termType;
	}
	public String getTermVersion() {
		return termVersion;
	}

	public void setTermVersion(String termVersion) {
		this.termVersion = termVersion;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
}
