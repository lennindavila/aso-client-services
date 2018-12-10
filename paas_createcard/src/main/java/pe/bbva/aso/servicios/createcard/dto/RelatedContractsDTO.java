package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("relatedContract")
	private RelatedContractDTO relatedContract;

	public RelatedContractDTO getRelatedContract() {
		return relatedContract;
	}

	public void setRelatedContract(RelatedContractDTO relatedContract) {
		this.relatedContract = relatedContract;
	}
}

