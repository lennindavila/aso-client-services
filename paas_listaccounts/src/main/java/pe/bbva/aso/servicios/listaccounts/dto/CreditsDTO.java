package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("totalTransactions")
	private String totalTransactions;

	@JsonProperty("balance")
	private BalanceDTO balance;

	public String getTotalTransactions() {
		return totalTransactions;
	}

	public void setTotalTransactions(String totalTransactions) {
		this.totalTransactions = totalTransactions;
	}
	public BalanceDTO getBalance() {
		return balance;
	}

	public void setBalance(BalanceDTO balance) {
		this.balance = balance;
	}
}

