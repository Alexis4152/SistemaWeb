
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retencionLocal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retencionLocal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}retencion">
 *       &lt;sequence>
 *         &lt;element name="tasaRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencionLocal", propOrder = {
    "tasaRetencion"
})
public class RetencionLocal
    extends Retencion
{

    protected String tasaRetencion;

    /**
     * Obtiene el valor de la propiedad tasaRetencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaRetencion() {
        return tasaRetencion;
    }

    /**
     * Define el valor de la propiedad tasaRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaRetencion(String value) {
        this.tasaRetencion = value;
    }

}
