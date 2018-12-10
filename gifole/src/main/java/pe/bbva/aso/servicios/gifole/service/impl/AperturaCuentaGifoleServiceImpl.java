package pe.bbva.aso.servicios.gifole.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.gifole.dao.IAperturaCuentaGifoleAPGRestClient;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.service.IAperturaCuentaGifoleService;

@Service
@Scope("prototype")
public class AperturaCuentaGifoleServiceImpl  implements IAperturaCuentaGifoleService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IAperturaCuentaGifoleAPGRestClient aperturaCuentaGifoleAPGRestClient;

	@Override
	public ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA {
		ResponseAperturaCuentaGifole respuesta = aperturaCuentaGifoleAPGRestClient.aperturaCuentaGifole(filtro);
		return respuesta;
	}
}
