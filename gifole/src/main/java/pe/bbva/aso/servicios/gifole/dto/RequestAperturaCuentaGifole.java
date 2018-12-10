package pe.bbva.aso.servicios.gifole.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestAperturaCuentaGifole implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("tipo")
	private Integer tipo;
	
	@JsonProperty("objeto")
	private ObjetoDto objeto;
	
	@JsonProperty("security")
	private SecurityDto security;

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public ObjetoDto getObjeto() {
		return objeto;
	}

	public void setObjeto(ObjetoDto objeto) {
		this.objeto = objeto;
	}

	public SecurityDto getSecurity() {
		return security;
	}

	public void setSecurity(SecurityDto security) {
		this.security = security;
	}
}

