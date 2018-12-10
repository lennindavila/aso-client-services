package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestListCards implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("customer")
	private CustomerDTO customer;

	@JsonProperty("cardType")
	private CardTypeDTO cardType;

	@JsonProperty("physicalSupport")
	private PhysicalSupportDTO physicalSupport;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("paginationKey")
	private String paginationKey;

	@JsonProperty("pageSize")
	private String pageSize;

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
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
}
