package pe.bbva.aso.servicios.listcards.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("paginationKey")
	private String paginationKey;

	@JsonProperty("pageSize")
	private String pageSize;

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

