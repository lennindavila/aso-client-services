package pe.bbva.aso.servicios.createaccount.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("number")
	private String number;

	@JsonProperty("formats")
	private List<FormatsDTO> formats;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public List<FormatsDTO> getFormats() {
		return formats;
	}

	public void setFormats(List<FormatsDTO> formats) {
		this.formats = formats;
	}
}

