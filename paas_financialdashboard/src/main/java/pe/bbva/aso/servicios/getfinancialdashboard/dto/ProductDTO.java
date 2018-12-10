package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("name")
	private String name;

	@JsonProperty("commercialClassifications")
	private List<CommercialClassificationsDTO> commercialClassifications;

	@JsonProperty("conditions")
	private List<ConditionsDTO> conditions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<CommercialClassificationsDTO> getCommercialClassifications() {
		return commercialClassifications;
	}

	public void setCommercialClassifications(List<CommercialClassificationsDTO> commercialClassifications) {
		this.commercialClassifications = commercialClassifications;
	}
	public List<ConditionsDTO> getConditions() {
		return conditions;
	}

	public void setConditions(List<ConditionsDTO> conditions) {
		this.conditions = conditions;
	}
}

