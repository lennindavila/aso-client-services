package pe.bbva.aso.servicios.cliente.base.enumerators;

public enum AperturaCuentaEnum {
	OBTENERDATOSUSUARIO("38", "ObtenerDatosUsuario"),
	ALTACLIENTE("39", "AltaCliente"),
	ALTACUENTA("40", "AltaCuenta"),
	ALTATARJETA("41", "AltaTarjeta"),
	ACTUALIZARCLIENTE("42", "ActualizarCliente");
	
	private String codigo;
	private String descripcion;
	
	private AperturaCuentaEnum(String codigo, String descripcion){
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
