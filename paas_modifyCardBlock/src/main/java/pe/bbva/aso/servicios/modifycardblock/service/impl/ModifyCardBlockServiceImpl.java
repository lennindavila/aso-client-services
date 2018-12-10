package pe.bbva.aso.servicios.modifycardblock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardblock.dao.IModifyCardBlockAPGRestClient;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.service.IModifyCardBlockService;

@Service
@Scope("prototype")
public class ModifyCardBlockServiceImpl  implements IModifyCardBlockService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyCardBlockAPGRestClient modifyCardBlockAPGRestClient;

	@Override
	public ResponseModifyCardBlock modifyCardBlock(RequestModifyCardBlock filtro, String tsec) throws ServiceExceptionBBVA {	
		ResponseModifyCardBlock respuesta = modifyCardBlockAPGRestClient.modifyCardBlock(filtro, tsec);
		return respuesta;
	}
}


