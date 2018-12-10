package pe.bbva.aso.servicios.createcardrelatedcontract.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateCardRelatedContract implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("card-id")
	private String cardId;

	@JsonProperty("contractId")
	private String contractId;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	} 
}
