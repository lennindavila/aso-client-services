package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EconomicDataDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("occupationType")
	private OccupationTypeDTO occupationType;

	@JsonProperty("workPlace")
	private WorkplaceDTO workplace;

	@JsonProperty("incomes")
	private List<IncomesDTO> incomes;

	public OccupationTypeDTO getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(OccupationTypeDTO occupationType) {
		this.occupationType = occupationType;
	}
	public WorkplaceDTO getWorkplace() {
		return workplace;
	}

	public void setWorkplace(WorkplaceDTO workplace) {
		this.workplace = workplace;
	}
	public List<IncomesDTO> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<IncomesDTO> incomes) {
		this.incomes = incomes;
	}
}

