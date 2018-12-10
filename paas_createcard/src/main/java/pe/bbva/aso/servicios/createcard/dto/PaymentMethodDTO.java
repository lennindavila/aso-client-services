package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentMethodDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("endDay")
	private String endDay;

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
}

