package pe.bbva.aso.servicios.gifole.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseAperturaCuentaGifole extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("codigo")
	private String codigo;

	@JsonProperty("valor")
	private String valor;

	@JsonProperty("lista")
	private String lista;

	@JsonProperty("listaStock")
	private String listaStock;

	@JsonProperty("stockBean")
	private String stockBean;

	@JsonProperty("rba")
	private String rba;

	@JsonProperty("listaDetalle")
	private String listaDetalle;

	@JsonProperty("listaTcToc")
	private String listaTcToc;

	@JsonProperty("campaniaBean")
	private String campaniaBean;

	@JsonProperty("listaDetalleCampania")
	private String listaDetalleCampania;

	@JsonProperty("listaTarjetaFederacion")
	private String listaTarjetaFederacion;

	@JsonProperty("listaVidaRenta")
	private String listaVidaRenta;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public String getListaStock() {
		return listaStock;
	}

	public void setListaStock(String listaStock) {
		this.listaStock = listaStock;
	}

	public String getStockBean() {
		return stockBean;
	}

	public void setStockBean(String stockBean) {
		this.stockBean = stockBean;
	}

	public String getRba() {
		return rba;
	}

	public void setRba(String rba) {
		this.rba = rba;
	}

	public String getListaDetalle() {
		return listaDetalle;
	}

	public void setListaDetalle(String listaDetalle) {
		this.listaDetalle = listaDetalle;
	}

	public String getListaTcToc() {
		return listaTcToc;
	}

	public void setListaTcToc(String listaTcToc) {
		this.listaTcToc = listaTcToc;
	}

	public String getCampaniaBean() {
		return campaniaBean;
	}

	public void setCampaniaBean(String campaniaBean) {
		this.campaniaBean = campaniaBean;
	}

	public String getListaDetalleCampania() {
		return listaDetalleCampania;
	}

	public void setListaDetalleCampania(String listaDetalleCampania) {
		this.listaDetalleCampania = listaDetalleCampania;
	}

	public String getListaTarjetaFederacion() {
		return listaTarjetaFederacion;
	}

	public void setListaTarjetaFederacion(String listaTarjetaFederacion) {
		this.listaTarjetaFederacion = listaTarjetaFederacion;
	}

	public String getListaVidaRenta() {
		return listaVidaRenta;
	}

	public void setListaVidaRenta(String listaVidaRenta) {
		this.listaVidaRenta = listaVidaRenta;
	}
}