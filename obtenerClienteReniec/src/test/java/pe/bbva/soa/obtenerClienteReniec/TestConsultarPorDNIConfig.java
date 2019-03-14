package pe.bbva.soa.obtenerClienteReniec;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;

import ch.qos.logback.classic.Logger;
import pe.bbva.soa.obtenerClienteReniec.config.ObtenerClienteReniecConfig;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;

public class TestConsultarPorDNIConfig {
	
@Test
	public void consultar() {
	    Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	 
	    ObtenerClienteReniecConfig listCustomer = new ObtenerClienteReniecConfig();
	    ConsultaPorDNIDTO filtro = new ConsultaPorDNIDTO();
	    filtro.setCanal("S_C_");
	    filtro.setCodigoAplicacion("ATM_APECTA");
		filtro.setIdEmpresa("RENI");
		filtro.setUsuario("P022621");
		filtro.setFechaHoraEnvio("2017-12-26-17.38.55.223456");
		filtro.setIdTransaccion("20171226173855223456ATM_APECTAP0226210025");
		filtro.setCodigoInterfaz("CPERRENXDNI");
		
		filtro.setCentroCostos("");
		filtro.setHostSolicitante("");
		filtro.setTipoAplicacion("E");
		filtro.setNumeroDNISolicitante("");
		filtro.setRegistroCodUsuario("P022621");
		filtro.setNumeroDNIConsultado("71664541"); //  - 45928112
		filtro.setIndConsultaDatos("S");
		filtro.setIndConsultaFoto("N");
		filtro.setIndConsultaFirma("N");
		filtro.setFormatoFirma("");
		
		ConsultaPorDNIResponse respuesta= listCustomer.consultar(filtro);
		String msg = respuesta.getRefResponseHeader().getMensajeRespuesta();
		String msg1 = respuesta.getRefConsultaPorDNIResponse().getRespuestaDatos().getDatosPersona().getApellidoPaterno();
		String msg2 = respuesta.getRefConsultaPorDNIResponse().getRespuestaDatos().getDatosDomicilio().getDireccion();
		
		logger.info("Mensaje desde ws reniec :" + msg);
		logger.info("Mensaje desde ws reniec :" + msg1);
		logger.info("Mensaje desde ws reniec :" + msg2);
 }
	
}
