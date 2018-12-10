package pe.bbva.aso.servicios.createaccount.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateAccount extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private AccountDTO data;

	public AccountDTO getData() {
		return data;
	}

	public void setData(AccountDTO data) {
		this.data = data;
	} 
}
