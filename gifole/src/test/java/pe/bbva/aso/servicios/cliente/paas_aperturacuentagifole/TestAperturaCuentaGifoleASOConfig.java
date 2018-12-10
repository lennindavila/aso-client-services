package pe.bbva.aso.servicios.cliente.paas_aperturacuentagifole;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.gifole.config.AperturaCuentaGifoleASOConfig;
import pe.bbva.aso.servicios.gifole.dto.ObjetoDto;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.SecurityDto;


public class TestAperturaCuentaGifoleASOConfig {

	@Test
	public void consultar() {
	
		AperturaCuentaGifoleASOConfig obj = new AperturaCuentaGifoleASOConfig();
		RequestAperturaCuentaGifole filtro = new RequestAperturaCuentaGifole();

		filtro.setTipo(9);
		SecurityDto security = new SecurityDto();
		security.setUsuario("TEVHTw==");
		security.setPassword("R0lGT0xFX1dT");
		
		ObjetoDto objeto = new ObjetoDto();
		objeto.setCodigoCentral("90015761");
		objeto.setTelefono("998569875");
		objeto.setNombres("EDUARDO EDUARDO FLOW");
		objeto.setPaterno("SANCHEZ");
		objeto.setMaterno("CASTILLO");
		objeto.setTipoCuenta("CUENTA GANADORA");
		objeto.setTipoMoneda("SOLES");
		objeto.setIndPremio("SI");
		objeto.setNombrePremio("3Maleta Spin Air  Grande");
		objeto.setIndTarjetaFisica("SI");
		objeto.setNroTarjetaAsociada("4140899022002347");
		objeto.setEmail("EDUARDO.SANCHEZ.CASTILLO@BBVA.COM");
		
		objeto.setPaisNacimiento("");
		objeto.setPaisDomicilio("");
		objeto.setNacionalidad("");
		objeto.setPaisResidencia1("");
		objeto.setNroIdentificacion1("");
		objeto.setPaisResidencia2("");
		objeto.setNroIdentificacion2("");
		objeto.setPaisResidencia3("");
		objeto.setNroIdentificacion3("");
		objeto.setKitFatca("");
		objeto.setFechaFatca("");
		objeto.setDeclaracionFatca("");
		objeto.setIndNacionalidadFatca("");
		objeto.setIndCertificadoFacta("");
		
		objeto.setEstadoActual("R");
		objeto.setCanal("OFDIGITAL");
		objeto.setIndOpcionRequisitos("SI");
		
		objeto.setIndPais("");
		objeto.setIndNacionalidad("");
		
		objeto.setRbaRiesgo("B");
		objeto.setRbaDiligencia("N");
		
		objeto.setObservacion("");

		filtro.setSecurity(security);
		filtro.setObjeto(objeto);
		
		
		
		ResponseAperturaCuentaGifole response = null;
		
		try {
			response = obj.aperturaCuentaGifole(filtro, "");
			if(response==null||!response.getValor().equals("OK")) {
				System.out.println("Error en el response");
			}
		} catch (ServiceExceptionBBVA e) {
			if(e instanceof ValidacionExceptionBBVA) {
				ValidacionExceptionBBVA ev = (ValidacionExceptionBBVA) e;
				System.out.println("Handling validation exception getCode : " + ev.getErrores().getFieldError().getCode());
				System.out.println("Handling validation exception getField: " + ev.getErrores().getFieldError().getField());
				System.out.println("Handling validation exception : " + ev.getErrores().getFieldError().getField() + " " + ev.getErrores().getFieldError().getCode());
			}else {
				System.out.println("Handling any exception: " + e.getMessage());
			}		
			e.printStackTrace();
		}
	}
}
