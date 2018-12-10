package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("geographicGroups")
	private List<GeographicGroupsDTO> geographicGroups;

	@JsonProperty("additionalInformation")
	private String additionalInformation;

	@JsonProperty("country")
	private CountryDTO country;

	public List<GeographicGroupsDTO> getGeographicGroups() {
		return geographicGroups;
	}

	public void setGeographicGroups(List<GeographicGroupsDTO> geographicGroups) {
		this.geographicGroups = geographicGroups;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
}

