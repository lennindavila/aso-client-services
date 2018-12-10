package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateCard extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("data")
	private CardDTO data;

	public CardDTO getData() {
		return data;
	}

	public void setData(CardDTO data) {
		this.data = data;
	}
}
