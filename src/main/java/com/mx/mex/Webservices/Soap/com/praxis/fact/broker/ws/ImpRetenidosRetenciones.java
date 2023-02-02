
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impRetenidosRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impRetenidosRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPagoRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impRetenidosRetenciones", propOrder = {
    "baseRet",
    "impuesto",
    "montoRet",
    "tipoPagoRet"
})
public class ImpRetenidosRetenciones {

    protected String baseRet;
    protected String impuesto;
    protected String montoRet;
    protected String tipoPagoRet;

    /**
     * Obtiene el valor de la propiedad baseRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRet() {
        return baseRet;
    }

    /**
     * Define el valor de la propiedad baseRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRet(String value) {
        this.baseRet = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoRet() {
        return montoRet;
    }

    /**
     * Define el valor de la propiedad montoRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoRet(String value) {
        this.montoRet = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPagoRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPagoRet() {
        return tipoPagoRet;
    }

    /**
     * Define el valor de la propiedad tipoPagoRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPagoRet(String value) {
        this.tipoPagoRet = value;
    }

}
