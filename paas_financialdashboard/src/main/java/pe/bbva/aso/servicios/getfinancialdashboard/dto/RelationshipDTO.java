package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationshipDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("type")
	private TypeDTO type;

	public TypeDTO getType() {
		return type;
	}

	public void setType(TypeDTO type) {
		this.type = type;
	}
}

