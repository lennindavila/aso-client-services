package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EconomicDataDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("economicActivity")
	private EconomicActivityDTO economicActivity;

	@JsonProperty("occupationType")
	private OccupationTypeDTO occupationType;

	@JsonProperty("workplace")
	private WorkplaceDTO workplace;

	public EconomicActivityDTO getEconomicActivity() {
		return economicActivity;
	}

	public void setEconomicActivity(EconomicActivityDTO economicActivity) {
		this.economicActivity = economicActivity;
	}
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
}

