package pe.bbva.aso.servicios.createcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("order")
	private String order;

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}

