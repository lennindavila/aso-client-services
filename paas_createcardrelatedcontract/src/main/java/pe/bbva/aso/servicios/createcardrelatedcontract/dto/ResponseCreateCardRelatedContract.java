package pe.bbva.aso.servicios.createcardrelatedcontract.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateCardRelatedContract extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private CardRelatedContractDTO data;
	
	public CardRelatedContractDTO getData() {
		return data;
	}

	public void setData(CardRelatedContractDTO data) {
		this.data = data;
	} 	
}
