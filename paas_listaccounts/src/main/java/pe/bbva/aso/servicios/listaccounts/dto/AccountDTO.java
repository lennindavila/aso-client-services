package pe.bbva.aso.servicios.listaccounts.dto;

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

	@JsonProperty("availableBalance")
	private AvailableBalanceDTO availableBalance;

	@JsonProperty("balances")
	private List<BalancesDTO> balances;

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
	public AvailableBalanceDTO getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(AvailableBalanceDTO availableBalance) {
		this.availableBalance = availableBalance;
	}
	public List<BalancesDTO> getBalances() {
		return balances;
	}

	public void setBalances(List<BalancesDTO> balances) {
		this.balances = balances;
	}
}

