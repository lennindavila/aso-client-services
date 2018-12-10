package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeographicGroupsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("geographicGroupType")
	private GeographicGroupTypeDTO geographicGroupType;

	@JsonProperty("name")
	private String name;

	@JsonProperty("code")
	private String code;

	public GeographicGroupTypeDTO getGeographicGroupType() {
		return geographicGroupType;
	}

	public void setGeographicGroupType(GeographicGroupTypeDTO geographicGroupType) {
		this.geographicGroupType = geographicGroupType;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

