package pe.bbva.aso.servicios.createrqcardstampingorders.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("order")
	private String order;

	@JsonProperty("cardType")
	private CardTypeDTO cardType;

	@JsonProperty("formatType")
	private String formatType;

	@JsonProperty("designType")
	private DesignTypeDTO designType;

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
	public CardTypeDTO getCardType() {
		return cardType;
	}

	public void setCardType(CardTypeDTO cardType) {
		this.cardType = cardType;
	}
	public String getFormatType() {
		return formatType;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}
	public DesignTypeDTO getDesignType() {
		return designType;
	}

	public void setDesignType(DesignTypeDTO designType) {
		this.designType = designType;
	}
}

