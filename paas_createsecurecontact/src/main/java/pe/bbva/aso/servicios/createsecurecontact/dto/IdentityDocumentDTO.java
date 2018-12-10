package pe.bbva.aso.servicios.createsecurecontact.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdentityDocumentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("type")
	private TypeDTO type;

	@JsonProperty("number")
	private String number;

	public TypeDTO getType() {
		return type;
	}

	public void setType(TypeDTO type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

