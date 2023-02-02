
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionAduanera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionAduanera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tInformacionAduanera" type="{http://ws.broker.fact.praxis.com/}TInformacionAduanera2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionAduanera", propOrder = {
    "tInformacionAduanera"
})
public class InformacionAduanera {

    protected TInformacionAduanera2 tInformacionAduanera;

    /**
     * Obtiene el valor de la propiedad tInformacionAduanera.
     * 
     * @return
     *     possible object is
     *     {@link TInformacionAduanera2 }
     *     
     */
    public TInformacionAduanera2 getTInformacionAduanera() {
        return tInformacionAduanera;
    }

    /**
     * Define el valor de la propiedad tInformacionAduanera.
     * 
     * @param value
     *     allowed object is
     *     {@link TInformacionAduanera2 }
     *     
     */
    public void setTInformacionAduanera(TInformacionAduanera2 value) {
        this.tInformacionAduanera = value;
    }

}
