package pe.bbva.aso.servicios.createrqcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateRqCardStampingOrders implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("bank")
	private BankDTO bank;

	@JsonProperty("atm")
	private AtmDTO atm;

	@JsonProperty("card")
	private CardDTO card;

	public BankDTO getBank() {
		return bank;
	}

	public void setBank(BankDTO bank) {
		this.bank = bank;
	}
	public AtmDTO getAtm() {
		return atm;
	}

	public void setAtm(AtmDTO atm) {
		this.atm = atm;
	}
	public CardDTO getCard() {
		return card;
	}

	public void setCard(CardDTO card) {
		this.card = card;
	}
}
