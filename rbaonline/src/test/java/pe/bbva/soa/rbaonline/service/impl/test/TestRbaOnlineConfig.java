package pe.bbva.soa.rbaonline.service.impl.test;

import org.junit.Test;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;

import pe.bbva.soa.rbaonline.config.RbaOnlineConfig;

public class TestRbaOnlineConfig {

	@Test
	public void consultar() {
		SalidaOnlineDTO response = new SalidaOnlineDTO();
		RbaOnlineConfig config = new RbaOnlineConfig();
		EntradaOnlineDTO request = new EntradaOnlineDTO();
		request.setCodigoCliente("90025131");
		request.setTipoPersona("F");
		request.setTipoProceso("C");
		request.setUidPeticion("USIDTMPR");
		response = config.consultar(request);
		System.out.println("data " + response.getRiesgo());
	}
}
