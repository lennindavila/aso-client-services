package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("relatedContractId")
	private String relatedContractId;

	@JsonProperty("number")
	private String number;

	@JsonProperty("contractId")
	private String contractId;

	@JsonProperty("numberType")
	private NumberTypeDTO numberType;

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
}

