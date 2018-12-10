/**
 * DatosNacimiento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class DatosNacimiento  implements java.io.Serializable {
    private java.lang.String codUbigeoDepartamento;

    private java.lang.String codUbigeoProvincia;

    private java.lang.String codUbigeoDistrito;

    private java.lang.String departamento;

    private java.lang.String provincia;

    private java.lang.String distrito;

    private java.lang.String fecha;

    public DatosNacimiento() {
    }

    public DatosNacimiento(
           java.lang.String codUbigeoDepartamento,
           java.lang.String codUbigeoProvincia,
           java.lang.String codUbigeoDistrito,
           java.lang.String departamento,
           java.lang.String provincia,
           java.lang.String distrito,
           java.lang.String fecha) {
           this.codUbigeoDepartamento = codUbigeoDepartamento;
           this.codUbigeoProvincia = codUbigeoProvincia;
           this.codUbigeoDistrito = codUbigeoDistrito;
           this.departamento = departamento;
           this.provincia = provincia;
           this.distrito = distrito;
           this.fecha = fecha;
    }


    /**
     * Gets the codUbigeoDepartamento value for this DatosNacimiento.
     * 
     * @return codUbigeoDepartamento
     */
    public java.lang.String getCodUbigeoDepartamento() {
        return codUbigeoDepartamento;
    }


    /**
     * Sets the codUbigeoDepartamento value for this DatosNacimiento.
     * 
     * @param codUbigeoDepartamento
     */
    public void setCodUbigeoDepartamento(java.lang.String codUbigeoDepartamento) {
        this.codUbigeoDepartamento = codUbigeoDepartamento;
    }


    /**
     * Gets the codUbigeoProvincia value for this DatosNacimiento.
     * 
     * @return codUbigeoProvincia
     */
    public java.lang.String getCodUbigeoProvincia() {
        return codUbigeoProvincia;
    }


    /**
     * Sets the codUbigeoProvincia value for this DatosNacimiento.
     * 
     * @param codUbigeoProvincia
     */
    public void setCodUbigeoProvincia(java.lang.String codUbigeoProvincia) {
        this.codUbigeoProvincia = codUbigeoProvincia;
    }


    /**
     * Gets the codUbigeoDistrito value for this DatosNacimiento.
     * 
     * @return codUbigeoDistrito
     */
    public java.lang.String getCodUbigeoDistrito() {
        return codUbigeoDistrito;
    }


    /**
     * Sets the codUbigeoDistrito value for this DatosNacimiento.
     * 
     * @param codUbigeoDistrito
     */
    public void setCodUbigeoDistrito(java.lang.String codUbigeoDistrito) {
        this.codUbigeoDistrito = codUbigeoDistrito;
    }


    /**
     * Gets the departamento value for this DatosNacimiento.
     * 
     * @return departamento
     */
    public java.lang.String getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this DatosNacimiento.
     * 
     * @param departamento
     */
    public void setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the provincia value for this DatosNacimiento.
     * 
     * @return provincia
     */
    public java.lang.String getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this DatosNacimiento.
     * 
     * @param provincia
     */
    public void setProvincia(java.lang.String provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the distrito value for this DatosNacimiento.
     * 
     * @return distrito
     */
    public java.lang.String getDistrito() {
        return distrito;
    }


    /**
     * Sets the distrito value for this DatosNacimiento.
     * 
     * @param distrito
     */
    public void setDistrito(java.lang.String distrito) {
        this.distrito = distrito;
    }


    /**
     * Gets the fecha value for this DatosNacimiento.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DatosNacimiento.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosNacimiento)) return false;
        DatosNacimiento other = (DatosNacimiento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codUbigeoDepartamento==null && other.getCodUbigeoDepartamento()==null) || 
             (this.codUbigeoDepartamento!=null &&
              this.codUbigeoDepartamento.equals(other.getCodUbigeoDepartamento()))) &&
            ((this.codUbigeoProvincia==null && other.getCodUbigeoProvincia()==null) || 
             (this.codUbigeoProvincia!=null &&
              this.codUbigeoProvincia.equals(other.getCodUbigeoProvincia()))) &&
            ((this.codUbigeoDistrito==null && other.getCodUbigeoDistrito()==null) || 
             (this.codUbigeoDistrito!=null &&
              this.codUbigeoDistrito.equals(other.getCodUbigeoDistrito()))) &&
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.distrito==null && other.getDistrito()==null) || 
             (this.distrito!=null &&
              this.distrito.equals(other.getDistrito()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha())));
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
        if (getCodUbigeoDepartamento() != null) {
            _hashCode += getCodUbigeoDepartamento().hashCode();
        }
        if (getCodUbigeoProvincia() != null) {
            _hashCode += getCodUbigeoProvincia().hashCode();
        }
        if (getCodUbigeoDistrito() != null) {
            _hashCode += getCodUbigeoDistrito().hashCode();
        }
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getDistrito() != null) {
            _hashCode += getDistrito().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosNacimiento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosNacimiento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codUbigeoDepartamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codUbigeoDepartamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codUbigeoProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codUbigeoProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codUbigeoDistrito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codUbigeoDistrito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distrito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distrito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
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
