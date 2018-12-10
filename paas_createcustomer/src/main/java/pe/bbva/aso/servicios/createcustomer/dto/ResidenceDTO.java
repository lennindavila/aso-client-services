package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResidenceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("country")
	private CountryDTO country;

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
}

