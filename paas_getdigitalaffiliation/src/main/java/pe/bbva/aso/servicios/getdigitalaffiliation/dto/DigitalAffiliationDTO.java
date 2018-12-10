package pe.bbva.aso.servicios.getdigitalaffiliation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DigitalAffiliationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("affiliationDate")
	private String affiliationDate;

	@JsonProperty("subStatus")
	private SubStatusDTO subStatus;

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	public String getAffiliationDate() {
		return affiliationDate;
	}

	public void setAffiliationDate(String affiliationDate) {
		this.affiliationDate = affiliationDate;
	}
	public SubStatusDTO getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(SubStatusDTO subStatus) {
		this.subStatus = subStatus;
	}
}

