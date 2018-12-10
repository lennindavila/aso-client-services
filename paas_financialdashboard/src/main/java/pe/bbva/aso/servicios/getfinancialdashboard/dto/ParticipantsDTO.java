package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParticipantsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("relationship")
	private RelationshipDTO relationship;

	public RelationshipDTO getRelationship() {
		return relationship;
	}

	public void setRelationship(RelationshipDTO relationship) {
		this.relationship = relationship;
	}
}

