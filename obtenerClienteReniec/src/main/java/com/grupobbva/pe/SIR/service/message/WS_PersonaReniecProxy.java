package com.grupobbva.pe.SIR.service.message;

public class WS_PersonaReniecProxy implements com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType {
  private String _endpoint = null;
  private com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType wS_PersonaReniec_PortType = null;
  
  public WS_PersonaReniecProxy() {
    _initWS_PersonaReniecProxy();
  }
  
  public WS_PersonaReniecProxy(String endpoint) {
    _endpoint = endpoint;
    _initWS_PersonaReniecProxy();
  }
  
  private void _initWS_PersonaReniecProxy() {
    try {
      wS_PersonaReniec_PortType = (new com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_ServiceLocator()).getWS_PersonaReniec();
      if (wS_PersonaReniec_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wS_PersonaReniec_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wS_PersonaReniec_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wS_PersonaReniec_PortType != null)
      ((javax.xml.rpc.Stub)wS_PersonaReniec_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType getWS_PersonaReniec_PortType() {
    if (wS_PersonaReniec_PortType == null)
      _initWS_PersonaReniecProxy();
    return wS_PersonaReniec_PortType;
  }
  
  public com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse consultaPorNombres(com.grupobbva.pe.SIR.service.message.ConsultaPorNombresRequest consultaPorNombresRequest) throws java.rmi.RemoteException{
    if (wS_PersonaReniec_PortType == null)
      _initWS_PersonaReniecProxy();
    return wS_PersonaReniec_PortType.consultaPorNombres(consultaPorNombresRequest);
  }
  
  public com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse consultaPorDNI(com.grupobbva.pe.SIR.service.message.ConsultaPorDNIRequest consultaPorDNIRequest) throws java.rmi.RemoteException{
    if (wS_PersonaReniec_PortType == null)
      _initWS_PersonaReniecProxy();
    return wS_PersonaReniec_PortType.consultaPorDNI(consultaPorDNIRequest);
  }
  
  
}