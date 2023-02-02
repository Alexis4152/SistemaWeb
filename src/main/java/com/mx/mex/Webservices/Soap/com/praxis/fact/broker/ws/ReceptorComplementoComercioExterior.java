
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para receptorComplementoComercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="receptorComplementoComercioExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domicilio" type="{http://ws.broker.fact.praxis.com/}domicilioComercioExterior" minOccurs="0"/>
 *         &lt;element name="numRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receptorComplementoComercioExterior", propOrder = {
    "domicilio",
    "numRegIdTrib"
})
public class ReceptorComplementoComercioExterior {

    protected DomicilioComercioExterior domicilio;
    protected String numRegIdTrib;

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioComercioExterior }
     *     
     */
    public DomicilioComercioExterior getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioComercioExterior }
     *     
     */
    public void setDomicilio(DomicilioComercioExterior value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * Define el valor de la propiedad numRegIdTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTrib(String value) {
        this.numRegIdTrib = value;
    }

}
