package pe.bbva.aso.servicios.getbankpositiondashboard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankPositionDashboardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("familyBalances")
	private List<FamilyBalancesDTO> familyBalances;

	@JsonProperty("assetsLocalCurrency")
	private AssetsLocalCurrencyDTO assetsLocalCurrency;

	@JsonProperty("assetsForeignCurrency")
	private AssetsForeignCurrencyDTO assetsForeignCurrency;

	@JsonProperty("liabilitiesLocalCurrency")
	private LiabilitiesLocalCurrencyDTO liabilitiesLocalCurrency;

	@JsonProperty("liabilitiesForeignCurrency")
	private LiabilitiesForeignCurrencyDTO liabilitiesForeignCurrency;

	@JsonProperty("assetProductsNumber")
	private String assetProductsNumber;

	@JsonProperty("liabilitytProductsNumber")
	private String liabilitytProductsNumber;

	@JsonProperty("insuranceContractsNumber")
	private String insuranceContractsNumber;

	@JsonProperty("insuranceBeneficiaryNumber")
	private String insuranceBeneficiaryNumber;

	public List<FamilyBalancesDTO> getFamilyBalances() {
		return familyBalances;
	}

	public void setFamilyBalances(List<FamilyBalancesDTO> familyBalances) {
		this.familyBalances = familyBalances;
	}
	public AssetsLocalCurrencyDTO getAssetsLocalCurrency() {
		return assetsLocalCurrency;
	}

	public void setAssetsLocalCurrency(AssetsLocalCurrencyDTO assetsLocalCurrency) {
		this.assetsLocalCurrency = assetsLocalCurrency;
	}
	public AssetsForeignCurrencyDTO getAssetsForeignCurrency() {
		return assetsForeignCurrency;
	}

	public void setAssetsForeignCurrency(AssetsForeignCurrencyDTO assetsForeignCurrency) {
		this.assetsForeignCurrency = assetsForeignCurrency;
	}
	public LiabilitiesLocalCurrencyDTO getLiabilitiesLocalCurrency() {
		return liabilitiesLocalCurrency;
	}

	public void setLiabilitiesLocalCurrency(LiabilitiesLocalCurrencyDTO liabilitiesLocalCurrency) {
		this.liabilitiesLocalCurrency = liabilitiesLocalCurrency;
	}
	public LiabilitiesForeignCurrencyDTO getLiabilitiesForeignCurrency() {
		return liabilitiesForeignCurrency;
	}

	public void setLiabilitiesForeignCurrency(LiabilitiesForeignCurrencyDTO liabilitiesForeignCurrency) {
		this.liabilitiesForeignCurrency = liabilitiesForeignCurrency;
	}
	public String getAssetProductsNumber() {
		return assetProductsNumber;
	}

	public void setAssetProductsNumber(String assetProductsNumber) {
		this.assetProductsNumber = assetProductsNumber;
	}
	public String getLiabilitytProductsNumber() {
		return liabilitytProductsNumber;
	}

	public void setLiabilitytProductsNumber(String liabilitytProductsNumber) {
		this.liabilitytProductsNumber = liabilitytProductsNumber;
	}
	public String getInsuranceContractsNumber() {
		return insuranceContractsNumber;
	}

	public void setInsuranceContractsNumber(String insuranceContractsNumber) {
		this.insuranceContractsNumber = insuranceContractsNumber;
	}
	public String getInsuranceBeneficiaryNumber() {
		return insuranceBeneficiaryNumber;
	}

	public void setInsuranceBeneficiaryNumber(String insuranceBeneficiaryNumber) {
		this.insuranceBeneficiaryNumber = insuranceBeneficiaryNumber;
	}
}

