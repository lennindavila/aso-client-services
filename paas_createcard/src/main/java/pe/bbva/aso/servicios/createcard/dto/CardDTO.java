package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("number")
	private String number;

	@JsonProperty("cardId")
	private String cardId;

	@JsonProperty("numberType")
	private NumberTypeDTO numberType;

	@JsonProperty("cardType")
	private CardTypeDTO cardType;

	@JsonProperty("brandAssociation")
	private BrandAssociationDTO brandAssociation;

	@JsonProperty("physicalSupport")
	private PhysicalSupportDTO physicalSupport;

	@JsonProperty("expirationDate")
	private String expirationDate;

	@JsonProperty("holderName")
	private String holderName;

	@JsonProperty("currencies")
	private List<CurrenciesDTO> currencies;

	@JsonProperty("grantedCredits")
	private List<GrantedCreditsDTO> grantedCredits;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("openingDate")
	private String openingDate;

	@JsonProperty("relatedContracts")
	private List<RelatedContractsDTO> relatedContracts;

	@JsonProperty("deliveriesManagement")
	private List<DeliveriesManagementDTO> deliveriesManagement;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public NumberTypeDTO getNumberType() {
		return numberType;
	}

	public void setNumberType(NumberTypeDTO numberType) {
		this.numberType = numberType;
	}
	public CardTypeDTO getCardType() {
		return cardType;
	}

	public void setCardType(CardTypeDTO cardType) {
		this.cardType = cardType;
	}
	public BrandAssociationDTO getBrandAssociation() {
		return brandAssociation;
	}

	public void setBrandAssociation(BrandAssociationDTO brandAssociation) {
		this.brandAssociation = brandAssociation;
	}
	public PhysicalSupportDTO getPhysicalSupport() {
		return physicalSupport;
	}

	public void setPhysicalSupport(PhysicalSupportDTO physicalSupport) {
		this.physicalSupport = physicalSupport;
	}
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public List<CurrenciesDTO> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<CurrenciesDTO> currencies) {
		this.currencies = currencies;
	}
	public List<GrantedCreditsDTO> getGrantedCredits() {
		return grantedCredits;
	}

	public void setGrantedCredits(List<GrantedCreditsDTO> grantedCredits) {
		this.grantedCredits = grantedCredits;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public List<RelatedContractsDTO> getRelatedContracts() {
		return relatedContracts;
	}

	public void setRelatedContracts(List<RelatedContractsDTO> relatedContracts) {
		this.relatedContracts = relatedContracts;
	}
	public List<DeliveriesManagementDTO> getDeliveriesManagement() {
		return deliveriesManagement;
	}

	public void setDeliveriesManagement(List<DeliveriesManagementDTO> deliveriesManagement) {
		this.deliveriesManagement = deliveriesManagement;
	}
}

