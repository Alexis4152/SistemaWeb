
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para intereses complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="intereses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montIntNominal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montIntReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operFinancDerivad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perdida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retiroAORESRetInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistFinanciero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intereses", propOrder = {
    "montIntNominal",
    "montIntReal",
    "operFinancDerivad",
    "perdida",
    "retiroAORESRetInt",
    "sistFinanciero"
})
public class Intereses {

    protected String montIntNominal;
    protected String montIntReal;
    protected String operFinancDerivad;
    protected String perdida;
    protected String retiroAORESRetInt;
    protected String sistFinanciero;

    /**
     * Obtiene el valor de la propiedad montIntNominal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontIntNominal() {
        return montIntNominal;
    }

    /**
     * Define el valor de la propiedad montIntNominal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontIntNominal(String value) {
        this.montIntNominal = value;
    }

    /**
     * Obtiene el valor de la propiedad montIntReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontIntReal() {
        return montIntReal;
    }

    /**
     * Define el valor de la propiedad montIntReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontIntReal(String value) {
        this.montIntReal = value;
    }

    /**
     * Obtiene el valor de la propiedad operFinancDerivad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperFinancDerivad() {
        return operFinancDerivad;
    }

    /**
     * Define el valor de la propiedad operFinancDerivad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperFinancDerivad(String value) {
        this.operFinancDerivad = value;
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

    /**
     * Obtiene el valor de la propiedad retiroAORESRetInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiroAORESRetInt() {
        return retiroAORESRetInt;
    }

    /**
     * Define el valor de la propiedad retiroAORESRetInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiroAORESRetInt(String value) {
        this.retiroAORESRetInt = value;
    }

    /**
     * Obtiene el valor de la propiedad sistFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistFinanciero() {
        return sistFinanciero;
    }

    /**
     * Define el valor de la propiedad sistFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistFinanciero(String value) {
        this.sistFinanciero = value;
    }

}
