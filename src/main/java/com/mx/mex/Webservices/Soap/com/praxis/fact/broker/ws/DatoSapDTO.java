
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datoSapDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datoSapDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentoSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numClienteInternoSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedidoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedidoSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datoSapDTO", propOrder = {
    "documentoSAP",
    "fechaSAP",
    "numClienteInternoSAP",
    "pedidoCliente",
    "pedidoSAP"
})
public class DatoSapDTO {

    protected String documentoSAP;
    protected String fechaSAP;
    protected String numClienteInternoSAP;
    protected String pedidoCliente;
    protected String pedidoSAP;

    /**
     * Obtiene el valor de la propiedad documentoSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoSAP() {
        return documentoSAP;
    }

    /**
     * Define el valor de la propiedad documentoSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoSAP(String value) {
        this.documentoSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSAP() {
        return fechaSAP;
    }

    /**
     * Define el valor de la propiedad fechaSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSAP(String value) {
        this.fechaSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad numClienteInternoSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumClienteInternoSAP() {
        return numClienteInternoSAP;
    }

    /**
     * Define el valor de la propiedad numClienteInternoSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumClienteInternoSAP(String value) {
        this.numClienteInternoSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad pedidoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedidoCliente() {
        return pedidoCliente;
    }

    /**
     * Define el valor de la propiedad pedidoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedidoCliente(String value) {
        this.pedidoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad pedidoSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedidoSAP() {
        return pedidoSAP;
    }

    /**
     * Define el valor de la propiedad pedidoSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedidoSAP(String value) {
        this.pedidoSAP = value;
    }

}
