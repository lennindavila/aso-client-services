package pe.bbva.soa.envioSMS.dto;

public class EnviarSMSDto
{
  private String numeroOperacion;
  private String mensaje;
  private String telefono;
  private String operador;
  private String pais;
  private String clave;
  private String minimo;
  private String maximo;
  private String retorno;
  
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
  
  public String getPais()
  {
    return this.pais;
  }
  
  public void setPais(String pais)
  {
    this.pais = pais;
  }
  
  public String getClave()
  {
    return this.clave;
  }
  
  public void setClave(String clave)
  {
    this.clave = clave;
  }
  
  public String getMinimo()
  {
    return this.minimo;
  }
  
  public void setMinimo(String minimo)
  {
    this.minimo = minimo;
  }
  
  public String getMaximo()
  {
    return this.maximo;
  }
  
  public void setMaximo(String maximo)
  {
    this.maximo = maximo;
  }
  
  public String getRetorno()
  {
    return this.retorno;
  }
  
  public void setRetorno(String retorno)
  {
    this.retorno = retorno;
  }
}
