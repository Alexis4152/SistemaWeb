
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aCuentaTerceros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aCuentaTerceros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domicilioFiscalACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regimenFiscalACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aCuentaTerceros", propOrder = {
    "domicilioFiscalACuentaTerceros",
    "nombreACuentaTerceros",
    "regimenFiscalACuentaTerceros",
    "rfcACuentaTerceros"
})
public class ACuentaTerceros {

    protected String domicilioFiscalACuentaTerceros;
    protected String nombreACuentaTerceros;
    protected String regimenFiscalACuentaTerceros;
    protected String rfcACuentaTerceros;

    /**
     * Obtiene el valor de la propiedad domicilioFiscalACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscalACuentaTerceros() {
        return domicilioFiscalACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad domicilioFiscalACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscalACuentaTerceros(String value) {
        this.domicilioFiscalACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreACuentaTerceros() {
        return nombreACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad nombreACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreACuentaTerceros(String value) {
        this.nombreACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalACuentaTerceros() {
        return regimenFiscalACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad regimenFiscalACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalACuentaTerceros(String value) {
        this.regimenFiscalACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcACuentaTerceros() {
        return rfcACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad rfcACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcACuentaTerceros(String value) {
        this.rfcACuentaTerceros = value;
    }

}
