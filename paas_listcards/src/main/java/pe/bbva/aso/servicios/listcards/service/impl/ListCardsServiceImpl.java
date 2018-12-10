package pe.bbva.aso.servicios.listcards.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcards.dao.IListCardsAPGRestClient;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;
import pe.bbva.aso.servicios.listcards.service.IListCardsService;

@Service
@Scope("prototype")
public class ListCardsServiceImpl  implements IListCardsService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IListCardsAPGRestClient listCardsAPGRestClient;
	
	//@Override
	public ResponseListCards listCards(RequestListCards filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseListCards respuesta = listCardsAPGRestClient.listCards(filtro, tsec);
		return respuesta;
	}
}
