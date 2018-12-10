package pe.bbva.aso.servicios.cliente.base.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("version")
	private String version;

	@JsonProperty("severity")
	private String severity;

	@JsonProperty("http-status")
	private String httpStatus;

	@JsonProperty("error-code")
	private String errorCode;

	@JsonProperty("error-message")
	private String errorMessage;

	@JsonProperty("consumer-request-id")
	private String consumerRequestId;

	@JsonProperty("system-error-code")
	private String systemErrorCode;

	@JsonProperty("system-error-description")
	private String systemErrorDescription;
	
	private Boolean error = false;
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		error = true;
		this.version = version;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		error = true;
		this.severity = severity;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(String httpStatus) {
		error = true;
		this.httpStatus = httpStatus;
	}

	public String getErrorCode() {		
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		error = true;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		error = true;
		this.errorMessage = errorMessage;
	}

	public String getConsumerRequestId() {
		return consumerRequestId;
	}

	public void setConsumerRequestId(String consumerRequestId) {
		error = true;
		this.consumerRequestId = consumerRequestId;
	}

	public String getSystemErrorCode() {
		return systemErrorCode;
	}

	public void setSystemErrorCode(String systemErrorCode) {
		error = true;
		this.systemErrorCode = systemErrorCode;
	}

	public String getSystemErrorDescription() {
		return systemErrorDescription;
	}

	public void setSystemErrorDescription(String systemErrorDescription) {
		error = true;
		this.systemErrorDescription = systemErrorDescription;
	}
	
	public Boolean hasError() {
		if(Integer.parseInt((httpStatus==null?"200":httpStatus))!=200)return true;
		return false;
	}
}