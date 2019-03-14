package pe.bbva.soa.rbaonline.service.impl.test;

import java.util.Calendar;
import java.util.Date;

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
		/*
		{"canal":"0802",
			"codigoCliente":"90012646",
			"fechaAlta":{"year":2019,"month":0,"dayOfMonth":25,"hourOfDay":0,"minute":0,"second":0},
			"fechaNacimiento":{"year":1994,"month":0,"dayOfMonth":20,"hourOfDay":0,"minute":0,"second":0},
			
			
			"paisResidencia":"PER",
			"productoServicio":"0814",
			"sucursal":"0486",
			"temporal":"P",
			"tipoNacionalidad":"N",
		
			
			"tipoResidencia":"R",
			"uidPeticion":"USIDTMPR",
			"__hashCodeCalc":false}
		
		"tipoPersona":"F",
		"tipoProceso":"S",
		"indPEP":"N",
		"ocupacion":"",
		*/
		
		//Codigo que funciona ok en rba --> 90025131
		
		request.setCodigoCliente("90025131");//90025131  //90012646
		request.setTipoPersona("F"); 
		request.setTipoProceso("S");
		request.setIndPEP("N");
		request.setOcupacion("");
		request.setPaisResidencia("PER");
		request.setProductoServicio("0814");
		request.setSucursal("0486");
		request.setTemporal("P");
		request.setTipoResidencia("R");
		request.setTipoNacionalidad("N");
		request.setUidPeticion("USIDTMPR");
		request.setCanal("0802");
		
		
		Calendar cale = Calendar.getInstance();
		//Calendar cale = Calendar.getInstance();
		request.setFechaAlta(cale);
		request.setFechaNacimiento(cale);
		
		response = config.consultar(request);
		System.out.println("data " + response.getRiesgo());
	}
}
