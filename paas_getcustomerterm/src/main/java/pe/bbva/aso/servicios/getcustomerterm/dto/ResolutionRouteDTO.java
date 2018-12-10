package pe.bbva.aso.servicios.getcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResolutionRouteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("channel")
	private ChannelDTO channel;

	public ChannelDTO getChannel() {
		return channel;
	}

	public void setChannel(ChannelDTO channel) {
		this.channel = channel;
	}
}

