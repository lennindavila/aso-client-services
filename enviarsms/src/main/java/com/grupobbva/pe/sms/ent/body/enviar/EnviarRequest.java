package com.grupobbva.pe.sms.ent.body.enviar;

import java.io.Serializable;

public class EnviarRequest
  implements Serializable
{
  private String numeroOperacion;
  private String mensaje;
  private String telefono;
  private String operador;
  
  public EnviarRequest() {}
  
  public EnviarRequest(String numeroOperacion, String mensaje, String telefono, String operador)
  {
    this.numeroOperacion = numeroOperacion;
    this.mensaje = mensaje;
    this.telefono = telefono;
    this.operador = operador;
  }
  
  public String getNumeroOperacion()
  {
    return this.numeroOperacion;
  }
  
  public void setNumeroOperacion(String numeroOperacion)
  {
    this.numeroOperacion = numeroOperacion;
  }
  
  public String getMensaje()
  {
    return this.mensaje;
  }
  
  public void setMensaje(String mensaje)
  {
    this.mensaje = mensaje;
  }
  
  public String getTelefono()
  {
    return this.telefono;
  }
  
  public void setTelefono(String telefono)
  {
    this.telefono = telefono;
  }
  
  public String getOperador()
  {
    return this.operador;
  }
  
  public void setOperador(String operador)
  {
    this.operador = operador;
  }
}
