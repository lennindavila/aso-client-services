package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseListCards extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@JsonProperty("data")
    private List<CardsDTO> data;

	public List<CardsDTO> getData() {
		return data;
	}

	public void setData(List<CardsDTO> data) {
		this.data = data;
	}
}
