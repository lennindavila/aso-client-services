package pe.bbva.aso.servicios.modifycardblock.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;

public interface IModifyCardBlockAPGRestClient {	
	ResponseModifyCardBlock modifyCardBlock(RequestModifyCardBlock filtro, String tsec) throws ServiceExceptionBBVA;
}
