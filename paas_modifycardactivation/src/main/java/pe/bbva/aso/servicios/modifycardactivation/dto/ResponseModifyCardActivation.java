package pe.bbva.aso.servicios.modifycardactivation.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModifyCardActivation extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private CardActivationDTO cardActivation;

	public CardActivationDTO getCardActivation() {
		return cardActivation;
	}

	public void setCardActivation(CardActivationDTO cardActivation) {
		this.cardActivation = cardActivation;
	}
}
