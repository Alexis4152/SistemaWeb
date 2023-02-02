
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirRetencionesV20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirRetencionesV20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprobanteRetencionesV20" type="{http://ws.broker.fact.praxis.com/}comprobanteRetencionesV20" minOccurs="0"/>
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
@XmlType(name = "emitirRetencionesV20", propOrder = {
    "comprobanteRetencionesV20",
    "credenciales"
})
public class EmitirRetencionesV20 {

    protected ComprobanteRetencionesV20 comprobanteRetencionesV20;
    protected Credenciales credenciales;

    /**
     * Obtiene el valor de la propiedad comprobanteRetencionesV20.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteRetencionesV20 }
     *     
     */
    public ComprobanteRetencionesV20 getComprobanteRetencionesV20() {
        return comprobanteRetencionesV20;
    }

    /**
     * Define el valor de la propiedad comprobanteRetencionesV20.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteRetencionesV20 }
     *     
     */
    public void setComprobanteRetencionesV20(ComprobanteRetencionesV20 value) {
        this.comprobanteRetencionesV20 = value;
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
