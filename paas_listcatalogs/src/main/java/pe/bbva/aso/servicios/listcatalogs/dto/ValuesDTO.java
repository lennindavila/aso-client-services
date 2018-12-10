package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValuesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("description")
	private DescriptionDTO description;

	@JsonProperty("id")
	private String id;

	@JsonProperty("descriptions")
	private DescriptionsDTO descriptions;

	public DescriptionDTO getDescription() {
		return description;
	}

	public void setDescription(DescriptionDTO description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public DescriptionsDTO getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(DescriptionsDTO descriptions) {
		this.descriptions = descriptions;
	}
}

