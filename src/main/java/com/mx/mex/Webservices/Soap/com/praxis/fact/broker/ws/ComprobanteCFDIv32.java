
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteCFDIv32 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteCFDIv32">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}comprobanteCFDIDomain">
 *       &lt;sequence>
 *         &lt;element name="cantidadDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptos" type="{http://ws.broker.fact.praxis.com/}concepto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impuesto" type="{http://ws.broker.fact.praxis.com/}impuesto" minOccurs="0"/>
 *         &lt;element name="montoFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCtaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptor" minOccurs="0"/>
 *         &lt;element name="regimenFiscal" type="{http://ws.broker.fact.praxis.com/}regimenFiscal" minOccurs="0"/>
 *         &lt;element name="serieFolioFiscalOrig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteCFDIv32", propOrder = {
    "cantidadDescuento",
    "conceptos",
    "fechaFolioFiscalOrig",
    "folioFiscalOrig",
    "id",
    "impuesto",
    "montoFolioFiscalOrig",
    "numCtaPago",
    "receptor",
    "regimenFiscal",
    "serieFolioFiscalOrig"
})
public class ComprobanteCFDIv32
    extends ComprobanteCFDIDomain
{

    protected String cantidadDescuento;
    @XmlElement(nillable = true)
    protected List<Concepto> conceptos;
    protected String fechaFolioFiscalOrig;
    protected String folioFiscalOrig;
    protected Long id;
    protected Impuesto impuesto;
    protected String montoFolioFiscalOrig;
    protected String numCtaPago;
    protected Receptor receptor;
    protected RegimenFiscal regimenFiscal;
    protected String serieFolioFiscalOrig;

    /**
     * Obtiene el valor de la propiedad cantidadDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDescuento() {
        return cantidadDescuento;
    }

    /**
     * Define el valor de la propiedad cantidadDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDescuento(String value) {
        this.cantidadDescuento = value;
    }

    /**
     * Gets the value of the conceptos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Concepto }
     * 
     * 
     */
    public List<Concepto> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<Concepto>();
        }
        return this.conceptos;
    }

    /**
     * Obtiene el valor de la propiedad fechaFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFolioFiscalOrig() {
        return fechaFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad fechaFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFolioFiscalOrig(String value) {
        this.fechaFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad folioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioFiscalOrig() {
        return folioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad folioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioFiscalOrig(String value) {
        this.folioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link Impuesto }
     *     
     */
    public Impuesto getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Impuesto }
     *     
     */
    public void setImpuesto(Impuesto value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoFolioFiscalOrig() {
        return montoFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad montoFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoFolioFiscalOrig(String value) {
        this.montoFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad numCtaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCtaPago() {
        return numCtaPago;
    }

    /**
     * Define el valor de la propiedad numCtaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCtaPago(String value) {
        this.numCtaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link Receptor }
     *     
     */
    public Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Receptor }
     *     
     */
    public void setReceptor(Receptor value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscal.
     * 
     * @return
     *     possible object is
     *     {@link RegimenFiscal }
     *     
     */
    public RegimenFiscal getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Define el valor de la propiedad regimenFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimenFiscal }
     *     
     */
    public void setRegimenFiscal(RegimenFiscal value) {
        this.regimenFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFolioFiscalOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFolioFiscalOrig() {
        return serieFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad serieFolioFiscalOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFolioFiscalOrig(String value) {
        this.serieFolioFiscalOrig = value;
    }

}
