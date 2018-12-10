package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TermsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("termId")
	private String termId;

	@JsonProperty("status")
	private StatusDTO status;

	@JsonProperty("resolutionRoute")
	private ResolutionRouteDTO resolutionRoute;

	@JsonProperty("termVersion")
	private String termVersion;

	@JsonProperty("resolutionDate")
	private String resolutionDate;

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}
	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	public ResolutionRouteDTO getResolutionRoute() {
		return resolutionRoute;
	}

	public void setResolutionRoute(ResolutionRouteDTO resolutionRoute) {
		this.resolutionRoute = resolutionRoute;
	}
	public String getTermVersion() {
		return termVersion;
	}

	public void setTermVersion(String termVersion) {
		this.termVersion = termVersion;
	}
	public String getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(String resolutionDate) {
		this.resolutionDate = resolutionDate;
	}
}

