package pe.bbva.aso.servicios.createchannelinformation.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;

public interface ICreateChannelInformationService {
	public ResponseCreateChannelInformation createChannelInformation(RequestCreateChannelInformation filtro, String tsec) throws ServiceExceptionBBVA;	
}
