package pe.bbva.aso.servicios.createchannelinformation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SalesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("manager")
	private String manager;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("subChannel")
	private String subChannel;

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getSubChannel() {
		return subChannel;
	}

	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}
}

