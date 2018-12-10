package pe.bbva.soa.obtenerClienteReniec.service;

import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;

public interface IObtenerClienteReniecService {

	public ConsultaPorDNIResponse obtenerClienteDNI(ConsultaPorDNIDTO filtro) throws ServiceExceptionBBVA;

}
