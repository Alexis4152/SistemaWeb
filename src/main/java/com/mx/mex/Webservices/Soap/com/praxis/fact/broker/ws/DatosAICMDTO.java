
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosAICMDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosAICMDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coNumTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosAICMDTO", propOrder = {
    "coNumTicket",
    "fhEntrada",
    "fhSalida"
})
public class DatosAICMDTO {

    protected String coNumTicket;
    protected String fhEntrada;
    protected String fhSalida;

    /**
     * Obtiene el valor de la propiedad coNumTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNumTicket() {
        return coNumTicket;
    }

    /**
     * Define el valor de la propiedad coNumTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNumTicket(String value) {
        this.coNumTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad fhEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhEntrada() {
        return fhEntrada;
    }

    /**
     * Define el valor de la propiedad fhEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhEntrada(String value) {
        this.fhEntrada = value;
    }

    /**
     * Obtiene el valor de la propiedad fhSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhSalida() {
        return fhSalida;
    }

    /**
     * Define el valor de la propiedad fhSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhSalida(String value) {
        this.fhSalida = value;
    }

}
