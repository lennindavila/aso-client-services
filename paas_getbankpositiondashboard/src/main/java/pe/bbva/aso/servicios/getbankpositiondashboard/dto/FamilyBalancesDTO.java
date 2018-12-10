package pe.bbva.aso.servicios.getbankpositiondashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FamilyBalancesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("clasification")
	private ClasificationDTO clasification;

	@JsonProperty("isIncludeInService")
	private String isIncludeInService;

	@JsonProperty("name")
	private String name;

	@JsonProperty("amountLocalCurrency")
	private AmountLocalCurrencyDTO amountLocalCurrency;

	@JsonProperty("amountForeignCurrency")
	private AmountForeignCurrencyDTO amountForeignCurrency;

	@JsonProperty("productsNumber")
	private String productsNumber;

	public ClasificationDTO getClasification() {
		return clasification;
	}

	public void setClasification(ClasificationDTO clasification) {
		this.clasification = clasification;
	}
	public String getIsIncludeInService() {
		return isIncludeInService;
	}

	public void setIsIncludeInService(String isIncludeInService) {
		this.isIncludeInService = isIncludeInService;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public AmountLocalCurrencyDTO getAmountLocalCurrency() {
		return amountLocalCurrency;
	}

	public void setAmountLocalCurrency(AmountLocalCurrencyDTO amountLocalCurrency) {
		this.amountLocalCurrency = amountLocalCurrency;
	}
	public AmountForeignCurrencyDTO getAmountForeignCurrency() {
		return amountForeignCurrency;
	}

	public void setAmountForeignCurrency(AmountForeignCurrencyDTO amountForeignCurrency) {
		this.amountForeignCurrency = amountForeignCurrency;
	}
	public String getProductsNumber() {
		return productsNumber;
	}

	public void setProductsNumber(String productsNumber) {
		this.productsNumber = productsNumber;
	}
}

