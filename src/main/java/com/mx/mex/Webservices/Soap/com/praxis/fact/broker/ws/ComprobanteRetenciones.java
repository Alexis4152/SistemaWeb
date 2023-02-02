
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoRetenciones" type="{http://ws.broker.fact.praxis.com/}complementoRetenciones" minOccurs="0"/>
 *         &lt;element name="cveRetenc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRetenc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folioInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idComprobante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="periodoRetenciones" type="{http://ws.broker.fact.praxis.com/}periodoRetenciones" minOccurs="0"/>
 *         &lt;element name="receptorRetenciones" type="{http://ws.broker.fact.praxis.com/}receptorRetenciones" minOccurs="0"/>
 *         &lt;element name="totalesRetenciones" type="{http://ws.broker.fact.praxis.com/}totalesRetenciones" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteRetenciones", propOrder = {
    "addenda",
    "complementoRetenciones",
    "cveRetenc",
    "descRetenc",
    "folioInt",
    "id",
    "idComprobante",
    "periodoRetenciones",
    "receptorRetenciones",
    "totalesRetenciones"
})
@XmlSeeAlso({
    ComprobanteRetencionesV20 .class
})
public class ComprobanteRetenciones {

    protected String addenda;
    protected ComplementoRetenciones complementoRetenciones;
    protected String cveRetenc;
    protected String descRetenc;
    protected String folioInt;
    protected Long id;
    protected Long idComprobante;
    protected PeriodoRetenciones periodoRetenciones;
    protected ReceptorRetenciones receptorRetenciones;
    protected TotalesRetenciones totalesRetenciones;

    /**
     * Obtiene el valor de la propiedad addenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddenda(String value) {
        this.addenda = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoRetenciones }
     *     
     */
    public ComplementoRetenciones getComplementoRetenciones() {
        return complementoRetenciones;
    }

    /**
     * Define el valor de la propiedad complementoRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoRetenciones }
     *     
     */
    public void setComplementoRetenciones(ComplementoRetenciones value) {
        this.complementoRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad cveRetenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveRetenc() {
        return cveRetenc;
    }

    /**
     * Define el valor de la propiedad cveRetenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveRetenc(String value) {
        this.cveRetenc = value;
    }

    /**
     * Obtiene el valor de la propiedad descRetenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRetenc() {
        return descRetenc;
    }

    /**
     * Define el valor de la propiedad descRetenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRetenc(String value) {
        this.descRetenc = value;
    }

    /**
     * Obtiene el valor de la propiedad folioInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioInt() {
        return folioInt;
    }

    /**
     * Define el valor de la propiedad folioInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioInt(String value) {
        this.folioInt = value;
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
     * Obtiene el valor de la propiedad idComprobante.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdComprobante() {
        return idComprobante;
    }

    /**
     * Define el valor de la propiedad idComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdComprobante(Long value) {
        this.idComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link PeriodoRetenciones }
     *     
     */
    public PeriodoRetenciones getPeriodoRetenciones() {
        return periodoRetenciones;
    }

    /**
     * Define el valor de la propiedad periodoRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodoRetenciones }
     *     
     */
    public void setPeriodoRetenciones(PeriodoRetenciones value) {
        this.periodoRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorRetenciones }
     *     
     */
    public ReceptorRetenciones getReceptorRetenciones() {
        return receptorRetenciones;
    }

    /**
     * Define el valor de la propiedad receptorRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorRetenciones }
     *     
     */
    public void setReceptorRetenciones(ReceptorRetenciones value) {
        this.receptorRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link TotalesRetenciones }
     *     
     */
    public TotalesRetenciones getTotalesRetenciones() {
        return totalesRetenciones;
    }

    /**
     * Define el valor de la propiedad totalesRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalesRetenciones }
     *     
     */
    public void setTotalesRetenciones(TotalesRetenciones value) {
        this.totalesRetenciones = value;
    }

}
