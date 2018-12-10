package pe.bbva.aso.servicios.createchannelinformation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContractDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("manager")
	private String manager;

	@JsonProperty("subChannel")
	private String subChannel;

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getSubChannel() {
		return subChannel;
	}

	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}
}

