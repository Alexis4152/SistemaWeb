
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoConcepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoConcepto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iedu" type="{http://ws.broker.fact.praxis.com/}iedu" minOccurs="0"/>
 *         &lt;element name="porCuentadeTerceros" type="{http://ws.broker.fact.praxis.com/}porCuentadeTerceros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoConcepto", propOrder = {
    "iedu",
    "porCuentadeTerceros"
})
public class ComplementoConcepto {

    protected Iedu iedu;
    protected PorCuentadeTerceros porCuentadeTerceros;

    /**
     * Obtiene el valor de la propiedad iedu.
     * 
     * @return
     *     possible object is
     *     {@link Iedu }
     *     
     */
    public Iedu getIedu() {
        return iedu;
    }

    /**
     * Define el valor de la propiedad iedu.
     * 
     * @param value
     *     allowed object is
     *     {@link Iedu }
     *     
     */
    public void setIedu(Iedu value) {
        this.iedu = value;
    }

    /**
     * Obtiene el valor de la propiedad porCuentadeTerceros.
     * 
     * @return
     *     possible object is
     *     {@link PorCuentadeTerceros }
     *     
     */
    public PorCuentadeTerceros getPorCuentadeTerceros() {
        return porCuentadeTerceros;
    }

    /**
     * Define el valor de la propiedad porCuentadeTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link PorCuentadeTerceros }
     *     
     */
    public void setPorCuentadeTerceros(PorCuentadeTerceros value) {
        this.porCuentadeTerceros = value;
    }

}
