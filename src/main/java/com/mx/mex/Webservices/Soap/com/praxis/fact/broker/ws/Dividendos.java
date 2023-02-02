
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dividendos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dividendos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dividOUtil" type="{http://ws.broker.fact.praxis.com/}dividOUtil" minOccurs="0"/>
 *         &lt;element name="remanente" type="{http://ws.broker.fact.praxis.com/}remanente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dividendos", propOrder = {
    "dividOUtil",
    "remanente"
})
public class Dividendos {

    protected DividOUtil dividOUtil;
    protected Remanente remanente;

    /**
     * Obtiene el valor de la propiedad dividOUtil.
     * 
     * @return
     *     possible object is
     *     {@link DividOUtil }
     *     
     */
    public DividOUtil getDividOUtil() {
        return dividOUtil;
    }

    /**
     * Define el valor de la propiedad dividOUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link DividOUtil }
     *     
     */
    public void setDividOUtil(DividOUtil value) {
        this.dividOUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad remanente.
     * 
     * @return
     *     possible object is
     *     {@link Remanente }
     *     
     */
    public Remanente getRemanente() {
        return remanente;
    }

    /**
     * Define el valor de la propiedad remanente.
     * 
     * @param value
     *     allowed object is
     *     {@link Remanente }
     *     
     */
    public void setRemanente(Remanente value) {
        this.remanente = value;
    }

}
