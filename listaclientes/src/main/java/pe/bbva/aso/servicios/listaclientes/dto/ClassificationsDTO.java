package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassificationsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("segments")
	private List<SegmentsDTO> segments;

	public List<SegmentsDTO> getSegments() {
		return segments;
	}

	public void setSegments(List<SegmentsDTO> segments) {
		this.segments = segments;
	}
}

