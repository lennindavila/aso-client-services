package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("name")
	private String name;

	@JsonProperty("values")
	private List<ValuesDTO> values;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<ValuesDTO> getValues() {
		return values;
	}

	public void setValues(List<ValuesDTO> values) {
		this.values = values;
	}
}

