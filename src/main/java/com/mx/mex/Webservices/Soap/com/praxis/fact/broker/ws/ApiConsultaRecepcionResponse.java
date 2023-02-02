
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para apiConsultaRecepcionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="apiConsultaRecepcionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lstComprobanteRecepcion" type="{http://ws.broker.fact.praxis.com/}consultaRecepcionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiConsultaRecepcionResponse", propOrder = {
    "estatus",
    "codigoError",
    "descripcionError",
    "lstComprobanteRecepcion"
})
public class ApiConsultaRecepcionResponse {

    protected Integer estatus;
    protected Integer codigoError;
    protected String descripcionError;
    @XmlElement(nillable = true)
    protected List<ConsultaRecepcionResponse> lstComprobanteRecepcion;

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstatus(Integer value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoError(Integer value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Gets the value of the lstComprobanteRecepcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstComprobanteRecepcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstComprobanteRecepcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaRecepcionResponse }
     * 
     * 
     */
    public List<ConsultaRecepcionResponse> getLstComprobanteRecepcion() {
        if (lstComprobanteRecepcion == null) {
            lstComprobanteRecepcion = new ArrayList<ConsultaRecepcionResponse>();
        }
        return this.lstComprobanteRecepcion;
    }

}
