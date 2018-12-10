package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("items")
	private List<ItemsDTO> items;

	public List<ItemsDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemsDTO> items) {
		this.items = items;
	}
}

