package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("relationType")
	private RelationTypeDTO relationType;

	@JsonProperty("contractId")
	private String contractId;

	@JsonProperty("relatedContractId")
	private String relatedContractId;

	@JsonProperty("number")
	private String number;

	@JsonProperty("numberType")
	private NumberTypeDTO numberType;

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
	public String getRelatedContractId() {
		return relatedContractId;
	}

	public void setRelatedContractId(String relatedContractId) {
		this.relatedContractId = relatedContractId;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public NumberTypeDTO getNumberType() {
		return numberType;
	}

	public void setNumberType(NumberTypeDTO numberType) {
		this.numberType = numberType;
	}
}

