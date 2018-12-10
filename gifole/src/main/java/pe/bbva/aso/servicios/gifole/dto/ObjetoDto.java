package pe.bbva.aso.servicios.gifole.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjetoDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("codigoCentral")
	private String codigoCentral;

	@JsonProperty("telefono")
	private String telefono;

	@JsonProperty("nombres")
	private String nombres;

	@JsonProperty("paterno")
	private String paterno;

	@JsonProperty("materno")
	private String materno;

	@JsonProperty("tipoCuenta")
	private String tipoCuenta;

	@JsonProperty("tipoMoneda")
	private String tipoMoneda;

	@JsonProperty("indPremio")
	private String indPremio;

	@JsonProperty("nombrePremio")
	private String nombrePremio;

	@JsonProperty("indTarjetaFisica")
	private String indTarjetaFisica;

	@JsonProperty("nroTarjetaAsociada")
	private String nroTarjetaAsociada;

	@JsonProperty("fechaNacimiento")
	private String fechaNacimiento;

	@JsonProperty("email")
	private String email;

	@JsonProperty("paisNacimiento")
	private String paisNacimiento;

	@JsonProperty("paisDomicilio")
	private String paisDomicilio;

	@JsonProperty("nacionalidad")
	private String nacionalidad;

	@JsonProperty("paisResidencia1")
	private String paisResidencia1;

	@JsonProperty("nroIdentificacion1")
	private String nroIdentificacion1;

	@JsonProperty("paisResidencia2")
	private String paisResidencia2;

	@JsonProperty("nroIdentificacion2")
	private String nroIdentificacion2;

	@JsonProperty("paisResidencia3")
	private String paisResidencia3;

	@JsonProperty("nroIdentificacion3")
	private String nroIdentificacion3;

	@JsonProperty("kitFatca")
	private String kitFatca;

	@JsonProperty("fechaFatca")
	private String fechaFatca;

	@JsonProperty("declaracionFatca")
	private String declaracionFatca;

	@JsonProperty("indNacionalidadFatca")
	private String indNacionalidadFatca;

	@JsonProperty("indCertificadoFacta")
	private String indCertificadoFacta;

	@JsonProperty("estadoActual")
	private String estadoActual;

	@JsonProperty("canal")
	private String canal;

	@JsonProperty("indOpcionRequisitos")
	private String indOpcionRequisitos;

	@JsonProperty("indPais")
	private String indPais;

	@JsonProperty("indNacionalidad")
	private String indNacionalidad;

	@JsonProperty("rbaRiesgo")
	private String rbaRiesgo;

	@JsonProperty("rbaDiligencia")
	private String rbaDiligencia;

	@JsonProperty("observacion")
	private String observacion;

	public String getCodigoCentral() {
		return codigoCentral;
	}

	public void setCodigoCentral(String codigoCentral) {
		this.codigoCentral = codigoCentral;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public String getIndPremio() {
		return indPremio;
	}

	public void setIndPremio(String indPremio) {
		this.indPremio = indPremio;
	}

	public String getNombrePremio() {
		return nombrePremio;
	}

	public void setNombrePremio(String nombrePremio) {
		this.nombrePremio = nombrePremio;
	}

	public String getIndTarjetaFisica() {
		return indTarjetaFisica;
	}

	public void setIndTarjetaFisica(String indTarjetaFisica) {
		this.indTarjetaFisica = indTarjetaFisica;
	}

	public String getNroTarjetaAsociada() {
		return nroTarjetaAsociada;
	}

	public void setNroTarjetaAsociada(String nroTarjetaAsociada) {
		this.nroTarjetaAsociada = nroTarjetaAsociada;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	public String getPaisDomicilio() {
		return paisDomicilio;
	}

	public void setPaisDomicilio(String paisDomicilio) {
		this.paisDomicilio = paisDomicilio;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getPaisResidencia1() {
		return paisResidencia1;
	}

	public void setPaisResidencia1(String paisResidencia1) {
		this.paisResidencia1 = paisResidencia1;
	}

	public String getNroIdentificacion1() {
		return nroIdentificacion1;
	}

	public void setNroIdentificacion1(String nroIdentificacion1) {
		this.nroIdentificacion1 = nroIdentificacion1;
	}

	public String getPaisResidencia2() {
		return paisResidencia2;
	}

	public void setPaisResidencia2(String paisResidencia2) {
		this.paisResidencia2 = paisResidencia2;
	}

	public String getNroIdentificacion2() {
		return nroIdentificacion2;
	}

	public void setNroIdentificacion2(String nroIdentificacion2) {
		this.nroIdentificacion2 = nroIdentificacion2;
	}

	public String getPaisResidencia3() {
		return paisResidencia3;
	}

	public void setPaisResidencia3(String paisResidencia3) {
		this.paisResidencia3 = paisResidencia3;
	}

	public String getNroIdentificacion3() {
		return nroIdentificacion3;
	}

	public void setNroIdentificacion3(String nroIdentificacion3) {
		this.nroIdentificacion3 = nroIdentificacion3;
	}

	public String getKitFatca() {
		return kitFatca;
	}

	public void setKitFatca(String kitFatca) {
		this.kitFatca = kitFatca;
	}

	public String getFechaFatca() {
		return fechaFatca;
	}

	public void setFechaFatca(String fechaFatca) {
		this.fechaFatca = fechaFatca;
	}

	public String getDeclaracionFatca() {
		return declaracionFatca;
	}

	public void setDeclaracionFatca(String declaracionFatca) {
		this.declaracionFatca = declaracionFatca;
	}

	public String getIndNacionalidadFatca() {
		return indNacionalidadFatca;
	}

	public void setIndNacionalidadFatca(String indNacionalidadFatca) {
		this.indNacionalidadFatca = indNacionalidadFatca;
	}

	public String getIndCertificadoFacta() {
		return indCertificadoFacta;
	}

	public void setIndCertificadoFacta(String indCertificadoFacta) {
		this.indCertificadoFacta = indCertificadoFacta;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getIndOpcionRequisitos() {
		return indOpcionRequisitos;
	}

	public void setIndOpcionRequisitos(String indOpcionRequisitos) {
		this.indOpcionRequisitos = indOpcionRequisitos;
	}

	public String getIndPais() {
		return indPais;
	}

	public void setIndPais(String indPais) {
		this.indPais = indPais;
	}

	public String getIndNacionalidad() {
		return indNacionalidad;
	}

	public void setIndNacionalidad(String indNacionalidad) {
		this.indNacionalidad = indNacionalidad;
	}

	public String getRbaRiesgo() {
		return rbaRiesgo;
	}

	public void setRbaRiesgo(String rbaRiesgo) {
		this.rbaRiesgo = rbaRiesgo;
	}

	public String getRbaDiligencia() {
		return rbaDiligencia;
	}

	public void setRbaDiligencia(String rbaDiligencia) {
		this.rbaDiligencia = rbaDiligencia;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}
