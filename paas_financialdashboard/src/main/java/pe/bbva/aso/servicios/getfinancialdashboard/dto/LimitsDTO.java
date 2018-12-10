package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LimitsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("maximumValue")
	private MaximumValueDTO maximumValue;

	public MaximumValueDTO getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(MaximumValueDTO maximumValue) {
		this.maximumValue = maximumValue;
	}
}

