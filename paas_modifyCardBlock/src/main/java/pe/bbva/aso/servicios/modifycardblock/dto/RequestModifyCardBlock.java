package pe.bbva.aso.servicios.modifycardblock.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyCardBlock implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("card-id")
	private String cardId;

	@JsonProperty("block-id")
	private String blockId;

	@JsonProperty("reason")
	private ReasonDTO reason;

	@JsonProperty("isActive")
	private String isActive;

	@JsonProperty("isReissued")
	private String isReissued;

	@JsonProperty("additionalInformation")
	private String additionalInformation;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	public ReasonDTO getReason() {
		return reason;
	}

	public void setReason(ReasonDTO reason) {
		this.reason = reason;
	}
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsReissued() {
		return isReissued;
	}

	public void setIsReissued(String isReissued) {
		this.isReissued = isReissued;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}   
}
