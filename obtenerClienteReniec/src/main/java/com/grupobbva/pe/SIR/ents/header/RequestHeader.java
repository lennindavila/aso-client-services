/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.header;

public class RequestHeader  implements java.io.Serializable {
    private java.lang.String canal;

    private java.lang.String codigoAplicacion;

    private java.lang.String idEmpresa;

    private java.lang.String usuario;

    private java.lang.String fechaHoraEnvio;

    private java.lang.String idTransaccion;

    private java.lang.String codigoInterfaz;

    public RequestHeader() {
    }

    public RequestHeader(
           java.lang.String canal,
           java.lang.String codigoAplicacion,
           java.lang.String idEmpresa,
           java.lang.String usuario,
           java.lang.String fechaHoraEnvio,
           java.lang.String idTransaccion,
           java.lang.String codigoInterfaz) {
           this.canal = canal;
           this.codigoAplicacion = codigoAplicacion;
           this.idEmpresa = idEmpresa;
           this.usuario = usuario;
           this.fechaHoraEnvio = fechaHoraEnvio;
           this.idTransaccion = idTransaccion;
           this.codigoInterfaz = codigoInterfaz;
    }


    /**
     * Gets the canal value for this RequestHeader.
     * 
     * @return canal
     */
    public java.lang.String getCanal() {
        return canal;
    }


    /**
     * Sets the canal value for this RequestHeader.
     * 
     * @param canal
     */
    public void setCanal(java.lang.String canal) {
        this.canal = canal;
    }


    /**
     * Gets the codigoAplicacion value for this RequestHeader.
     * 
     * @return codigoAplicacion
     */
    public java.lang.String getCodigoAplicacion() {
        return codigoAplicacion;
    }


    /**
     * Sets the codigoAplicacion value for this RequestHeader.
     * 
     * @param codigoAplicacion
     */
    public void setCodigoAplicacion(java.lang.String codigoAplicacion) {
        this.codigoAplicacion = codigoAplicacion;
    }


    /**
     * Gets the idEmpresa value for this RequestHeader.
     * 
     * @return idEmpresa
     */
    public java.lang.String getIdEmpresa() {
        return idEmpresa;
    }


    /**
     * Sets the idEmpresa value for this RequestHeader.
     * 
     * @param idEmpresa
     */
    public void setIdEmpresa(java.lang.String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    /**
     * Gets the usuario value for this RequestHeader.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this RequestHeader.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the fechaHoraEnvio value for this RequestHeader.
     * 
     * @return fechaHoraEnvio
     */
    public java.lang.String getFechaHoraEnvio() {
        return fechaHoraEnvio;
    }


    /**
     * Sets the fechaHoraEnvio value for this RequestHeader.
     * 
     * @param fechaHoraEnvio
     */
    public void setFechaHoraEnvio(java.lang.String fechaHoraEnvio) {
        this.fechaHoraEnvio = fechaHoraEnvio;
    }


    /**
     * Gets the idTransaccion value for this RequestHeader.
     * 
     * @return idTransaccion
     */
    public java.lang.String getIdTransaccion() {
        return idTransaccion;
    }


    /**
     * Sets the idTransaccion value for this RequestHeader.
     * 
     * @param idTransaccion
     */
    public void setIdTransaccion(java.lang.String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }


    /**
     * Gets the codigoInterfaz value for this RequestHeader.
     * 
     * @return codigoInterfaz
     */
    public java.lang.String getCodigoInterfaz() {
        return codigoInterfaz;
    }


    /**
     * Sets the codigoInterfaz value for this RequestHeader.
     * 
     * @param codigoInterfaz
     */
    public void setCodigoInterfaz(java.lang.String codigoInterfaz) {
        this.codigoInterfaz = codigoInterfaz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canal==null && other.getCanal()==null) || 
             (this.canal!=null &&
              this.canal.equals(other.getCanal()))) &&
            ((this.codigoAplicacion==null && other.getCodigoAplicacion()==null) || 
             (this.codigoAplicacion!=null &&
              this.codigoAplicacion.equals(other.getCodigoAplicacion()))) &&
            ((this.idEmpresa==null && other.getIdEmpresa()==null) || 
             (this.idEmpresa!=null &&
              this.idEmpresa.equals(other.getIdEmpresa()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.fechaHoraEnvio==null && other.getFechaHoraEnvio()==null) || 
             (this.fechaHoraEnvio!=null &&
              this.fechaHoraEnvio.equals(other.getFechaHoraEnvio()))) &&
            ((this.idTransaccion==null && other.getIdTransaccion()==null) || 
             (this.idTransaccion!=null &&
              this.idTransaccion.equals(other.getIdTransaccion()))) &&
            ((this.codigoInterfaz==null && other.getCodigoInterfaz()==null) || 
             (this.codigoInterfaz!=null &&
              this.codigoInterfaz.equals(other.getCodigoInterfaz())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCanal() != null) {
            _hashCode += getCanal().hashCode();
        }
        if (getCodigoAplicacion() != null) {
            _hashCode += getCodigoAplicacion().hashCode();
        }
        if (getIdEmpresa() != null) {
            _hashCode += getIdEmpresa().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getFechaHoraEnvio() != null) {
            _hashCode += getFechaHoraEnvio().hashCode();
        }
        if (getIdTransaccion() != null) {
            _hashCode += getIdTransaccion().hashCode();
        }
        if (getCodigoInterfaz() != null) {
            _hashCode += getCodigoInterfaz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "RequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaHoraEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaHoraEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInterfaz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoInterfaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
