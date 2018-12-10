package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormatsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("pan")
	private String pan;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
}

