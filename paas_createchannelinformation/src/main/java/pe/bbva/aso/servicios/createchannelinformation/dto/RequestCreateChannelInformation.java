package pe.bbva.aso.servicios.createchannelinformation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateChannelInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("sales")
	private SalesDTO sales;

	@JsonProperty("contract")
	private ContractDTO contract;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public SalesDTO getSales() {
		return sales;
	}

	public void setSales(SalesDTO sales) {
		this.sales = sales;
	}
	public ContractDTO getContract() {
		return contract;
	}

	public void setContract(ContractDTO contract) {
		this.contract = contract;
	}    
}
