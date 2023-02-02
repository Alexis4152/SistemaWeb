
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirCFDIv40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirCFDIv40">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprobanteCFDIv40" type="{http://ws.broker.fact.praxis.com/}comprobanteCFDIv40" minOccurs="0"/>
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
@XmlType(name = "emitirCFDIv40", propOrder = {
    "comprobanteCFDIv40",
    "credenciales"
})
public class EmitirCFDIv40 {

    protected ComprobanteCFDIv40 comprobanteCFDIv40;
    protected Credenciales credenciales;

    /**
     * Obtiene el valor de la propiedad comprobanteCFDIv40.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteCFDIv40 }
     *     
     */
    public ComprobanteCFDIv40 getComprobanteCFDIv40() {
        return comprobanteCFDIv40;
    }

    /**
     * Define el valor de la propiedad comprobanteCFDIv40.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteCFDIv40 }
     *     
     */
    public void setComprobanteCFDIv40(ComprobanteCFDIv40 value) {
        this.comprobanteCFDIv40 = value;
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
