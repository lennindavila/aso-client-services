package pe.bbva.aso.servicios.createcontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateContactDetail extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private ContactDetailDTO data;

	public ContactDetailDTO getData() {
		return data;
	}

	public void setData(ContactDetailDTO data) {
		this.data = data;
	}  	
}
