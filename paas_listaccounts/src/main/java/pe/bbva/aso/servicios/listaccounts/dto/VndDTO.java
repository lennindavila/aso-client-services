package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VndDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("bbva")
	private BbvaDTO bbva;

	public BbvaDTO getBbva() {
		return bbva;
	}

	public void setBbva(BbvaDTO bbva) {
		this.bbva = bbva;
	}
}

