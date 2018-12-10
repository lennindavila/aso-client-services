package pe.bbva.aso.servicios.createchannelinformation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createchannelinformation.dao.ICreateChannelInformationAPGRestClient;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.service.ICreateChannelInformationService;

@Service
@Scope("prototype")
public class CreateChannelInformationServiceImpl  implements ICreateChannelInformationService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateChannelInformationAPGRestClient createChannelInformationAPGRestClient;

	@Override
	public ResponseCreateChannelInformation createChannelInformation(RequestCreateChannelInformation filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateChannelInformation respuesta = createChannelInformationAPGRestClient.createChannelInformation(filtro, tsec);
		return respuesta;
	}
}
