package pe.bbva.aso.servicios.modifycard.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;

public interface IModifyCardAPGRestClient {	
	ResponseModifyCard modifyCard(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA;
}
