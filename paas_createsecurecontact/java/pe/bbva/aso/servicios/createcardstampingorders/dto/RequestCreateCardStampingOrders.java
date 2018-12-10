package pe.bbva.aso.servicios.createcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateCardStampingOrders implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("id")
	private String id;

	@JsonProperty("atm")
	private AtmDTO atm;

	@JsonProperty("bank")
	private BankDTO bank;

	@JsonProperty("card")
	private CardDTO card;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public AtmDTO getAtm() {
		return atm;
	}

	public void setAtm(AtmDTO atm) {
		this.atm = atm;
	}
	public BankDTO getBank() {
		return bank;
	}

	public void setBank(BankDTO bank) {
		this.bank = bank;
	}
	public CardDTO getCard() {
		return card;
	}

	public void setCard(CardDTO card) {
		this.card = card;
	}
}
