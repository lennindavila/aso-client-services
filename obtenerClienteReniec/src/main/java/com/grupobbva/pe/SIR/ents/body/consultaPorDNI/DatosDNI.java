/**
 * DatosDNI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class DatosDNI  implements java.io.Serializable {
    private java.lang.String fechaInscripcion;

    private java.lang.String fechaExpedicion;

    private java.lang.String constanciaVotacion;

    private java.lang.String codigoRestriccion;

    private java.lang.String descripcionRestriccion;

    public DatosDNI() {
    }

    public DatosDNI(
           java.lang.String fechaInscripcion,
           java.lang.String fechaExpedicion,
           java.lang.String constanciaVotacion,
           java.lang.String codigoRestriccion,
           java.lang.String descripcionRestriccion) {
           this.fechaInscripcion = fechaInscripcion;
           this.fechaExpedicion = fechaExpedicion;
           this.constanciaVotacion = constanciaVotacion;
           this.codigoRestriccion = codigoRestriccion;
           this.descripcionRestriccion = descripcionRestriccion;
    }


    /**
     * Gets the fechaInscripcion value for this DatosDNI.
     * 
     * @return fechaInscripcion
     */
    public java.lang.String getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this DatosDNI.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.lang.String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the fechaExpedicion value for this DatosDNI.
     * 
     * @return fechaExpedicion
     */
    public java.lang.String getFechaExpedicion() {
        return fechaExpedicion;
    }


    /**
     * Sets the fechaExpedicion value for this DatosDNI.
     * 
     * @param fechaExpedicion
     */
    public void setFechaExpedicion(java.lang.String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }


    /**
     * Gets the constanciaVotacion value for this DatosDNI.
     * 
     * @return constanciaVotacion
     */
    public java.lang.String getConstanciaVotacion() {
        return constanciaVotacion;
    }


    /**
     * Sets the constanciaVotacion value for this DatosDNI.
     * 
     * @param constanciaVotacion
     */
    public void setConstanciaVotacion(java.lang.String constanciaVotacion) {
        this.constanciaVotacion = constanciaVotacion;
    }


    /**
     * Gets the codigoRestriccion value for this DatosDNI.
     * 
     * @return codigoRestriccion
     */
    public java.lang.String getCodigoRestriccion() {
        return codigoRestriccion;
    }


    /**
     * Sets the codigoRestriccion value for this DatosDNI.
     * 
     * @param codigoRestriccion
     */
    public void setCodigoRestriccion(java.lang.String codigoRestriccion) {
        this.codigoRestriccion = codigoRestriccion;
    }


    /**
     * Gets the descripcionRestriccion value for this DatosDNI.
     * 
     * @return descripcionRestriccion
     */
    public java.lang.String getDescripcionRestriccion() {
        return descripcionRestriccion;
    }


    /**
     * Sets the descripcionRestriccion value for this DatosDNI.
     * 
     * @param descripcionRestriccion
     */
    public void setDescripcionRestriccion(java.lang.String descripcionRestriccion) {
        this.descripcionRestriccion = descripcionRestriccion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosDNI)) return false;
        DatosDNI other = (DatosDNI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.fechaExpedicion==null && other.getFechaExpedicion()==null) || 
             (this.fechaExpedicion!=null &&
              this.fechaExpedicion.equals(other.getFechaExpedicion()))) &&
            ((this.constanciaVotacion==null && other.getConstanciaVotacion()==null) || 
             (this.constanciaVotacion!=null &&
              this.constanciaVotacion.equals(other.getConstanciaVotacion()))) &&
            ((this.codigoRestriccion==null && other.getCodigoRestriccion()==null) || 
             (this.codigoRestriccion!=null &&
              this.codigoRestriccion.equals(other.getCodigoRestriccion()))) &&
            ((this.descripcionRestriccion==null && other.getDescripcionRestriccion()==null) || 
             (this.descripcionRestriccion!=null &&
              this.descripcionRestriccion.equals(other.getDescripcionRestriccion())));
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
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getFechaExpedicion() != null) {
            _hashCode += getFechaExpedicion().hashCode();
        }
        if (getConstanciaVotacion() != null) {
            _hashCode += getConstanciaVotacion().hashCode();
        }
        if (getCodigoRestriccion() != null) {
            _hashCode += getCodigoRestriccion().hashCode();
        }
        if (getDescripcionRestriccion() != null) {
            _hashCode += getDescripcionRestriccion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosDNI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosDNI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaExpedicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaExpedicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constanciaVotacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constanciaVotacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRestriccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRestriccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionRestriccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionRestriccion"));
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
