package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContractDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("product")
	private ProductDTO product;

	@JsonProperty("userCustomization")
	private UserCustomizationDTO userCustomization;

	@JsonProperty("participants")
	private List<ParticipantsDTO> participants;

	@JsonProperty("currency")
	private CurrencyDTO currency;

	@JsonProperty("currentBalance")
	private CurrentBalanceDTO currentBalance;

	@JsonProperty("availableBalance")
	private AvailableBalanceDTO availableBalance;

	@JsonProperty("issuingCompanyCode")
	private String issuingCompanyCode;

	@JsonProperty("formats")
	private FormatsDTO formats;

	@JsonProperty("limits")
	private LimitsDTO limits;

	@JsonProperty("pendingamount")
	private PendingamountDTO pendingamount;

	@JsonProperty("nextPaymentDate")
	private String nextPaymentDate;

	@JsonProperty("unpaidAmount")
	private UnpaidAmountDTO unpaidAmount;

	@JsonProperty("awardedAmount")
	private AwardedAmountDTO awardedAmount;

	@JsonProperty("indicators")
	private IndicatorsDTO indicators;

	@JsonProperty("sharesNumber")
	private String sharesNumber;

	@JsonProperty("liquidValue")
	private LiquidValueDTO liquidValue;

	@JsonProperty("balance")
	private BalanceDTO balance;

	@JsonProperty("extendedData")
	private ExtendedDataDTO extendedData;

	@JsonProperty("hasFinancialTransactions")
	private String hasFinancialTransactions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public UserCustomizationDTO getUserCustomization() {
		return userCustomization;
	}

	public void setUserCustomization(UserCustomizationDTO userCustomization) {
		this.userCustomization = userCustomization;
	}
	public List<ParticipantsDTO> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantsDTO> participants) {
		this.participants = participants;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public CurrentBalanceDTO getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(CurrentBalanceDTO currentBalance) {
		this.currentBalance = currentBalance;
	}
	public AvailableBalanceDTO getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(AvailableBalanceDTO availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getIssuingCompanyCode() {
		return issuingCompanyCode;
	}

	public void setIssuingCompanyCode(String issuingCompanyCode) {
		this.issuingCompanyCode = issuingCompanyCode;
	}
	public FormatsDTO getFormats() {
		return formats;
	}

	public void setFormats(FormatsDTO formats) {
		this.formats = formats;
	}
	public LimitsDTO getLimits() {
		return limits;
	}

	public void setLimits(LimitsDTO limits) {
		this.limits = limits;
	}
	public PendingamountDTO getPendingamount() {
		return pendingamount;
	}

	public void setPendingamount(PendingamountDTO pendingamount) {
		this.pendingamount = pendingamount;
	}
	public String getNextPaymentDate() {
		return nextPaymentDate;
	}

	public void setNextPaymentDate(String nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	}
	public UnpaidAmountDTO getUnpaidAmount() {
		return unpaidAmount;
	}

	public void setUnpaidAmount(UnpaidAmountDTO unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	public AwardedAmountDTO getAwardedAmount() {
		return awardedAmount;
	}

	public void setAwardedAmount(AwardedAmountDTO awardedAmount) {
		this.awardedAmount = awardedAmount;
	}
	public IndicatorsDTO getIndicators() {
		return indicators;
	}

	public void setIndicators(IndicatorsDTO indicators) {
		this.indicators = indicators;
	}
	public String getSharesNumber() {
		return sharesNumber;
	}

	public void setSharesNumber(String sharesNumber) {
		this.sharesNumber = sharesNumber;
	}
	public LiquidValueDTO getLiquidValue() {
		return liquidValue;
	}

	public void setLiquidValue(LiquidValueDTO liquidValue) {
		this.liquidValue = liquidValue;
	}
	public BalanceDTO getBalance() {
		return balance;
	}

	public void setBalance(BalanceDTO balance) {
		this.balance = balance;
	}
	public ExtendedDataDTO getExtendedData() {
		return extendedData;
	}

	public void setExtendedData(ExtendedDataDTO extendedData) {
		this.extendedData = extendedData;
	}
	public String getHasFinancialTransactions() {
		return hasFinancialTransactions;
	}

	public void setHasFinancialTransactions(String hasFinancialTransactions) {
		this.hasFinancialTransactions = hasFinancialTransactions;
	}
}

