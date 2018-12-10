/**
 * RespuestaDNI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class RespuestaDNI  implements java.io.Serializable {
    private java.lang.String numDNIConsultado;

    public RespuestaDNI() {
    }

    public RespuestaDNI(
           java.lang.String numDNIConsultado) {
           this.numDNIConsultado = numDNIConsultado;
    }


    /**
     * Gets the numDNIConsultado value for this RespuestaDNI.
     * 
     * @return numDNIConsultado
     */
    public java.lang.String getNumDNIConsultado() {
        return numDNIConsultado;
    }


    /**
     * Sets the numDNIConsultado value for this RespuestaDNI.
     * 
     * @param numDNIConsultado
     */
    public void setNumDNIConsultado(java.lang.String numDNIConsultado) {
        this.numDNIConsultado = numDNIConsultado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaDNI)) return false;
        RespuestaDNI other = (RespuestaDNI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numDNIConsultado==null && other.getNumDNIConsultado()==null) || 
             (this.numDNIConsultado!=null &&
              this.numDNIConsultado.equals(other.getNumDNIConsultado())));
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
        if (getNumDNIConsultado() != null) {
            _hashCode += getNumDNIConsultado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaDNI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDNI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDNIConsultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numDNIConsultado"));
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
