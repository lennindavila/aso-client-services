package pe.bbva.aso.servicios.getdigitalaffiliation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseGetDigitalAffiliation extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private DigitalAffiliationDTO data;

	public DigitalAffiliationDTO getData() {
		return data;
	}

	public void setData(DigitalAffiliationDTO data) {
		this.data = data;
	}
}
