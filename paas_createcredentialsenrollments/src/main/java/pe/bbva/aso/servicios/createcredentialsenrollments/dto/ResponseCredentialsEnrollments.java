package pe.bbva.aso.servicios.createcredentialsenrollments.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCredentialsEnrollments extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("version")
	private String version;
	@JsonProperty("severity")
	private String severity;
	@JsonProperty("http-status")
	private String httpstatus;
	@JsonProperty("error-code")
	private String errorcode;
	@JsonProperty("error-message")
	private String errormessage;
	@JsonProperty("consumer-request-id")
	private String consumerrequestid;
	@JsonProperty("system-error-code")
	private String systemerrorcode;
	@JsonProperty("system-error-description")
	private String systemerrordescription;
	@JsonProperty("system-error-cause")
	private String systemerrorcause;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getHttpstatus() {
		return httpstatus;
	}
	public void setHttpstatus(String httpstatus) {
		this.httpstatus = httpstatus;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public String getConsumerrequestid() {
		return consumerrequestid;
	}
	public void setConsumerrequestid(String consumerrequestid) {
		this.consumerrequestid = consumerrequestid;
	}
	public String getSystemerrorcode() {
		return systemerrorcode;
	}
	public void setSystemerrorcode(String systemerrorcode) {
		this.systemerrorcode = systemerrorcode;
	}
	public String getSystemerrordescription() {
		return systemerrordescription;
	}
	public void setSystemerrordescription(String systemerrordescription) {
		this.systemerrordescription = systemerrordescription;
	}
	public String getSystemerrorcause() {
		return systemerrorcause;
	}
	public void setSystemerrorcause(String systemerrorcause) {
		this.systemerrorcause = systemerrorcause;
	}
}
