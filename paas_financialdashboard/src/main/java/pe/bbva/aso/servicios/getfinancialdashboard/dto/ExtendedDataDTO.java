package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtendedDataDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("redemptionBalance")
	private RedemptionBalanceDTO redemptionBalance;

	public RedemptionBalanceDTO getRedemptionBalance() {
		return redemptionBalance;
	}

	public void setRedemptionBalance(RedemptionBalanceDTO redemptionBalance) {
		this.redemptionBalance = redemptionBalance;
	}
}

