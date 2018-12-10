/**
 * RespuestaDatos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class RespuestaDatos  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosPersona datosPersona;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDomicilio datosDomicilio;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosNacimiento datosNacimiento;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDNI datosDNI;

    public RespuestaDatos() {
    }

    public RespuestaDatos(
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosPersona datosPersona,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDomicilio datosDomicilio,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosNacimiento datosNacimiento,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDNI datosDNI) {
           this.datosPersona = datosPersona;
           this.datosDomicilio = datosDomicilio;
           this.datosNacimiento = datosNacimiento;
           this.datosDNI = datosDNI;
    }


    /**
     * Gets the datosPersona value for this RespuestaDatos.
     * 
     * @return datosPersona
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosPersona getDatosPersona() {
        return datosPersona;
    }


    /**
     * Sets the datosPersona value for this RespuestaDatos.
     * 
     * @param datosPersona
     */
    public void setDatosPersona(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosPersona datosPersona) {
        this.datosPersona = datosPersona;
    }


    /**
     * Gets the datosDomicilio value for this RespuestaDatos.
     * 
     * @return datosDomicilio
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDomicilio getDatosDomicilio() {
        return datosDomicilio;
    }


    /**
     * Sets the datosDomicilio value for this RespuestaDatos.
     * 
     * @param datosDomicilio
     */
    public void setDatosDomicilio(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDomicilio datosDomicilio) {
        this.datosDomicilio = datosDomicilio;
    }


    /**
     * Gets the datosNacimiento value for this RespuestaDatos.
     * 
     * @return datosNacimiento
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosNacimiento getDatosNacimiento() {
        return datosNacimiento;
    }


    /**
     * Sets the datosNacimiento value for this RespuestaDatos.
     * 
     * @param datosNacimiento
     */
    public void setDatosNacimiento(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosNacimiento datosNacimiento) {
        this.datosNacimiento = datosNacimiento;
    }


    /**
     * Gets the datosDNI value for this RespuestaDatos.
     * 
     * @return datosDNI
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDNI getDatosDNI() {
        return datosDNI;
    }


    /**
     * Sets the datosDNI value for this RespuestaDatos.
     * 
     * @param datosDNI
     */
    public void setDatosDNI(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDNI datosDNI) {
        this.datosDNI = datosDNI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaDatos)) return false;
        RespuestaDatos other = (RespuestaDatos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosPersona==null && other.getDatosPersona()==null) || 
             (this.datosPersona!=null &&
              this.datosPersona.equals(other.getDatosPersona()))) &&
            ((this.datosDomicilio==null && other.getDatosDomicilio()==null) || 
             (this.datosDomicilio!=null &&
              this.datosDomicilio.equals(other.getDatosDomicilio()))) &&
            ((this.datosNacimiento==null && other.getDatosNacimiento()==null) || 
             (this.datosNacimiento!=null &&
              this.datosNacimiento.equals(other.getDatosNacimiento()))) &&
            ((this.datosDNI==null && other.getDatosDNI()==null) || 
             (this.datosDNI!=null &&
              this.datosDNI.equals(other.getDatosDNI())));
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
        if (getDatosPersona() != null) {
            _hashCode += getDatosPersona().hashCode();
        }
        if (getDatosDomicilio() != null) {
            _hashCode += getDatosDomicilio().hashCode();
        }
        if (getDatosNacimiento() != null) {
            _hashCode += getDatosNacimiento().hashCode();
        }
        if (getDatosDNI() != null) {
            _hashCode += getDatosDNI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaDatos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDatos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosDomicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosNacimiento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosDNI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosDNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosDNI"));
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
