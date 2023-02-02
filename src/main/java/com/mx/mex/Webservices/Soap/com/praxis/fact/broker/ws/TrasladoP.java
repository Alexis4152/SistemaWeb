
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trasladoP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trasladoP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importeP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaOCuotaP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFactorP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trasladoP", propOrder = {
    "baseP",
    "importeP",
    "impuestoP",
    "tasaOCuotaP",
    "tipoFactorP"
})
public class TrasladoP {

    protected String baseP;
    protected String importeP;
    protected String impuestoP;
    protected String tasaOCuotaP;
    protected String tipoFactorP;

    /**
     * Obtiene el valor de la propiedad baseP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseP() {
        return baseP;
    }

    /**
     * Define el valor de la propiedad baseP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseP(String value) {
        this.baseP = value;
    }

    /**
     * Obtiene el valor de la propiedad importeP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteP() {
        return importeP;
    }

    /**
     * Define el valor de la propiedad importeP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteP(String value) {
        this.importeP = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestoP() {
        return impuestoP;
    }

    /**
     * Define el valor de la propiedad impuestoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestoP(String value) {
        this.impuestoP = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuotaP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaOCuotaP() {
        return tasaOCuotaP;
    }

    /**
     * Define el valor de la propiedad tasaOCuotaP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaOCuotaP(String value) {
        this.tasaOCuotaP = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactorP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactorP() {
        return tipoFactorP;
    }

    /**
     * Define el valor de la propiedad tipoFactorP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactorP(String value) {
        this.tipoFactorP = value;
    }

}
