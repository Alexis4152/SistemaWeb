
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cfdiComprobantesRelacionados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfdiComprobantesRelacionados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfdiTipoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfdiComprobantesRelacionados", propOrder = {
    "cfdiTipoRelacion",
    "uuid"
})
public class CfdiComprobantesRelacionados {

    protected String cfdiTipoRelacion;
    @XmlElement(name = "UUID")
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad cfdiTipoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfdiTipoRelacion() {
        return cfdiTipoRelacion;
    }

    /**
     * Define el valor de la propiedad cfdiTipoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfdiTipoRelacion(String value) {
        this.cfdiTipoRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
