package pe.bbva.aso.servicios.listcustomerindicators.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerIndicatorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("indicatorId")
	private String indicatorId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("isActive")
	private String isActive;

	public String getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(String indicatorId) {
		this.indicatorId = indicatorId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}

