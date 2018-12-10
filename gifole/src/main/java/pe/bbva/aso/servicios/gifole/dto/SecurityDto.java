package pe.bbva.aso.servicios.gifole.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecurityDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("usuario")
	private String usuario;
	
	@JsonProperty("password")
	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

