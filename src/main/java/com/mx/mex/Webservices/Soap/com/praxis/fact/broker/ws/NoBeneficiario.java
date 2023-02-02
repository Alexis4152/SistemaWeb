
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para noBeneficiario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="noBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDeResidParaEfecFisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noBeneficiario", propOrder = {
    "conceptoPago",
    "descripcionConcepto",
    "paisDeResidParaEfecFisc"
})
public class NoBeneficiario {

    protected String conceptoPago;
    protected String descripcionConcepto;
    protected String paisDeResidParaEfecFisc;

    /**
     * Obtiene el valor de la propiedad conceptoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptoPago() {
        return conceptoPago;
    }

    /**
     * Define el valor de la propiedad conceptoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptoPago(String value) {
        this.conceptoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionConcepto() {
        return descripcionConcepto;
    }

    /**
     * Define el valor de la propiedad descripcionConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionConcepto(String value) {
        this.descripcionConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDeResidParaEfecFisc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDeResidParaEfecFisc() {
        return paisDeResidParaEfecFisc;
    }

    /**
     * Define el valor de la propiedad paisDeResidParaEfecFisc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDeResidParaEfecFisc(String value) {
        this.paisDeResidParaEfecFisc = value;
    }

}
