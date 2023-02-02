
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestosP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestosP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retencionesP" type="{http://ws.broker.fact.praxis.com/}retencionesP" minOccurs="0"/>
 *         &lt;element name="trasladosP" type="{http://ws.broker.fact.praxis.com/}trasladosP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosP", propOrder = {
    "retencionesP",
    "trasladosP"
})
public class ImpuestosP {

    protected RetencionesP retencionesP;
    protected TrasladosP trasladosP;

    /**
     * Obtiene el valor de la propiedad retencionesP.
     * 
     * @return
     *     possible object is
     *     {@link RetencionesP }
     *     
     */
    public RetencionesP getRetencionesP() {
        return retencionesP;
    }

    /**
     * Define el valor de la propiedad retencionesP.
     * 
     * @param value
     *     allowed object is
     *     {@link RetencionesP }
     *     
     */
    public void setRetencionesP(RetencionesP value) {
        this.retencionesP = value;
    }

    /**
     * Obtiene el valor de la propiedad trasladosP.
     * 
     * @return
     *     possible object is
     *     {@link TrasladosP }
     *     
     */
    public TrasladosP getTrasladosP() {
        return trasladosP;
    }

    /**
     * Define el valor de la propiedad trasladosP.
     * 
     * @param value
     *     allowed object is
     *     {@link TrasladosP }
     *     
     */
    public void setTrasladosP(TrasladosP value) {
        this.trasladosP = value;
    }

}
