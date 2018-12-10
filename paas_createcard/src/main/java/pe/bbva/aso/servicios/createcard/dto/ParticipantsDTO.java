package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParticipantsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("participantId")
	private String participantId;

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
}

