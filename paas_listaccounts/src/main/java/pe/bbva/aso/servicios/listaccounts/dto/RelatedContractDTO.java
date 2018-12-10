package pe.bbva.aso.servicios.listaccounts.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedContractDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("product")
	private ProductDTO product;

	@JsonProperty("relationType")
	private RelationTypeDTO relationType;

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public RelationTypeDTO getRelationType() {
		return relationType;
	}

	public void setRelationType(RelationTypeDTO relationType) {
		this.relationType = relationType;
	}
}

