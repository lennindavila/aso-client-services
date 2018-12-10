package pe.bbva.aso.servicios.modifyindicator.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndicatorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("isActive")
	private String isActive;	

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}

