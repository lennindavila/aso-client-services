package pe.bbva.aso.servicios.motordigitalizacion.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FileUnico {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<OptionsItems> listaItems;
	public List<OptionsItems> getListaItems() {	return listaItems; }
	public void setListaItems(List<OptionsItems> listaItems) { this.listaItems = listaItems; }

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<OptionsClientes> listaClientes;
	public List<OptionsClientes> getListaClientes() { return listaClientes;	}
	public void setListaClientes(List<OptionsClientes> listaClientes) { this.listaClientes = listaClientes;	}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String numeroContrato;
	public String getNumeroContrato() { return numeroContrato; }
	public void setNumeroContrato(String numeroContrato) { this.numeroContrato = numeroContrato; }

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String oficinaGestora;
	public String getOficinaGestora() { return oficinaGestora; }
	public void setOficinaGestora(String oficinaGestora) { this.oficinaGestora = oficinaGestora; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String procedencia;
	public String getProcedencia() { return procedencia; }
	public void setProcedencia(String procedencia) { this.procedencia = procedencia; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String idContrato;
	public String getIdContrato() { return idContrato; }
	public void setIdContrato(String idContrato) { this.idContrato = idContrato; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String idGrupo;
	public String getIdGrupo() { return idGrupo; }
	public void setIdGrupo(String idGrupo) { this.idGrupo = idGrupo; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String gestDoc;
	public String getGestDoc() { return gestDoc; }
	public void setGestDoc(String gestDoc) { this.gestDoc = gestDoc; }
	
}