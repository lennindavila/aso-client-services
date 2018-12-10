package pe.bbva.aso.servicios.modifycardblock.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModifyCardBlock extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
    private List<ModifyCardBlockDTO> data;

	public List<ModifyCardBlockDTO> getData() {
		return data;
	}

	public void setData(List<ModifyCardBlockDTO> data) {
		this.data = data;
	}
}
