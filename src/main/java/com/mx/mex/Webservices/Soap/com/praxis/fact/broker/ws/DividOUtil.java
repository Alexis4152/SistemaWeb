
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dividOUtil complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dividOUtil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveTipDivOUtil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montDivAcumExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montDivAcumNal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montISRAcredNal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montISRAcredRetExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montISRAcredRetMexico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montRetExtDivExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoSocDistrDiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dividOUtil", propOrder = {
    "cveTipDivOUtil",
    "montDivAcumExt",
    "montDivAcumNal",
    "montISRAcredNal",
    "montISRAcredRetExtranjero",
    "montISRAcredRetMexico",
    "montRetExtDivExt",
    "tipoSocDistrDiv"
})
public class DividOUtil {

    protected String cveTipDivOUtil;
    protected String montDivAcumExt;
    protected String montDivAcumNal;
    protected String montISRAcredNal;
    protected String montISRAcredRetExtranjero;
    protected String montISRAcredRetMexico;
    protected String montRetExtDivExt;
    protected String tipoSocDistrDiv;

    /**
     * Obtiene el valor de la propiedad cveTipDivOUtil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveTipDivOUtil() {
        return cveTipDivOUtil;
    }

    /**
     * Define el valor de la propiedad cveTipDivOUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveTipDivOUtil(String value) {
        this.cveTipDivOUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad montDivAcumExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontDivAcumExt() {
        return montDivAcumExt;
    }

    /**
     * Define el valor de la propiedad montDivAcumExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontDivAcumExt(String value) {
        this.montDivAcumExt = value;
    }

    /**
     * Obtiene el valor de la propiedad montDivAcumNal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontDivAcumNal() {
        return montDivAcumNal;
    }

    /**
     * Define el valor de la propiedad montDivAcumNal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontDivAcumNal(String value) {
        this.montDivAcumNal = value;
    }

    /**
     * Obtiene el valor de la propiedad montISRAcredNal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontISRAcredNal() {
        return montISRAcredNal;
    }

    /**
     * Define el valor de la propiedad montISRAcredNal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontISRAcredNal(String value) {
        this.montISRAcredNal = value;
    }

    /**
     * Obtiene el valor de la propiedad montISRAcredRetExtranjero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontISRAcredRetExtranjero() {
        return montISRAcredRetExtranjero;
    }

    /**
     * Define el valor de la propiedad montISRAcredRetExtranjero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontISRAcredRetExtranjero(String value) {
        this.montISRAcredRetExtranjero = value;
    }

    /**
     * Obtiene el valor de la propiedad montISRAcredRetMexico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontISRAcredRetMexico() {
        return montISRAcredRetMexico;
    }

    /**
     * Define el valor de la propiedad montISRAcredRetMexico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontISRAcredRetMexico(String value) {
        this.montISRAcredRetMexico = value;
    }

    /**
     * Obtiene el valor de la propiedad montRetExtDivExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontRetExtDivExt() {
        return montRetExtDivExt;
    }

    /**
     * Define el valor de la propiedad montRetExtDivExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontRetExtDivExt(String value) {
        this.montRetExtDivExt = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSocDistrDiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSocDistrDiv() {
        return tipoSocDistrDiv;
    }

    /**
     * Define el valor de la propiedad tipoSocDistrDiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSocDistrDiv(String value) {
        this.tipoSocDistrDiv = value;
    }

}
