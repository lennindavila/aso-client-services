package pe.bbva.aso.servicios.listcontactdetail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcontactdetail.dao.IListContactDetailAPGRestClient;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.service.IListContactDetailService;

@Service
@Scope("prototype")
public class ListContactDetailServiceImpl  implements IListContactDetailService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IListContactDetailAPGRestClient consultaContactoDetalleCliente;
	
	public ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro,String tsec) throws ServiceExceptionBBVA {
		ResponseContactDetailDTO respuesta = consultaContactoDetalleCliente.listContactDetail(filtro, tsec);
		return respuesta;
	}
}


