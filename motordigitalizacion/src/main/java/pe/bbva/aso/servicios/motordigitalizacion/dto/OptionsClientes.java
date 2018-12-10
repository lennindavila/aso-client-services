package pe.bbva.aso.servicios.motordigitalizacion.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class OptionsClientes {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String codigoCentral;
	public String getCodigoCentral() { return codigoCentral; }
	public void setCodigoCentral(String codigoCentral) { this.codigoCentral = codigoCentral; }

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String tipoDocumento;
	public String getTipoDocumento() { return tipoDocumento; }
	public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; } 
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String nroDocumento;
	public String getNroDocumento() { return nroDocumento; }
	public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String email;
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String tipo;
	public String getTipo() { return tipo; }
	public void setTipo(String tipo) { this.tipo = tipo; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String idTrxHuellaDigital;
	public String getIdTrxHuellaDigital() { return idTrxHuellaDigital; }
	public void setIdTrxHuellaDigital(String idTrxHuellaDigital) { this.idTrxHuellaDigital = idTrxHuellaDigital; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected String nombreApellido;
	public String getNombreApellido() { return nombreApellido; }
	public void setNombreApellido(String nombreApellido) { this.nombreApellido = nombreApellido; }
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	protected List<OptionsItems> listaItems;	
	public List<OptionsItems> getListaItems() { return listaItems; }
	public void setListaItems(List<OptionsItems> listaItems) { this.listaItems = listaItems; }
	
}