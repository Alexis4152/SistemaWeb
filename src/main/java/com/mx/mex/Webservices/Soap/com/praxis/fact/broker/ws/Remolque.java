
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para remolque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remolque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTipoRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remolque", propOrder = {
    "placa",
    "subTipoRem"
})
public class Remolque {

    protected String placa;
    protected String subTipoRem;

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad subTipoRem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTipoRem() {
        return subTipoRem;
    }

    /**
     * Define el valor de la propiedad subTipoRem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTipoRem(String value) {
        this.subTipoRem = value;
    }

}
