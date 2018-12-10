package pe.bbva.aso.servicios.createcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateCustomerTerm extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private CustomerTermDTO data;
	
	public CustomerTermDTO getData() {
		return data;
	}

	public void setData(CustomerTermDTO data) {
		this.data = data;
	}	
}
