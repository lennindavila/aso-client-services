package pe.bbva.aso.servicios.modifycustomerterm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModifyCustomerTerm extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
}
