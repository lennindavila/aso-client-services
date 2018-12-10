package pe.bbva.aso.servicios.motordigitalizacion.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FileUnicoBase64 {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<DocumentoBase64> documentos;
	public List<DocumentoBase64> getDocumentos() {return documentos;}
	public void setDocumentos(List<DocumentoBase64> documentos) {this.documentos = documentos;}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<ClienteBase64> clientes;
	public List<ClienteBase64> getClientes() {return clientes;}
	public void setClientes(List<ClienteBase64> clientes) {	this.clientes = clientes;}

}
