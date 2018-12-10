package pe.bbva.aso.servicios.listcatalogs.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestListCatalogs implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("catalogId")
	private String catalogId;

	@JsonProperty("values")
	private ValuesDTO values;

	@JsonProperty("paginationKey")
	private String paginationKey;

	@JsonProperty("pageSize")
	private String pageSize;   
	
	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public ValuesDTO getValues() {
		return values;
	}

	public void setValues(ValuesDTO values) {
		this.values = values;
	}
	public String getPaginationKey() {
		return paginationKey;
	}

	public void setPaginationKey(String paginationKey) {
		this.paginationKey = paginationKey;
	}
	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
}
