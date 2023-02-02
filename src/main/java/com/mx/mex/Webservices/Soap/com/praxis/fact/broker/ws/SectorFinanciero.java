
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sectorFinanciero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sectorFinanciero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripFideicom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idFideicom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomFideicom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectorFinanciero", propOrder = {
    "descripFideicom",
    "idFideicom",
    "nomFideicom"
})
public class SectorFinanciero {

    protected String descripFideicom;
    protected String idFideicom;
    protected String nomFideicom;

    /**
     * Obtiene el valor de la propiedad descripFideicom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripFideicom() {
        return descripFideicom;
    }

    /**
     * Define el valor de la propiedad descripFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripFideicom(String value) {
        this.descripFideicom = value;
    }

    /**
     * Obtiene el valor de la propiedad idFideicom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFideicom() {
        return idFideicom;
    }

    /**
     * Define el valor de la propiedad idFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFideicom(String value) {
        this.idFideicom = value;
    }

    /**
     * Obtiene el valor de la propiedad nomFideicom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomFideicom() {
        return nomFideicom;
    }

    /**
     * Define el valor de la propiedad nomFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomFideicom(String value) {
        this.nomFideicom = value;
    }

}
