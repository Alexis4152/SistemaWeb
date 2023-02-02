
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retencionP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retencionP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importeP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencionP", propOrder = {
    "importeP",
    "impuestoP"
})
public class RetencionP {

    protected String importeP;
    protected String impuestoP;

    /**
     * Obtiene el valor de la propiedad importeP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteP() {
        return importeP;
    }

    /**
     * Define el valor de la propiedad importeP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteP(String value) {
        this.importeP = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestoP() {
        return impuestoP;
    }

    /**
     * Define el valor de la propiedad impuestoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestoP(String value) {
        this.impuestoP = value;
    }

}
