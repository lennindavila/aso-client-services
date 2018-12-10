package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResidenceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("residenceType")
	private ResidenceTypeDTO residenceType;

	@JsonProperty("country")
	private CountryDTO country;

	@JsonProperty("startDate")
	private String startDate;

	public ResidenceTypeDTO getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(ResidenceTypeDTO residenceType) {
		this.residenceType = residenceType;
	}
	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}

