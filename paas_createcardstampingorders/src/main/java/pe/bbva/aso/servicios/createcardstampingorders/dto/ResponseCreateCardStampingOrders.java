package pe.bbva.aso.servicios.createcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateCardStampingOrders extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private CardStampingOrdersDTO data;

	public CardStampingOrdersDTO getData() {
		return data;
	}

	public void setData(CardStampingOrdersDTO data) {
		this.data = data;
	} 
}
