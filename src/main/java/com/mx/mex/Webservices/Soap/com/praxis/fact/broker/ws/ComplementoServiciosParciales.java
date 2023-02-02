
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoServiciosParciales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoServiciosParciales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inmueble" type="{http://ws.broker.fact.praxis.com/}inmueble" minOccurs="0"/>
 *         &lt;element name="numPerLicoAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoServiciosParciales", propOrder = {
    "inmueble",
    "numPerLicoAut"
})
public class ComplementoServiciosParciales {

    protected Inmueble inmueble;
    protected String numPerLicoAut;

    /**
     * Obtiene el valor de la propiedad inmueble.
     * 
     * @return
     *     possible object is
     *     {@link Inmueble }
     *     
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    /**
     * Define el valor de la propiedad inmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link Inmueble }
     *     
     */
    public void setInmueble(Inmueble value) {
        this.inmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad numPerLicoAut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPerLicoAut() {
        return numPerLicoAut;
    }

    /**
     * Define el valor de la propiedad numPerLicoAut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPerLicoAut(String value) {
        this.numPerLicoAut = value;
    }

}
