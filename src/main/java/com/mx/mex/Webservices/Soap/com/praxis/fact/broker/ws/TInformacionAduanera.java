
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tInformacionAduanera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tInformacionAduanera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroPedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInformacionAduanera", propOrder = {
    "numeroPedimento"
})
public class TInformacionAduanera {

    protected String numeroPedimento;

    /**
     * Obtiene el valor de la propiedad numeroPedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPedimento() {
        return numeroPedimento;
    }

    /**
     * Define el valor de la propiedad numeroPedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPedimento(String value) {
        this.numeroPedimento = value;
    }

}
