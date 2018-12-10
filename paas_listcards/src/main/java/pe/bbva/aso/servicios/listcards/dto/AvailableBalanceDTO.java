package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvailableBalanceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("currentBalances")
	private List<CurrentBalancesDTO> currentBalances;

	public List<CurrentBalancesDTO> getCurrentBalances() {
		return currentBalances;
	}

	public void setCurrentBalances(List<CurrentBalancesDTO> currentBalances) {
		this.currentBalances = currentBalances;
	}
}

