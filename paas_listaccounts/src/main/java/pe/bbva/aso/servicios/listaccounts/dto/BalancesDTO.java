package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BalancesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("debits")
	private List<DebitsDTO> debits;

	@JsonProperty("credits")
	private List<CreditsDTO> credits;

	public List<DebitsDTO> getDebits() {
		return debits;
	}

	public void setDebits(List<DebitsDTO> debits) {
		this.debits = debits;
	}
	public List<CreditsDTO> getCredits() {
		return credits;
	}

	public void setCredits(List<CreditsDTO> credits) {
		this.credits = credits;
	}
}

