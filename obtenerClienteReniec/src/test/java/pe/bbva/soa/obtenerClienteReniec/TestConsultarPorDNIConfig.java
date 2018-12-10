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
	    filtro.setCodigoAplicacion("APERCUENOD");
		filtro.setIdEmpresa("RENI");
		filtro.setUsuario("P022621");
		filtro.setFechaHoraEnvio("2017-12-26-17.38.55.223456");
		filtro.setIdTransaccion("20171226173855223456PICP0256190025");
		filtro.setCodigoInterfaz("CPERRENXDNI");
		
		filtro.setCentroCostos("");
		filtro.setHostSolicitante("");
		filtro.setTipoAplicacion("E");
		filtro.setNumeroDNISolicitante("");
		filtro.setRegistroCodUsuario("P022621");
		filtro.setNumeroDNIConsultado("28716028"); //  - 45928112
		filtro.setIndConsultaDatos("S");
		filtro.setIndConsultaFoto("N");
		filtro.setIndConsultaFirma("N");
		filtro.setFormatoFirma("");
		
		ConsultaPorDNIResponse respuesta= listCustomer.consultar(filtro);
		String msg = respuesta.getRefResponseHeader().getMensajeRespuesta();
		
		logger.info("Mensaje desde ws reniec :" + msg);
 
 }
	
}
