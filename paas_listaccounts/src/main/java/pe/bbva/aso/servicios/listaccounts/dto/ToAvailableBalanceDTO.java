package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ToAvailableBalanceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("currentBalances")
	private CurrentBalancesDTO currentBalances;

	public CurrentBalancesDTO getCurrentBalances() {
		return currentBalances;
	}

	public void setCurrentBalances(CurrentBalancesDTO currentBalances) {
		this.currentBalances = currentBalances;
	}
}

