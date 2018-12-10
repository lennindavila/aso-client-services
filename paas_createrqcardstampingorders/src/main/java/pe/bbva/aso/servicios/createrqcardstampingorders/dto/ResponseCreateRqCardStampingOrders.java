package pe.bbva.aso.servicios.createrqcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateRqCardStampingOrders extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private RqCardStampingOrdersDTO data;

	public RqCardStampingOrdersDTO getData() {
		return data;
	}

	public void setData(RqCardStampingOrdersDTO data) {
		this.data = data;
	} 
}
