package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("relatedContractId")
	private String relatedContractId;

	@JsonProperty("contractId")
	private String contractId;

	@JsonProperty("numberType")
	private NumberTypeDTO numberType;

	@JsonProperty("product")
	private ProductDTO product;

	@JsonProperty("relationType")
	private RelationTypeDTO relationType;

	public String getRelatedContractId() {
		return relatedContractId;
	}

	public void setRelatedContractId(String relatedContractId) {
		this.relatedContractId = relatedContractId;
	}
	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public NumberTypeDTO getNumberType() {
		return numberType;
	}

	public void setNumberType(NumberTypeDTO numberType) {
		this.numberType = numberType;
	}
	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public RelationTypeDTO getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationTypeDTO relationType) {
		this.relationType = relationType;
	}
}

