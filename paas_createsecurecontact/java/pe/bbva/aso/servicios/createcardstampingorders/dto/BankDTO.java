package pe.bbva.aso.servicios.createcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("branch")
	private BranchDTO branch;

	public BranchDTO getBranch() {
		return branch;
	}

	public void setBranch(BranchDTO branch) {
		this.branch = branch;
	}
}

