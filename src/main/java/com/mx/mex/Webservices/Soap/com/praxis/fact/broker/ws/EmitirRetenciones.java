
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comprobanteRetenciones" type="{http://ws.broker.fact.praxis.com/}comprobanteRetenciones" minOccurs="0"/>
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
@XmlType(name = "emitirRetenciones", propOrder = {
    "comprobanteRetenciones",
    "credenciales"
})
public class EmitirRetenciones {

    protected ComprobanteRetenciones comprobanteRetenciones;
    protected Credenciales credenciales;

    /**
     * Obtiene el valor de la propiedad comprobanteRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link ComprobanteRetenciones }
     *     
     */
    public ComprobanteRetenciones getComprobanteRetenciones() {
        return comprobanteRetenciones;
    }

    /**
     * Define el valor de la propiedad comprobanteRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ComprobanteRetenciones }
     *     
     */
    public void setComprobanteRetenciones(ComprobanteRetenciones value) {
        this.comprobanteRetenciones = value;
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
