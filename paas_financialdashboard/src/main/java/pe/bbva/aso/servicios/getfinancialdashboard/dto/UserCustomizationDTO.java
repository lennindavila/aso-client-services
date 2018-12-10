package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserCustomizationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("alias")
	private String alias;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
}

