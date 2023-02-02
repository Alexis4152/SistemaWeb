
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pedimentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedimentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedimentos", propOrder = {
    "pedimento"
})
public class Pedimentos {

    protected String pedimento;

    /**
     * Obtiene el valor de la propiedad pedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedimento() {
        return pedimento;
    }

    /**
     * Define el valor de la propiedad pedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedimento(String value) {
        this.pedimento = value;
    }

}
