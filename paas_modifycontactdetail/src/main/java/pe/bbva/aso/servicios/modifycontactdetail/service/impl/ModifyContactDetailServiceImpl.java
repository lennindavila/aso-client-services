package pe.bbva.aso.servicios.modifycontactdetail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycontactdetail.dao.IModifyContactDetailAPGRestClient;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.service.IModifyContactDetailService;

@Service
@Scope("prototype")
public class ModifyContactDetailServiceImpl  implements IModifyContactDetailService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyContactDetailAPGRestClient modifyContactDetailAPGRestClient;

	@Override
	public ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseModifyContactDetail respuesta = modifyContactDetailAPGRestClient.modifyContactDetail(filtro, tsec);
		return respuesta;
	}
}
