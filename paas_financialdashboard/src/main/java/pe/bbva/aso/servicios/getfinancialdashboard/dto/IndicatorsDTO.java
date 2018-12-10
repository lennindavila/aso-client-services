package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndicatorsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("hasDebt")
	private String hasDebt;

	public String getHasDebt() {
		return hasDebt;
	}

	public void setHasDebt(String hasDebt) {
		this.hasDebt = hasDebt;
	}
}

