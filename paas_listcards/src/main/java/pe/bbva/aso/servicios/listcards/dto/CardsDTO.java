package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("number")
	private String number;

	@JsonProperty("cardId")
	private String cardId;

	@JsonProperty("expirationDate")
	private String expirationDate;

	@JsonProperty("holderName")
	private String holderName;

	@JsonProperty("numberType")
	private NumberTypeDTO numberType;

	@JsonProperty("currencies")
	private List<CurrenciesDTO> currencies;

	@JsonProperty("cardType")
	private CardTypeDTO cardType;

	@JsonProperty("physicalSupport")
	private PhysicalSupportDTO physicalSupport;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("availableBalance")
	private AvailableBalanceDTO availableBalance;

	@JsonProperty("disposedBalance")
	private DisposedBalanceDTO disposedBalance;

	@JsonProperty("title")
	private TitleDTO title;

	@JsonProperty("brandAssociation")
	private BrandAssociationDTO brandAssociation;

	@JsonProperty("grantedCredits")
	private List<GrantedCreditsDTO> grantedCredits;

	@JsonProperty("images")
	private List<ImagesDTO> images;

	@JsonProperty("relatedContracts")
	private List<RelatedContractsDTO> relatedContracts;

	@JsonProperty("blocks")
	private List<BlocksDTO> blocks;

	@JsonProperty("activations")
	private List<ActivationsDTO> activations;

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
	public NumberTypeDTO getNumberType() {
		return numberType;
	}

	public void setNumberType(NumberTypeDTO numberType) {
		this.numberType = numberType;
	}
	public List<CurrenciesDTO> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<CurrenciesDTO> currencies) {
		this.currencies = currencies;
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
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	public AvailableBalanceDTO getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(AvailableBalanceDTO availableBalance) {
		this.availableBalance = availableBalance;
	}
	public DisposedBalanceDTO getDisposedBalance() {
		return disposedBalance;
	}

	public void setDisposedBalance(DisposedBalanceDTO disposedBalance) {
		this.disposedBalance = disposedBalance;
	}
	public TitleDTO getTitle() {
		return title;
	}

	public void setTitle(TitleDTO title) {
		this.title = title;
	}
	public BrandAssociationDTO getBrandAssociation() {
		return brandAssociation;
	}

	public void setBrandAssociation(BrandAssociationDTO brandAssociation) {
		this.brandAssociation = brandAssociation;
	}
	public List<GrantedCreditsDTO> getGrantedCredits() {
		return grantedCredits;
	}

	public void setGrantedCredits(List<GrantedCreditsDTO> grantedCredits) {
		this.grantedCredits = grantedCredits;
	}

	public List<ImagesDTO> getImages() {
		return images;
	}

	public void setImages(List<ImagesDTO> images) {
		this.images = images;
	}
	public List<RelatedContractsDTO> getRelatedContracts() {
		return relatedContracts;
	}

	public void setRelatedContracts(List<RelatedContractsDTO> relatedContracts) {
		this.relatedContracts = relatedContracts;
	}
	public List<BlocksDTO> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<BlocksDTO> blocks) {
		this.blocks = blocks;
	}
	public List<ActivationsDTO> getActivations() {
		return activations;
	}

	public void setActivations(List<ActivationsDTO> activations) {
		this.activations = activations;
	}
}

