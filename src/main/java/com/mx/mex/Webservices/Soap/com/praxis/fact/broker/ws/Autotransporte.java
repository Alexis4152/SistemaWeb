
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para autotransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="autotransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionVehicular" type="{http://ws.broker.fact.praxis.com/}identificacionVehicular" minOccurs="0"/>
 *         &lt;element name="numPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remolques" type="{http://ws.broker.fact.praxis.com/}remolques" minOccurs="0"/>
 *         &lt;element name="seguros" type="{http://ws.broker.fact.praxis.com/}seguros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autotransporte", propOrder = {
    "identificacionVehicular",
    "numPermisoSCT",
    "permSCT",
    "remolques",
    "seguros"
})
public class Autotransporte {

    protected IdentificacionVehicular identificacionVehicular;
    protected String numPermisoSCT;
    protected String permSCT;
    protected Remolques remolques;
    protected Seguros seguros;

    /**
     * Obtiene el valor de la propiedad identificacionVehicular.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionVehicular }
     *     
     */
    public IdentificacionVehicular getIdentificacionVehicular() {
        return identificacionVehicular;
    }

    /**
     * Define el valor de la propiedad identificacionVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionVehicular }
     *     
     */
    public void setIdentificacionVehicular(IdentificacionVehicular value) {
        this.identificacionVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad numPermisoSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * Define el valor de la propiedad numPermisoSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPermisoSCT(String value) {
        this.numPermisoSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad permSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * Define el valor de la propiedad permSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermSCT(String value) {
        this.permSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad remolques.
     * 
     * @return
     *     possible object is
     *     {@link Remolques }
     *     
     */
    public Remolques getRemolques() {
        return remolques;
    }

    /**
     * Define el valor de la propiedad remolques.
     * 
     * @param value
     *     allowed object is
     *     {@link Remolques }
     *     
     */
    public void setRemolques(Remolques value) {
        this.remolques = value;
    }

    /**
     * Obtiene el valor de la propiedad seguros.
     * 
     * @return
     *     possible object is
     *     {@link Seguros }
     *     
     */
    public Seguros getSeguros() {
        return seguros;
    }

    /**
     * Define el valor de la propiedad seguros.
     * 
     * @param value
     *     allowed object is
     *     {@link Seguros }
     *     
     */
    public void setSeguros(Seguros value) {
        this.seguros = value;
    }

}
