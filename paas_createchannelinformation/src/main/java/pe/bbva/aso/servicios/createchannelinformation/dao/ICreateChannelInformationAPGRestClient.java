package pe.bbva.aso.servicios.createchannelinformation.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;

public interface ICreateChannelInformationAPGRestClient {	
	ResponseCreateChannelInformation createChannelInformation(RequestCreateChannelInformation filtro, String tsec) throws ServiceExceptionBBVA;
}
