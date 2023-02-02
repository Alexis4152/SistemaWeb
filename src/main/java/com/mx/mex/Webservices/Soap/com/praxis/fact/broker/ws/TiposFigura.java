
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tiposFigura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tiposFigura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domicilio" type="{http://ws.broker.fact.praxis.com/}domicilioCartaPorte" minOccurs="0"/>
 *         &lt;element name="nombreFigura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegIdTribFigura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partesTransporte" type="{http://ws.broker.fact.praxis.com/}partesTransporte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="residenciaFiscalFigura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcFigura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFigura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiposFigura", propOrder = {
    "domicilio",
    "nombreFigura",
    "numLicencia",
    "numRegIdTribFigura",
    "partesTransporte",
    "residenciaFiscalFigura",
    "rfcFigura",
    "tipoFigura"
})
public class TiposFigura {

    protected DomicilioCartaPorte domicilio;
    protected String nombreFigura;
    protected String numLicencia;
    protected String numRegIdTribFigura;
    @XmlElement(nillable = true)
    protected List<PartesTransporte> partesTransporte;
    protected String residenciaFiscalFigura;
    protected String rfcFigura;
    protected String tipoFigura;

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioCartaPorte }
     *     
     */
    public DomicilioCartaPorte getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioCartaPorte }
     *     
     */
    public void setDomicilio(DomicilioCartaPorte value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFigura() {
        return nombreFigura;
    }

    /**
     * Define el valor de la propiedad nombreFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFigura(String value) {
        this.nombreFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad numLicencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLicencia() {
        return numLicencia;
    }

    /**
     * Define el valor de la propiedad numLicencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLicencia(String value) {
        this.numLicencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTribFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTribFigura() {
        return numRegIdTribFigura;
    }

    /**
     * Define el valor de la propiedad numRegIdTribFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTribFigura(String value) {
        this.numRegIdTribFigura = value;
    }

    /**
     * Gets the value of the partesTransporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partesTransporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartesTransporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartesTransporte }
     * 
     * 
     */
    public List<PartesTransporte> getPartesTransporte() {
        if (partesTransporte == null) {
            partesTransporte = new ArrayList<PartesTransporte>();
        }
        return this.partesTransporte;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscalFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscalFigura() {
        return residenciaFiscalFigura;
    }

    /**
     * Define el valor de la propiedad residenciaFiscalFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscalFigura(String value) {
        this.residenciaFiscalFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcFigura() {
        return rfcFigura;
    }

    /**
     * Define el valor de la propiedad rfcFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcFigura(String value) {
        this.rfcFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFigura() {
        return tipoFigura;
    }

    /**
     * Define el valor de la propiedad tipoFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFigura(String value) {
        this.tipoFigura = value;
    }

}
