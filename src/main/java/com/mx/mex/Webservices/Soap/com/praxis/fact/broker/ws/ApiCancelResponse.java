
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para apiCancelResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="apiCancelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lstCancelResponse" type="{http://ws.broker.fact.praxis.com/}cancelResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiCancelResponse", propOrder = {
    "estatus",
    "codigoError",
    "descripcionError",
    "lstCancelResponse"
})
public class ApiCancelResponse {

    protected int estatus;
    protected int codigoError;
    protected String descripcionError;
    @XmlElement(nillable = true)
    protected List<CancelResponse> lstCancelResponse;

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     */
    public void setEstatus(int value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     */
    public int getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     */
    public void setCodigoError(int value) {
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
     * Gets the value of the lstCancelResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstCancelResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstCancelResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelResponse }
     * 
     * 
     */
    public List<CancelResponse> getLstCancelResponse() {
        if (lstCancelResponse == null) {
            lstCancelResponse = new ArrayList<CancelResponse>();
        }
        return this.lstCancelResponse;
    }

}
