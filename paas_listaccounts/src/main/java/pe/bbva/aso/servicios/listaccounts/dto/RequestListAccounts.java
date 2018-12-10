package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestListAccounts implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("relatedContract")
	private RelatedContractDTO relatedContract;

	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("accountFamily")
	private AccountFamilyDTO accountFamily;

	@JsonProperty("accountType")
	private AccountTypeDTO accountType;

	@JsonProperty("number")
	private String number;

	@JsonProperty("currencies")
	private CurrenciesDTO currencies;

	@JsonProperty("fromAvailableBalance")
	private FromAvailableBalanceDTO fromAvailableBalance;

	@JsonProperty("toAvailableBalance")
	private ToAvailableBalanceDTO toAvailableBalance;

	@JsonProperty("joint")
	private JointDTO joint;

	@JsonProperty("vnd")
	private VndDTO vnd;

	@JsonProperty("customized-formats")
	private CustomizedFormatsDTO customizedFormats;

	@JsonProperty("paginationKey")
	private String paginationKey;

	@JsonProperty("pageSize")
	private String pageSize;

	@JsonProperty("expand")
	private String expand;

	@JsonProperty("pagination")
	private PaginationDTO pagination;

	public RelatedContractDTO getRelatedContract() {
		return relatedContract;
	}

	public void setRelatedContract(RelatedContractDTO relatedContract) {
		this.relatedContract = relatedContract;
	}
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public AccountFamilyDTO getAccountFamily() {
		return accountFamily;
	}

	public void setAccountFamily(AccountFamilyDTO accountFamily) {
		this.accountFamily = accountFamily;
	}
	public AccountTypeDTO getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeDTO accountType) {
		this.accountType = accountType;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public CurrenciesDTO getCurrencies() {
		return currencies;
	}

	public void setCurrencies(CurrenciesDTO currencies) {
		this.currencies = currencies;
	}
	public FromAvailableBalanceDTO getFromAvailableBalance() {
		return fromAvailableBalance;
	}

	public void setFromAvailableBalance(FromAvailableBalanceDTO fromAvailableBalance) {
		this.fromAvailableBalance = fromAvailableBalance;
	}
	public ToAvailableBalanceDTO getToAvailableBalance() {
		return toAvailableBalance;
	}

	public void setToAvailableBalance(ToAvailableBalanceDTO toAvailableBalance) {
		this.toAvailableBalance = toAvailableBalance;
	}
	public JointDTO getJoint() {
		return joint;
	}

	public void setJoint(JointDTO joint) {
		this.joint = joint;
	}
	public VndDTO getVnd() {
		return vnd;
	}

	public void setVnd(VndDTO vnd) {
		this.vnd = vnd;
	}
	public CustomizedFormatsDTO getCustomizedFormats() {
		return customizedFormats;
	}

	public void setCustomizedFormats(CustomizedFormatsDTO customizedFormats) {
		this.customizedFormats = customizedFormats;
	}
	public String getPaginationKey() {
		return paginationKey;
	}

	public void setPaginationKey(String paginationKey) {
		this.paginationKey = paginationKey;
	}
	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}
	public PaginationDTO getPagination() {
		return pagination;
	}

	public void setPagination(PaginationDTO pagination) {
		this.pagination = pagination;
	}   
}
