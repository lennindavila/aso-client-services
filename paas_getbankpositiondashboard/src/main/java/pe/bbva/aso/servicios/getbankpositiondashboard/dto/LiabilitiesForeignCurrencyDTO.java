package pe.bbva.aso.servicios.getbankpositiondashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiabilitiesForeignCurrencyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("amount")
	private String amount;

	@JsonProperty("currency")
	private String currency;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}

