package pe.bbva.aso.servicios.modifyindicator.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyIndicator implements Serializable {
    private static final long serialVersionUID = 1L;	
    
	@JsonProperty("customer-id")
	private String customerId;
	
	@JsonProperty("indicator-id")
	private String indicatorId;	
	
	@JsonProperty("data")
    private IndicatorDTO data;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(String indicatorId) {
		this.indicatorId = indicatorId;
	}	
	
	public IndicatorDTO getData() {
		return data;
	}

	public void setData(IndicatorDTO data) {
		this.data = data;
	}	
}
