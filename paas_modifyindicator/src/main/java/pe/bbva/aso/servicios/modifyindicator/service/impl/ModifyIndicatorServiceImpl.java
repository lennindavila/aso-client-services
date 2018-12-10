package pe.bbva.aso.servicios.modifyindicator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifyindicator.dao.IModifyIndicatorAPGRestClient;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.service.IModifyIndicatorService;

@Service
@Scope("prototype")
public class ModifyIndicatorServiceImpl  implements IModifyIndicatorService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyIndicatorAPGRestClient modifyIndicatorAPGRestClient;

	@Override
	public ResponseModifyIndicator modifyIndicator(RequestModifyIndicator filtro, String tsec) throws ServiceExceptionBBVA {
		String customerId = filtro.getCustomerId();
		String indicatorId = filtro.getIndicatorId();
		String isActive = filtro.getData()!=null?filtro.getData().getIsActive():"";
		ResponseModifyIndicator respuesta = modifyIndicatorAPGRestClient.modifyIndicator( customerId, indicatorId, isActive, tsec);
		return respuesta;
	}
}
