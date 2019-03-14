package pe.bbva.aso.servicios.cliente.base.bean;

import java.io.Serializable;

public class TsecBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tsec;

	public String getTsec() {
		return tsec;
	}

	public void setTsec(String tsec) {
		this.tsec = tsec;
	}
}
