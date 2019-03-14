package com.grupobbva.pe.sms.service.message;

public class EnviarSMSProxy implements com.grupobbva.pe.sms.service.message.EnviarSMS {
  private String _endpoint = null;
  private com.grupobbva.pe.sms.service.message.EnviarSMS enviarSMS = null;
  
  public EnviarSMSProxy() {
    _initEnviarSMSProxy();
  }
  
  public EnviarSMSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnviarSMSProxy();
  }
  
  private void _initEnviarSMSProxy() {
    try {
      enviarSMS = (new com.grupobbva.pe.sms.service.message.EnviarSMSServiceLocator()).getEnviarSMS();
      if (enviarSMS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)enviarSMS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)enviarSMS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (enviarSMS != null)
      ((javax.xml.rpc.Stub)enviarSMS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.grupobbva.pe.sms.service.message.EnviarSMS getEnviarSMS() {
    if (enviarSMS == null)
      _initEnviarSMSProxy();
    return enviarSMS;
  }
  
  public java.lang.String enviar(java.lang.String numeroOperacion, java.lang.String mensaje, java.lang.String telefono, java.lang.String operador) throws java.rmi.RemoteException{
    if (enviarSMS == null)
      _initEnviarSMSProxy();
    return enviarSMS.enviar(numeroOperacion, mensaje, telefono, operador);
  }
  
  
}