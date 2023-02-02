
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retenciones" type="{http://ws.broker.fact.praxis.com/}retenciones" minOccurs="0"/>
 *         &lt;element name="traslados" type="{http://ws.broker.fact.praxis.com/}traslados" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestos", propOrder = {
    "retenciones",
    "traslados"
})
public class Impuestos {

    protected Retenciones retenciones;
    protected Traslados traslados;

    /**
     * Obtiene el valor de la propiedad retenciones.
     * 
     * @return
     *     possible object is
     *     {@link Retenciones }
     *     
     */
    public Retenciones getRetenciones() {
        return retenciones;
    }

    /**
     * Define el valor de la propiedad retenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Retenciones }
     *     
     */
    public void setRetenciones(Retenciones value) {
        this.retenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad traslados.
     * 
     * @return
     *     possible object is
     *     {@link Traslados }
     *     
     */
    public Traslados getTraslados() {
        return traslados;
    }

    /**
     * Define el valor de la propiedad traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link Traslados }
     *     
     */
    public void setTraslados(Traslados value) {
        this.traslados = value;
    }

}
