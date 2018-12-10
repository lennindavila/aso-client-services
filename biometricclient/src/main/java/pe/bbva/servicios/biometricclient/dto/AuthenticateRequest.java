package pe.bbva.servicios.biometricclient.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditRequest" type="{http://bbvacontinental.pe/biometricoGatewayService/ws/types/base}AuditRequest"/>
 *         &lt;element name="listaParametrosRequest" type="{http://bbvacontinental.pe/biometricoGatewayService/ws/types/base}Parametros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRequest",
    "listaParametrosRequest"
})
@XmlRootElement(name = "authenticateRequest")
public class AuthenticateRequest {

    @XmlElement(required = true)
    protected AuditRequest auditRequest;
    protected Parametros listaParametrosRequest;

    /**
     * Obtiene el valor de la propiedad auditRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuditRequest }
     *     
     */
    public AuditRequest getAuditRequest() {
        return auditRequest;
    }

    /**
     * Define el valor de la propiedad auditRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRequest }
     *     
     */
    public void setAuditRequest(AuditRequest value) {
        this.auditRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad listaParametrosRequest.
     * 
     * @return
     *     possible object is
     *     {@link Parametros }
     *     
     */
    public Parametros getListaParametrosRequest() {
        return listaParametrosRequest;
    }

    /**
     * Define el valor de la propiedad listaParametrosRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametros }
     *     
     */
    public void setListaParametrosRequest(Parametros value) {
        this.listaParametrosRequest = value;
    }

}
