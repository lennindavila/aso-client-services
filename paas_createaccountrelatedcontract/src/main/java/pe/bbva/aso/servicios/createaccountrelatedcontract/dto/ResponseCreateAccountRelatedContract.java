package pe.bbva.aso.servicios.createaccountrelatedcontract.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateAccountRelatedContract extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private AccountRelatedContractDTO data;
	
	public AccountRelatedContractDTO getData() {
		return data;
	}

	public void setData(AccountRelatedContractDTO data) {
		this.data = data;
	}	
}
