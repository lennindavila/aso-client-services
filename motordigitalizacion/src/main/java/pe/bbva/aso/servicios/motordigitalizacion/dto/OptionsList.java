
package pe.bbva.aso.servicios.motordigitalizacion.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OptionsList {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected String id;
    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected String name;
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}
