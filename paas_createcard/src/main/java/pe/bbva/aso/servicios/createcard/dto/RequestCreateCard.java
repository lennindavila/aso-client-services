package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateCard implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("participants")
	private List<ParticipantsDTO> participants;

	@JsonProperty("cardType")
	private CardTypeDTO cardType;

	@JsonProperty("physicalSupport")
	private PhysicalSupportDTO physicalSupport;

	@JsonProperty("relatedContracts")
	private List<RelatedContractsDTO> relatedContracts;

	@JsonProperty("number")
	private String number;

	@JsonProperty("title")
	private TitleDTO title;

	@JsonProperty("cutOffDay")
	private String cutOffDay;

	@JsonProperty("paymentMethod")
	private PaymentMethodDTO paymentMethod;

	@JsonProperty("statementType")
	private String statementType;

	@JsonProperty("grantedCredits")
	private List<GrantedCreditsDTO> grantedCredits;

	@JsonProperty("delivery")
	private DeliveryDTO delivery;

	@JsonProperty("memberships")
	private List<MembershipsDTO> memberships;

	@JsonProperty("supportContractType")
	private String supportContractType;

	@JsonProperty("deliveriesManagement")
	private List<DeliveriesManagementDTO> deliveriesManagement;

	@JsonProperty("contractingBusinessAgent")
	private ContractingBusinessAgentDTO contractingBusinessAgent;

	@JsonProperty("marketBusinessAgent")
	private MarketBusinessAgentDTO marketBusinessAgent;

	@JsonProperty("image")
	private ImageDTO image;

	@JsonProperty("offerId")
	private String offerId;

	@JsonProperty("managementBranch")
	private ManagementBranchDTO managementBranch;

	@JsonProperty("contractingBranch")
	private ContractingBranchDTO contractingBranch;

	public List<ParticipantsDTO> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantsDTO> participants) {
		this.participants = participants;
	}
	public CardTypeDTO getCardType() {
		return cardType;
	}

	public void setCardType(CardTypeDTO cardType) {
		this.cardType = cardType;
	}
	public PhysicalSupportDTO getPhysicalSupport() {
		return physicalSupport;
	}

	public void setPhysicalSupport(PhysicalSupportDTO physicalSupport) {
		this.physicalSupport = physicalSupport;
	}
	public List<RelatedContractsDTO> getRelatedContracts() {
		return relatedContracts;
	}

	public void setRelatedContracts(List<RelatedContractsDTO> relatedContracts) {
		this.relatedContracts = relatedContracts;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public TitleDTO getTitle() {
		return title;
	}

	public void setTitle(TitleDTO title) {
		this.title = title;
	}
	public String getCutOffDay() {
		return cutOffDay;
	}

	public void setCutOffDay(String cutOffDay) {
		this.cutOffDay = cutOffDay;
	}
	public PaymentMethodDTO getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethodDTO paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getStatementType() {
		return statementType;
	}

	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}
	public List<GrantedCreditsDTO> getGrantedCredits() {
		return grantedCredits;
	}

	public void setGrantedCredits(List<GrantedCreditsDTO> grantedCredits) {
		this.grantedCredits = grantedCredits;
	}
	public DeliveryDTO getDelivery() {
		return delivery;
	}

	public void setDelivery(DeliveryDTO delivery) {
		this.delivery = delivery;
	}
	public List<MembershipsDTO> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<MembershipsDTO> memberships) {
		this.memberships = memberships;
	}
	public String getSupportContractType() {
		return supportContractType;
	}

	public void setSupportContractType(String supportContractType) {
		this.supportContractType = supportContractType;
	}
	public List<DeliveriesManagementDTO> getDeliveriesManagement() {
		return deliveriesManagement;
	}

	public void setDeliveriesManagement(List<DeliveriesManagementDTO> deliveriesManagement) {
		this.deliveriesManagement = deliveriesManagement;
	}
	public ContractingBusinessAgentDTO getContractingBusinessAgent() {
		return contractingBusinessAgent;
	}

	public void setContractingBusinessAgent(ContractingBusinessAgentDTO contractingBusinessAgent) {
		this.contractingBusinessAgent = contractingBusinessAgent;
	}
	public MarketBusinessAgentDTO getMarketBusinessAgent() {
		return marketBusinessAgent;
	}

	public void setMarketBusinessAgent(MarketBusinessAgentDTO marketBusinessAgent) {
		this.marketBusinessAgent = marketBusinessAgent;
	}
	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}
	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public ManagementBranchDTO getManagementBranch() {
		return managementBranch;
	}

	public void setManagementBranch(ManagementBranchDTO managementBranch) {
		this.managementBranch = managementBranch;
	}
	public ContractingBranchDTO getContractingBranch() {
		return contractingBranch;
	}

	public void setContractingBranch(ContractingBranchDTO contractingBranch) {
		this.contractingBranch = contractingBranch;
	}
}
