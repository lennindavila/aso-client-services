package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseListCatalogs extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("data")
	private List<CatalogsDTO> data;

	@JsonProperty("pagination")
	private PaginationDTO pagination;


	public List<CatalogsDTO> getData() {
		return data;
	}

	public void setData(List<CatalogsDTO> data) {
		this.data = data;
	}
	public PaginationDTO getPagination() {
		return pagination;
	}

	public void setPagination(PaginationDTO pagination) {
		this.pagination = pagination;
	}	
}
