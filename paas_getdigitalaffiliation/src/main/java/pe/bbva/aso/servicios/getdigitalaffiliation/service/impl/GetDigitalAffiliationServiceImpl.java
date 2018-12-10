package pe.bbva.aso.servicios.getdigitalaffiliation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getdigitalaffiliation.dao.IGetDigitalAffiliationAPGRestClient;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.service.IGetDigitalAffiliationService;

@Service
@Scope("prototype")
public class GetDigitalAffiliationServiceImpl  implements IGetDigitalAffiliationService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGetDigitalAffiliationAPGRestClient consultaAfiliacionDigital;
	
	public ResponseGetDigitalAffiliation getDigitalAffiliation(RequestGetDigitalAffiliation filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseGetDigitalAffiliation respuesta = consultaAfiliacionDigital.getDigitalAffiliation(filtro, tsec);
		return respuesta;
	}
}
