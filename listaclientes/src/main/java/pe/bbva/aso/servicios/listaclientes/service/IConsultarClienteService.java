package pe.bbva.aso.servicios.listaclientes.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;

public interface IConsultarClienteService {
	public ResponseListCustomers consultarCliente(RequestListCustomers filtro, String tsec) throws ServiceExceptionBBVA;	
}
