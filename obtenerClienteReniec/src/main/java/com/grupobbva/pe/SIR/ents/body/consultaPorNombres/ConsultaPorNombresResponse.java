/**
 * ConsultaPorNombresResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorNombres;

public class ConsultaPorNombresResponse  implements java.io.Serializable {
    private java.lang.String numTotalCoindicencias;

    private com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona[] listaDatosPersona;

    public ConsultaPorNombresResponse() {
    }

    public ConsultaPorNombresResponse(
           java.lang.String numTotalCoindicencias,
           com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona[] listaDatosPersona) {
           this.numTotalCoindicencias = numTotalCoindicencias;
           this.listaDatosPersona = listaDatosPersona;
    }


    /**
     * Gets the numTotalCoindicencias value for this ConsultaPorNombresResponse.
     * 
     * @return numTotalCoindicencias
     */
    public java.lang.String getNumTotalCoindicencias() {
        return numTotalCoindicencias;
    }


    /**
     * Sets the numTotalCoindicencias value for this ConsultaPorNombresResponse.
     * 
     * @param numTotalCoindicencias
     */
    public void setNumTotalCoindicencias(java.lang.String numTotalCoindicencias) {
        this.numTotalCoindicencias = numTotalCoindicencias;
    }


    /**
     * Gets the listaDatosPersona value for this ConsultaPorNombresResponse.
     * 
     * @return listaDatosPersona
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona[] getListaDatosPersona() {
        return listaDatosPersona;
    }


    /**
     * Sets the listaDatosPersona value for this ConsultaPorNombresResponse.
     * 
     * @param listaDatosPersona
     */
    public void setListaDatosPersona(com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona[] listaDatosPersona) {
        this.listaDatosPersona = listaDatosPersona;
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
            ((this.numTotalCoindicencias==null && other.getNumTotalCoindicencias()==null) || 
             (this.numTotalCoindicencias!=null &&
              this.numTotalCoindicencias.equals(other.getNumTotalCoindicencias()))) &&
            ((this.listaDatosPersona==null && other.getListaDatosPersona()==null) || 
             (this.listaDatosPersona!=null &&
              java.util.Arrays.equals(this.listaDatosPersona, other.getListaDatosPersona())));
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
        if (getNumTotalCoindicencias() != null) {
            _hashCode += getNumTotalCoindicencias().hashCode();
        }
        if (getListaDatosPersona() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaDatosPersona());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaDatosPersona(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorNombresResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ConsultaPorNombresResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTotalCoindicencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numTotalCoindicencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDatosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaDatosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "DatosPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "datosPersona"));
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
