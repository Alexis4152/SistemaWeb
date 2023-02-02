
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pagosAExtranjeros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagosAExtranjeros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiario" type="{http://ws.broker.fact.praxis.com/}beneficiario" minOccurs="0"/>
 *         &lt;element name="esBenefEfectDelCobro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noBeneficiario" type="{http://ws.broker.fact.praxis.com/}noBeneficiario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagosAExtranjeros", propOrder = {
    "beneficiario",
    "esBenefEfectDelCobro",
    "noBeneficiario"
})
public class PagosAExtranjeros {

    protected Beneficiario beneficiario;
    protected String esBenefEfectDelCobro;
    protected NoBeneficiario noBeneficiario;

    /**
     * Obtiene el valor de la propiedad beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiario }
     *     
     */
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define el valor de la propiedad beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiario }
     *     
     */
    public void setBeneficiario(Beneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad esBenefEfectDelCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsBenefEfectDelCobro() {
        return esBenefEfectDelCobro;
    }

    /**
     * Define el valor de la propiedad esBenefEfectDelCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsBenefEfectDelCobro(String value) {
        this.esBenefEfectDelCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad noBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link NoBeneficiario }
     *     
     */
    public NoBeneficiario getNoBeneficiario() {
        return noBeneficiario;
    }

    /**
     * Define el valor de la propiedad noBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link NoBeneficiario }
     *     
     */
    public void setNoBeneficiario(NoBeneficiario value) {
        this.noBeneficiario = value;
    }

}
