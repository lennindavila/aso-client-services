package pe.bbva.aso.servicios.createaccount.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParticipantsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("participantType")
	private ParticipantTypeDTO participantType;

	@JsonProperty("participantId")
	private String participantId;

	public ParticipantTypeDTO getParticipantType() {
		return participantType;
	}

	public void setParticipantType(ParticipantTypeDTO participantType) {
		this.participantType = participantType;
	}
	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
}

