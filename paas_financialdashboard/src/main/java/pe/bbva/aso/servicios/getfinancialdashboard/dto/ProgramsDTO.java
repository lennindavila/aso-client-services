package pe.bbva.aso.servicios.getfinancialdashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgramsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private TypeDTO type;

	@JsonProperty("availableLoyaltyUnitsBalance")
	private String availableLoyaltyUnitsBalance;

	@JsonProperty("token")
	private String token;

	@JsonProperty("currentLoyaltyUnitsBalance")
	private String currentLoyaltyUnitsBalance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public TypeDTO getType() {
		return type;
	}

	public void setType(TypeDTO type) {
		this.type = type;
	}
	public String getAvailableLoyaltyUnitsBalance() {
		return availableLoyaltyUnitsBalance;
	}

	public void setAvailableLoyaltyUnitsBalance(String availableLoyaltyUnitsBalance) {
		this.availableLoyaltyUnitsBalance = availableLoyaltyUnitsBalance;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getCurrentLoyaltyUnitsBalance() {
		return currentLoyaltyUnitsBalance;
	}

	public void setCurrentLoyaltyUnitsBalance(String currentLoyaltyUnitsBalance) {
		this.currentLoyaltyUnitsBalance = currentLoyaltyUnitsBalance;
	}
}

