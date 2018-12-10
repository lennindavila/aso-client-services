package pe.bbva.soa.rbaonline.service;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;

public interface IRbaOnlineService {
	public SalidaOnlineDTO getConsultaOnline(EntradaOnlineDTO filtro);
}
