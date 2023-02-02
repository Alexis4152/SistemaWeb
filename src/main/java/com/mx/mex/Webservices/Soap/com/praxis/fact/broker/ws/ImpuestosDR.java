
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestosDR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestosDR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retencionesDR" type="{http://ws.broker.fact.praxis.com/}retencionesDR" minOccurs="0"/>
 *         &lt;element name="trasladosDR" type="{http://ws.broker.fact.praxis.com/}trasladosDR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosDR", propOrder = {
    "retencionesDR",
    "trasladosDR"
})
public class ImpuestosDR {

    protected RetencionesDR retencionesDR;
    protected TrasladosDR trasladosDR;

    /**
     * Obtiene el valor de la propiedad retencionesDR.
     * 
     * @return
     *     possible object is
     *     {@link RetencionesDR }
     *     
     */
    public RetencionesDR getRetencionesDR() {
        return retencionesDR;
    }

    /**
     * Define el valor de la propiedad retencionesDR.
     * 
     * @param value
     *     allowed object is
     *     {@link RetencionesDR }
     *     
     */
    public void setRetencionesDR(RetencionesDR value) {
        this.retencionesDR = value;
    }

    /**
     * Obtiene el valor de la propiedad trasladosDR.
     * 
     * @return
     *     possible object is
     *     {@link TrasladosDR }
     *     
     */
    public TrasladosDR getTrasladosDR() {
        return trasladosDR;
    }

    /**
     * Define el valor de la propiedad trasladosDR.
     * 
     * @param value
     *     allowed object is
     *     {@link TrasladosDR }
     *     
     */
    public void setTrasladosDR(TrasladosDR value) {
        this.trasladosDR = value;
    }

}
