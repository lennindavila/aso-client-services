package pe.bbva.aso.servicios.listaclientes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaclientes.dao.IConsultaClienteAPGRestClient;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;
import pe.bbva.aso.servicios.listaclientes.service.IConsultarClienteService;

@Service
@Scope("prototype")
public class ConsultarClienteServiceImpl  implements IConsultarClienteService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IConsultaClienteAPGRestClient consultaCliente;
	
	public ResponseListCustomers consultarCliente(RequestListCustomers filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseListCustomers respuesta = consultaCliente.consultarCliente(filtro, tsec);
		return respuesta;
	}

	
}
