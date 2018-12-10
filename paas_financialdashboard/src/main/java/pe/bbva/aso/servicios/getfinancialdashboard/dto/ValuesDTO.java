package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValuesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("value")
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

