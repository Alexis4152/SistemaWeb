
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generacionFacturaYoFacturo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generacionFacturaYoFacturo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rfcEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generacionFacturaYoFacturo", propOrder = {
    "rfcEmpresa",
    "numeroTicket",
    "rfcCliente",
    "nombreSucursal",
    "usoCFDI"
})
public class GeneracionFacturaYoFacturo {

    protected String rfcEmpresa;
    protected String numeroTicket;
    protected String rfcCliente;
    protected String nombreSucursal;
    protected String usoCFDI;

    /**
     * Obtiene el valor de la propiedad rfcEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmpresa() {
        return rfcEmpresa;
    }

    /**
     * Define el valor de la propiedad rfcEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmpresa(String value) {
        this.rfcEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTicket() {
        return numeroTicket;
    }

    /**
     * Define el valor de la propiedad numeroTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTicket(String value) {
        this.numeroTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcCliente() {
        return rfcCliente;
    }

    /**
     * Define el valor de la propiedad rfcCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcCliente(String value) {
        this.rfcCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * Define el valor de la propiedad nombreSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSucursal(String value) {
        this.nombreSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad usoCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Define el valor de la propiedad usoCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

}
