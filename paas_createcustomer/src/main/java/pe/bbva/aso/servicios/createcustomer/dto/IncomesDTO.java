package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncomesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("incomeValues")
	private List<IncomeValuesDTO> incomeValues;

	public List<IncomeValuesDTO> getIncomeValues() {
		return incomeValues;
	}

	public void setIncomeValues(List<IncomeValuesDTO> incomeValues) {
		this.incomeValues = incomeValues;
	}
}

