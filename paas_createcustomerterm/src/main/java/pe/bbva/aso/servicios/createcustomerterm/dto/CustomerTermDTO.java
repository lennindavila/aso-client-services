package pe.bbva.aso.servicios.createcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerTermDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("termId")
	private String termId;

	@JsonProperty("status")
	private StatusDTO status;

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
}

