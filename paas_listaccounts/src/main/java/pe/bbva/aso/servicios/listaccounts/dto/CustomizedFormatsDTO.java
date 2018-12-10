package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomizedFormatsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("customizedFormatId")
	private String customizedFormatId;

	public String getCustomizedFormatId() {
		return customizedFormatId;
	}

	public void setCustomizedFormatId(String customizedFormatId) {
		this.customizedFormatId = customizedFormatId;
	}
}

