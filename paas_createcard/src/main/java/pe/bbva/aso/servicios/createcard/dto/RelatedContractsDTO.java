package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	/*@JsonProperty("relatedContract")
	private RelatedContractDTO relatedContract;

	public RelatedContractDTO getRelatedContract() {
		return relatedContract;
	}

	public void setRelatedContract(RelatedContractDTO relatedContract) {
		this.relatedContract = relatedContract;
	}*/
	
	@JsonProperty("relationType")
	private RelationTypeDTO relationType;

	@JsonProperty("contractId")
	private String contractId;

	public RelationTypeDTO getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationTypeDTO relationType) {
		this.relationType = relationType;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	
	
	
}

