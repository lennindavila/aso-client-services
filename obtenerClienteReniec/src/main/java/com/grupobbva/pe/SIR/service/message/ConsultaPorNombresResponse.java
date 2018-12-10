/**
 * ConsultaPorNombresResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class ConsultaPorNombresResponse  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader;

    private com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresResponse refConsultaPorNombresResponse;

    public ConsultaPorNombresResponse() {
    }

    public ConsultaPorNombresResponse(
           com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader,
           com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresResponse refConsultaPorNombresResponse) {
           this.refResponseHeader = refResponseHeader;
           this.refConsultaPorNombresResponse = refConsultaPorNombresResponse;
    }


    /**
     * Gets the refResponseHeader value for this ConsultaPorNombresResponse.
     * 
     * @return refResponseHeader
     */
    public com.grupobbva.pe.SIR.ents.header.ResponseHeader getRefResponseHeader() {
        return refResponseHeader;
    }


    /**
     * Sets the refResponseHeader value for this ConsultaPorNombresResponse.
     * 
     * @param refResponseHeader
     */
    public void setRefResponseHeader(com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader) {
        this.refResponseHeader = refResponseHeader;
    }


    /**
     * Gets the refConsultaPorNombresResponse value for this ConsultaPorNombresResponse.
     * 
     * @return refConsultaPorNombresResponse
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresResponse getRefConsultaPorNombresResponse() {
        return refConsultaPorNombresResponse;
    }


    /**
     * Sets the refConsultaPorNombresResponse value for this ConsultaPorNombresResponse.
     * 
     * @param refConsultaPorNombresResponse
     */
    public void setRefConsultaPorNombresResponse(com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresResponse refConsultaPorNombresResponse) {
        this.refConsultaPorNombresResponse = refConsultaPorNombresResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorNombresResponse)) return false;
        ConsultaPorNombresResponse other = (ConsultaPorNombresResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refResponseHeader==null && other.getRefResponseHeader()==null) || 
             (this.refResponseHeader!=null &&
              this.refResponseHeader.equals(other.getRefResponseHeader()))) &&
            ((this.refConsultaPorNombresResponse==null && other.getRefConsultaPorNombresResponse()==null) || 
             (this.refConsultaPorNombresResponse!=null &&
              this.refConsultaPorNombresResponse.equals(other.getRefConsultaPorNombresResponse())));
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
        if (getRefResponseHeader() != null) {
            _hashCode += getRefResponseHeader().hashCode();
        }
        if (getRefConsultaPorNombresResponse() != null) {
            _hashCode += getRefConsultaPorNombresResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorNombresResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refResponseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "ResponseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaPorNombresResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaPorNombresResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ConsultaPorNombresResponse"));
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
