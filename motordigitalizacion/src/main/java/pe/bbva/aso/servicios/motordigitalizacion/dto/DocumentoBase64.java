package pe.bbva.aso.servicios.motordigitalizacion.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DocumentoBase64 {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String descripcion;
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String estado;
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado = estado;}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String documento;
	public String getDocumento() {return documento;}
	public void setDocumento(String documento) {this.documento = documento;}
	
}
