package pe.bbva.aso.servicios.getcustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerTermDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("termId")
	private String termId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("resolutionDate")
	private String resolutionDate;

	@JsonProperty("termVersion")
	private String termVersion;

	@JsonProperty("resolutionRoute")
	private ResolutionRouteDTO resolutionRoute;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("businessAgent")
	private BusinessAgentDTO businessAgent;

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(String resolutionDate) {
		this.resolutionDate = resolutionDate;
	}
	public String getTermVersion() {
		return termVersion;
	}

	public void setTermVersion(String termVersion) {
		this.termVersion = termVersion;
	}
	public ResolutionRouteDTO getResolutionRoute() {
		return resolutionRoute;
	}

	public void setResolutionRoute(ResolutionRouteDTO resolutionRoute) {
		this.resolutionRoute = resolutionRoute;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	public BusinessAgentDTO getBusinessAgent() {
		return businessAgent;
	}

	public void setBusinessAgent(BusinessAgentDTO businessAgent) {
		this.businessAgent = businessAgent;
	}
}

