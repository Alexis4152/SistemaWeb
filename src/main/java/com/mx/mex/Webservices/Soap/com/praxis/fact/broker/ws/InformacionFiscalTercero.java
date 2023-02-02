
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionFiscalTercero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionFiscalTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tUbicacionFiscal" type="{http://ws.broker.fact.praxis.com/}tUbicacionFiscal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionFiscalTercero", propOrder = {
    "tUbicacionFiscal"
})
public class InformacionFiscalTercero {

    protected TUbicacionFiscal tUbicacionFiscal;

    /**
     * Obtiene el valor de la propiedad tUbicacionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link TUbicacionFiscal }
     *     
     */
    public TUbicacionFiscal getTUbicacionFiscal() {
        return tUbicacionFiscal;
    }

    /**
     * Define el valor de la propiedad tUbicacionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link TUbicacionFiscal }
     *     
     */
    public void setTUbicacionFiscal(TUbicacionFiscal value) {
        this.tUbicacionFiscal = value;
    }

}
