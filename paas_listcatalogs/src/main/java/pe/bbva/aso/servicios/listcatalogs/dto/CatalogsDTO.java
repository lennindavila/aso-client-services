package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("values")
	private ValuesDTO values;

	public ValuesDTO getValues() {
		return values;
	}

	public void setValues(ValuesDTO values) {
		this.values = values;
	}
}

