package pe.bbva.aso.servicios.cliente.motordigitalizacion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pe.bbva.aso.servicios.motordigitalizacion.config.MotorDigitalizacionASOConfig;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ConstantesFileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestFileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestListCliente;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestListItems;

public class TestMotorDigitalizacionASOConfig {
	
	@Test
	public void consultar() {
		RequestFileUnico request = new RequestFileUnico();		
		ConstantesFileUnico constanttito = null;
		request.setNumeroContrato("001101910200324020");
		request.setIdContrato("020009");
		request.setOficinaGestora("0130");
		request.setIdGrupo("2");
		request.setProcedencia("NA");
		request.setGestDoc("online");
		
		RequestListItems listaItems = new RequestListItems();
		listaItems.setFu_ctr_fecha_apertura("18-10-2016");		
		listaItems.setFu_ctr_nombre_primer_titular("EDDY REYES ESPIRILLA");	
		request.setListaItems(listaItems);
		
		List<RequestListCliente> lst = new ArrayList<RequestListCliente>();
		RequestListCliente ocli = new RequestListCliente();
		ocli.setEmail("jjtijero63@gmail.com");
		ocli.setTipoDocumento("L");
		ocli.setCodigoCentral("90018919");
		ocli.setNroDocumento("47550160");
		ocli.setIdTrxHuellaDigital("50220#138098");
		ocli.setNombreApellido("EDDY REYES ESPIRILLA");
		ocli.setTipo("");
		
		List<RequestListItems> lstItemsCliente = new ArrayList<RequestListItems>();
		RequestListItems itemCliente = new RequestListItems();
		itemCliente.setFu_cfg_tipo_documento_primer_titular("L");
		itemCliente.setFu_cfg_numero_documento_primer_titular("43590095");
		itemCliente.setFu_cfg_nombre_completo_participe("EDDY REYES ESPIRILLA");
		itemCliente.setFu_cfg_codigo_central_primer_titular("90016482");
		itemCliente.setFu_cfg_email_primer_titular("HENRY.PAZ@GMAIL.COM");
		itemCliente.setFu_sol_nacionalidad("PER");
		lstItemsCliente.add(itemCliente);
		ocli.setListaItems(lstItemsCliente);
		lst.add(ocli);		
		request.setListaClientes(lst);
		
		MotorDigitalizacionASOConfig obj = new MotorDigitalizacionASOConfig();
		ZicResult result = obj.envioContrato(request);
		System.out.println("ZicResult MessageError: "  + result.getCodeError());			
	}
}
