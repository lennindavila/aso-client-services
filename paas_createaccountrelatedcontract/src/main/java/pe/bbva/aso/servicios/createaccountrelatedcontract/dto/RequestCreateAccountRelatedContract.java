package pe.bbva.aso.servicios.createaccountrelatedcontract.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateAccountRelatedContract implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("account-id")
	private String accountId;

	@JsonProperty("contractId")
	private String contractId;

	@JsonProperty("product")
	private ProductDTO product;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}   
}
