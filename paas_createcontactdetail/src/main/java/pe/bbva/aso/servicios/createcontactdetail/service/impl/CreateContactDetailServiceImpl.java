package pe.bbva.aso.servicios.createcontactdetail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcontactdetail.dao.ICreateContactDetailAPGRestClient;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.service.ICreateContactDetailService;

@Service
@Scope("prototype")
public class CreateContactDetailServiceImpl  implements ICreateContactDetailService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateContactDetailAPGRestClient createContactDetailAPGRestClient;
	
	public ResponseCreateContactDetail createContactDetail(RequestCreateContactDetail filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateContactDetail respuesta = createContactDetailAPGRestClient.createContactDetail(filtro, tsec);
		return respuesta;
	}
}
