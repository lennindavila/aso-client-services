package pe.bbva.aso.servicios.motordigitalizacion.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class OptionsItems {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String label;
	public String getLabel() { return label; }
	public void setLabel(String label) { this.label = label; }

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String value;
	public String getValue() { return value; }
	public void setValue(String value) { this.value = value; }
	
}