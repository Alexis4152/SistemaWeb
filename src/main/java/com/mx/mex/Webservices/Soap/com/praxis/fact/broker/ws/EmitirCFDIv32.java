
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirCFDIv32 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirCFDIv32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprobanteCFDI" type="{http://ws.broker.fact.praxis.com/}comprobanteCFDIv32" minOccurs="0"/>
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
@XmlType(name = "emitirCFDIv32", propOrder = {
    "comprobanteCFDI",
    "credenciales"
})
public class EmitirCFDIv32 {

    protected ComprobanteCFDIv32 comprobanteCFDI;
    protected Credenciales credenciales;

    /**
     * Obtiene el valor de la propiedad comprobanteCFDI.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteCFDIv32 }
     *     
     */
    public ComprobanteCFDIv32 getComprobanteCFDI() {
        return comprobanteCFDI;
    }

    /**
     * Define el valor de la propiedad comprobanteCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteCFDIv32 }
     *     
     */
    public void setComprobanteCFDI(ComprobanteCFDIv32 value) {
        this.comprobanteCFDI = value;
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
