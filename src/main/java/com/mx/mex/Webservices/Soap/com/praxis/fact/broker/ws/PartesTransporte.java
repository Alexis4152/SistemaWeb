
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para partesTransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partesTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parteTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partesTransporte", propOrder = {
    "parteTransporte"
})
public class PartesTransporte {

    protected String parteTransporte;

    /**
     * Obtiene el valor de la propiedad parteTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParteTransporte() {
        return parteTransporte;
    }

    /**
     * Define el valor de la propiedad parteTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParteTransporte(String value) {
        this.parteTransporte = value;
    }

}
