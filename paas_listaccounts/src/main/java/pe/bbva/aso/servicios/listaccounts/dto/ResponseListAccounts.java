package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseListAccounts extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
    private List<AccountDTO> data;

	public List<AccountDTO> getData() {
		return data;
	}

	public void setData(List<AccountDTO> data) {
		this.data = data;
	}	
}
