/**
 * ConsultaPorDNIResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class ConsultaPorDNIResponse  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDatos respuestaDatos;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDNI respuestaDNI;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaImagenes respuestaImagenes;

    public ConsultaPorDNIResponse() {
    }

    public ConsultaPorDNIResponse(
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDatos respuestaDatos,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDNI respuestaDNI,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaImagenes respuestaImagenes) {
           this.respuestaDatos = respuestaDatos;
           this.respuestaDNI = respuestaDNI;
           this.respuestaImagenes = respuestaImagenes;
    }


    /**
     * Gets the respuestaDatos value for this ConsultaPorDNIResponse.
     * 
     * @return respuestaDatos
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDatos getRespuestaDatos() {
        return respuestaDatos;
    }


    /**
     * Sets the respuestaDatos value for this ConsultaPorDNIResponse.
     * 
     * @param respuestaDatos
     */
    public void setRespuestaDatos(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDatos respuestaDatos) {
        this.respuestaDatos = respuestaDatos;
    }


    /**
     * Gets the respuestaDNI value for this ConsultaPorDNIResponse.
     * 
     * @return respuestaDNI
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDNI getRespuestaDNI() {
        return respuestaDNI;
    }


    /**
     * Sets the respuestaDNI value for this ConsultaPorDNIResponse.
     * 
     * @param respuestaDNI
     */
    public void setRespuestaDNI(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDNI respuestaDNI) {
        this.respuestaDNI = respuestaDNI;
    }


    /**
     * Gets the respuestaImagenes value for this ConsultaPorDNIResponse.
     * 
     * @return respuestaImagenes
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaImagenes getRespuestaImagenes() {
        return respuestaImagenes;
    }


    /**
     * Sets the respuestaImagenes value for this ConsultaPorDNIResponse.
     * 
     * @param respuestaImagenes
     */
    public void setRespuestaImagenes(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaImagenes respuestaImagenes) {
        this.respuestaImagenes = respuestaImagenes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorDNIResponse)) return false;
        ConsultaPorDNIResponse other = (ConsultaPorDNIResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestaDatos==null && other.getRespuestaDatos()==null) || 
             (this.respuestaDatos!=null &&
              this.respuestaDatos.equals(other.getRespuestaDatos()))) &&
            ((this.respuestaDNI==null && other.getRespuestaDNI()==null) || 
             (this.respuestaDNI!=null &&
              this.respuestaDNI.equals(other.getRespuestaDNI()))) &&
            ((this.respuestaImagenes==null && other.getRespuestaImagenes()==null) || 
             (this.respuestaImagenes!=null &&
              this.respuestaImagenes.equals(other.getRespuestaImagenes())));
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
        if (getRespuestaDatos() != null) {
            _hashCode += getRespuestaDatos().hashCode();
        }
        if (getRespuestaDNI() != null) {
            _hashCode += getRespuestaDNI().hashCode();
        }
        if (getRespuestaImagenes() != null) {
            _hashCode += getRespuestaImagenes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDNIResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "ConsultaPorDNIResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaDatos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaDatos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDatos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaDNI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaDNI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDNI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaImagenes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaImagenes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaImagenes"));
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
