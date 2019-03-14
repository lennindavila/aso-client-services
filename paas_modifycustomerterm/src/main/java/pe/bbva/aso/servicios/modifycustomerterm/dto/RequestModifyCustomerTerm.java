package pe.bbva.aso.servicios.modifycustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyCustomerTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("term-id")
	private String termId;

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

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
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
