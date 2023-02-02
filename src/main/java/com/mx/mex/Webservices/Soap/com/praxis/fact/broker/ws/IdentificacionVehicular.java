
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para identificacionVehicular complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identificacionVehicular">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioModeloVM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="configVehicular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placaVM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificacionVehicular", propOrder = {
    "anioModeloVM",
    "configVehicular",
    "placaVM"
})
public class IdentificacionVehicular {

    protected int anioModeloVM;
    protected String configVehicular;
    protected String placaVM;

    /**
     * Obtiene el valor de la propiedad anioModeloVM.
     * 
     */
    public int getAnioModeloVM() {
        return anioModeloVM;
    }

    /**
     * Define el valor de la propiedad anioModeloVM.
     * 
     */
    public void setAnioModeloVM(int value) {
        this.anioModeloVM = value;
    }

    /**
     * Obtiene el valor de la propiedad configVehicular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVehicular() {
        return configVehicular;
    }

    /**
     * Define el valor de la propiedad configVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVehicular(String value) {
        this.configVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad placaVM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaVM() {
        return placaVM;
    }

    /**
     * Define el valor de la propiedad placaVM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaVM(String value) {
        this.placaVM = value;
    }

}
