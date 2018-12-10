package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrenciesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("isMajor")
	private String isMajor;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getIsMajor() {
		return isMajor;
	}

	public void setIsMajor(String isMajor) {
		this.isMajor = isMajor;
	}
}

