package pe.bbva.aso.servicios.listaclientes.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;

public interface IConsultaClienteAPGRestClient {
	ResponseListCustomers consultarCliente(RequestListCustomers filtro, String tsec) throws ServiceExceptionBBVA;
}
