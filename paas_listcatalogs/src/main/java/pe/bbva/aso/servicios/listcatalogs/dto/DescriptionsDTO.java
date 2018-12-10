package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescriptionsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("description")
	private DescriptionDTO description;

	public DescriptionDTO getDescription() {
		return description;
	}

	public void setDescription(DescriptionDTO description) {
		this.description = description;
	}
}

