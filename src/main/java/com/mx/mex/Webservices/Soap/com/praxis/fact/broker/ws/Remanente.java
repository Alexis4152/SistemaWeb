
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para remanente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remanente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proporcionRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remanente", propOrder = {
    "proporcionRem"
})
public class Remanente {

    protected String proporcionRem;

    /**
     * Obtiene el valor de la propiedad proporcionRem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProporcionRem() {
        return proporcionRem;
    }

    /**
     * Define el valor de la propiedad proporcionRem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProporcionRem(String value) {
        this.proporcionRem = value;
    }

}
