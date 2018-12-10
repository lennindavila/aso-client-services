package pe.bbva.aso.servicios.createchannelinformation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateChannelInformation extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
    private ChannelInformationDTO data;

	public ChannelInformationDTO getData() {
		return data;
	}

	public void setData(ChannelInformationDTO data) {
		this.data = data;
	}	
}
