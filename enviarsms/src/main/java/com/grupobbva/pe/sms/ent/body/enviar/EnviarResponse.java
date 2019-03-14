package com.grupobbva.pe.sms.ent.body.enviar;

public class EnviarResponse
{
  private String enviarReturn;
  
  public EnviarResponse() {}
  
  public EnviarResponse(String enviarReturn)
  {
    this.enviarReturn = enviarReturn;
  }
  
  public String getEnviarReturn()
  {
    return this.enviarReturn;
  }
  
  public void setEnviarReturn(String enviarReturn)
  {
    this.enviarReturn = enviarReturn;
  }
}
