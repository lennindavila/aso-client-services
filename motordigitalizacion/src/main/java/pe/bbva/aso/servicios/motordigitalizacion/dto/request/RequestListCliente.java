package pe.bbva.aso.servicios.motordigitalizacion.dto.request;

import java.io.Serializable;
import java.util.List;

public class RequestListCliente  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigoCentral;
	private String tipoDocumento;
	private String nroDocumento;
	private String email;
	private String tipo;
	private String idTrxHuellaDigital;
	private String nombreApellido;
	private List<RequestListItems> listaItems;
	
	public String getCodigoCentral() {
		return codigoCentral;
	}
	public void setCodigoCentral(String codigoCentral) {
		this.codigoCentral = codigoCentral;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIdTrxHuellaDigital() {
		return idTrxHuellaDigital;
	}
	public void setIdTrxHuellaDigital(String idTrxHuellaDigital) {
		this.idTrxHuellaDigital = idTrxHuellaDigital;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public List<RequestListItems> getListaItems() {
		return listaItems;
	}
	public void setListaItems(List<RequestListItems> listaItems) {
		this.listaItems = listaItems;
	}
}
