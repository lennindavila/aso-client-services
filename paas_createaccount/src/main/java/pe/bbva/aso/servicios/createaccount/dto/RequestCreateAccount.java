package pe.bbva.aso.servicios.createaccount.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("accountType")
	private AccountTypeDTO accountType;

	@JsonProperty("title")
	private TitleDTO title;

	@JsonProperty("joint")
	private JointDTO joint;

	@JsonProperty("offerId")
	private String offerId;

	@JsonProperty("bank")
	private BankDTO bank;

	@JsonProperty("participants")
	private List<ParticipantsDTO> participants;
	
	@JsonProperty("delivery")
	private DeliveryDTO delivery;	

	public AccountTypeDTO getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeDTO accountType) {
		this.accountType = accountType;
	}
	public TitleDTO getTitle() {
		return title;
	}

	public void setTitle(TitleDTO title) {
		this.title = title;
	}
	public JointDTO getJoint() {
		return joint;
	}

	public void setJoint(JointDTO joint) {
		this.joint = joint;
	}
	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public BankDTO getBank() {
		return bank;
	}

	public void setBank(BankDTO bank) {
		this.bank = bank;
	}
	public List<ParticipantsDTO> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantsDTO> participants) {
		this.participants = participants;
	}

	public DeliveryDTO getDelivery() {
		return delivery;
	}

	public void setDelivery(DeliveryDTO delivery) {
		this.delivery = delivery;
	}
}
