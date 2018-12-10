package pe.bbva.aso.servicios.motordigitalizacion.dto.request;

import java.io.Serializable;
import java.util.List;

public class RequestFileUnico implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private RequestListItems listaItems;
	private List<RequestListCliente> listaClientes;
	private String numeroContrato;
	private String oficinaGestora;
	private String procedencia;
	private String idContrato;
	private String idGrupo;
	private String gestDoc;
	
	public RequestListItems getListaItems() {
		return listaItems;
	}
	public void setListaItems(RequestListItems listaItems) {
		this.listaItems = listaItems;
	}
	public List<RequestListCliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<RequestListCliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getOficinaGestora() {
		return oficinaGestora;
	}
	public void setOficinaGestora(String oficinaGestora) {
		this.oficinaGestora = oficinaGestora;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	public String getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getGestDoc() {
		return gestDoc;
	}
	public void setGestDoc(String gestDoc) {
		this.gestDoc = gestDoc;
	}
}
