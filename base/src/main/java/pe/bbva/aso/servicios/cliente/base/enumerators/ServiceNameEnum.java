package pe.bbva.aso.servicios.cliente.base.enumerators;

public enum ServiceNameEnum {
	APERTURACUENTAGIFOLE("01", "AperturaCuentaGifole"),
	BIOMETRICCLIENT("02", "BiometricClient"),
	CREATEACCOUNT("03", "CreateAccount"), 
	CREATEACCOUNTRELATEDCONTRACT("04", "CreateAccountRelatedContract"), 	
	CREATECARD("05", "CreateCard"),
	CREATECARDRELATEDCONTRACT("06", "CreateCardRelatedContract"),
	CREATECARDSTAMPINGORDERS("07", "CreateCardStampingOrders"),
	CREATECHANNELINFORMATION("08", "CreateChannelInformation"), 
	CREATECONTACTDETAIL("09", "CreateContactDetail"),
	CREATECUSTOMER("10", "CreateCustomer"),
	CREATECUSTOMERTERM("11", "CreateCustomerTerm"), 
	CREATECREDENTIALSENROLLMENTS("12", "CreateCredentialsEnrollments"), 
	CREATERQCARDSTAMPINGORDERS("13", "CreateRqCardStampingOrders"),
	CREATESECURECONTACT("14", "CreateSecureContact"), 
	GRANTINGTICKET("15", "GrantingTicket"), 
	GETFINANCIALDASHBOARD("16", "GetFinancialDashboard"),
	GETBANKPOSITIONDASHBOARD("17", "GetBankPositionDashboard"), 
	GETCUSTOMERTERM("18", "GetCustomerTerm"),
	GETDIGITALAFFILIATION("19", "GetDigitalAffiliation"),
	GETUSERPROFILE("20", "GetUserProfile"),
	LISTACCOUNTS("21", "ListAccounts"),
	LISTCARDS("22", "ListCards"), 
	LISTCATALOGS("23", "ListCatalogs"), 
	LISTCONTACTDETAIL("24", "ListContactDetail"),
	LISTCUSTOMERINDICATORS("25", "ListCustomerIndicators"), 
	LISTCUSTOMERS("26", "ListCustomers"),
	MOTORDIGITALIZACION("27", "MotorDigitalizacion"),
	MODIFYCARDACTIVATION("28", "ModifyCardActivation"),
	MODIFYCARD("29", "ModifyCard"), 
	MODIFYCARDBLOCK("30", "ModifyCardBlock"),	
	MODIFYCARDPIN("31", "ModifyCardPin"),
	MODIFYCONTACTDETAIL("32", "ModifyContactDetail"), 
	MODIFYCUSTOMERTERM("33", "ModifyCustomerTerm"),
	MODIFYINDICATOR("34", "ModifyIndicator"),	
	OBTENERCLIENTERENIEC("35", "ObtenerClienteReniec"),
	RBAONLINE("36", "rbaonline"),
	RENIEC("37", "Reniec"),
	NINGUNO("38", "Ninguno"); 

	private String codigo;
	private String descripcion;

	private ServiceNameEnum(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
