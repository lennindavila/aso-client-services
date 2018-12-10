package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthDataDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("birthDate")
	private String birthDate;

	@JsonProperty("country")
	private CountryDTO country;

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
}

