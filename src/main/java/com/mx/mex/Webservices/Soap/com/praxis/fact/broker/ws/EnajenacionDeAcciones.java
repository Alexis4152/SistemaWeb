
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enajenacionDeAcciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enajenacionDeAcciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contratoIntermediacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ganancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perdida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enajenacionDeAcciones", propOrder = {
    "contratoIntermediacion",
    "ganancia",
    "perdida"
})
public class EnajenacionDeAcciones {

    protected String contratoIntermediacion;
    protected String ganancia;
    protected String perdida;

    /**
     * Obtiene el valor de la propiedad contratoIntermediacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContratoIntermediacion() {
        return contratoIntermediacion;
    }

    /**
     * Define el valor de la propiedad contratoIntermediacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContratoIntermediacion(String value) {
        this.contratoIntermediacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ganancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGanancia() {
        return ganancia;
    }

    /**
     * Define el valor de la propiedad ganancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGanancia(String value) {
        this.ganancia = value;
    }

    /**
     * Obtiene el valor de la propiedad perdida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerdida() {
        return perdida;
    }

    /**
     * Define el valor de la propiedad perdida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerdida(String value) {
        this.perdida = value;
    }

}
