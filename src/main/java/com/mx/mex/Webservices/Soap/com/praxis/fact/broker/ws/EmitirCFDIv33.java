
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirCFDIv33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirCFDIv33">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprobanteCFDIv33" type="{http://ws.broker.fact.praxis.com/}comprobanteCFDIv33" minOccurs="0"/>
 *         &lt;element name="credenciales" type="{http://ws.broker.fact.praxis.com/}credenciales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emitirCFDIv33", propOrder = {
    "comprobanteCFDIv33",
    "credenciales"
})
public class EmitirCFDIv33 {

    protected ComprobanteCFDIv33 comprobanteCFDIv33;
    protected Credenciales credenciales;

    /**
     * Obtiene el valor de la propiedad comprobanteCFDIv33.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteCFDIv33 }
     *     
     */
    public ComprobanteCFDIv33 getComprobanteCFDIv33() {
        return comprobanteCFDIv33;
    }

    /**
     * Define el valor de la propiedad comprobanteCFDIv33.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteCFDIv33 }
     *     
     */
    public void setComprobanteCFDIv33(ComprobanteCFDIv33 value) {
        this.comprobanteCFDIv33 = value;
    }

    /**
     * Obtiene el valor de la propiedad credenciales.
     * 
     * @return
     *     possible object is
     *     {@link Credenciales }
     *     
     */
    public Credenciales getCredenciales() {
        return credenciales;
    }

    /**
     * Define el valor de la propiedad credenciales.
     * 
     * @param value
     *     allowed object is
     *     {@link Credenciales }
     *     
     */
    public void setCredenciales(Credenciales value) {
        this.credenciales = value;
    }

}
