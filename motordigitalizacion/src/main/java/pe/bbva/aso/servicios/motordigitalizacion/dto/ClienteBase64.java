package pe.bbva.aso.servicios.motordigitalizacion.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ClienteBase64 {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String codCliente;
	public String getCodCliente() {return codCliente;}
	public void setCodCliente(String codCliente) {this.codCliente = codCliente;}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<DocumentoBase64> documentos;
	public List<DocumentoBase64> getDocumentos() {return documentos;}
	public void setDocumentos(List<DocumentoBase64> documentos) {this.documentos = documentos;}

}
