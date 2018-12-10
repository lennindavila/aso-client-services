package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescriptionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("language")
	private String language;

	@JsonProperty("value")
	private String value;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

