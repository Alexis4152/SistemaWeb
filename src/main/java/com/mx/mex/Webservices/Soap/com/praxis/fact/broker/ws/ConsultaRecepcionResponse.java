
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaRecepcionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaRecepcionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idComprobantesRecepcion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileXml" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="filePdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metodoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCtaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptor" minOccurs="0"/>
 *         &lt;element name="emisor" type="{http://ws.broker.fact.praxis.com/}emisor" minOccurs="0"/>
 *         &lt;element name="lstConcepto" type="{http://ws.broker.fact.praxis.com/}concepto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timbreFiscalDigital" type="{http://ws.broker.fact.praxis.com/}timbreFiscalDigital" minOccurs="0"/>
 *         &lt;element name="impuestos" type="{http://ws.broker.fact.praxis.com/}impuesto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaRecepcionResponse", propOrder = {
    "idComprobantesRecepcion",
    "montoTotal",
    "subTotal",
    "tipoMoneda",
    "versionComp",
    "fileXml",
    "filePdf",
    "serie",
    "folio",
    "noCertificado",
    "fecha",
    "formaPago",
    "tipoCambio",
    "metodoPago",
    "tipoComprobante",
    "lugarExpedicion",
    "numCtaPago",
    "certificado",
    "sello",
    "receptor",
    "emisor",
    "lstConcepto",
    "timbreFiscalDigital",
    "impuestos"
})
public class ConsultaRecepcionResponse {

    protected Long idComprobantesRecepcion;
    protected String montoTotal;
    protected String subTotal;
    protected String tipoMoneda;
    protected String versionComp;
    protected byte[] fileXml;
    protected byte[] filePdf;
    protected String serie;
    protected String folio;
    protected String noCertificado;
    protected String fecha;
    protected String formaPago;
    protected String tipoCambio;
    protected String metodoPago;
    protected String tipoComprobante;
    protected String lugarExpedicion;
    protected String numCtaPago;
    protected String certificado;
    protected String sello;
    protected Receptor receptor;
    protected Emisor emisor;
    @XmlElement(nillable = true)
    protected List<Concepto> lstConcepto;
    protected TimbreFiscalDigital timbreFiscalDigital;
    protected Impuesto impuestos;

    /**
     * Obtiene el valor de la propiedad idComprobantesRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdComprobantesRecepcion() {
        return idComprobantesRecepcion;
    }

    /**
     * Define el valor de la propiedad idComprobantesRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdComprobantesRecepcion(Long value) {
        this.idComprobantesRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotal(String value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTotal(String value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Define el valor de la propiedad tipoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMoneda(String value) {
        this.tipoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad versionComp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionComp() {
        return versionComp;
    }

    /**
     * Define el valor de la propiedad versionComp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionComp(String value) {
        this.versionComp = value;
    }

    /**
     * Obtiene el valor de la propiedad fileXml.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileXml() {
        return fileXml;
    }

    /**
     * Define el valor de la propiedad fileXml.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileXml(byte[] value) {
        this.fileXml = value;
    }

    /**
     * Obtiene el valor de la propiedad filePdf.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFilePdf() {
        return filePdf;
    }

    /**
     * Define el valor de la propiedad filePdf.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFilePdf(byte[] value) {
        this.filePdf = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
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
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
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
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link Emisor }
     *     
     */
    public Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Emisor }
     *     
     */
    public void setEmisor(Emisor value) {
        this.emisor = value;
    }

    /**
     * Gets the value of the lstConcepto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstConcepto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstConcepto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Concepto }
     * 
     * 
     */
    public List<Concepto> getLstConcepto() {
        if (lstConcepto == null) {
            lstConcepto = new ArrayList<Concepto>();
        }
        return this.lstConcepto;
    }

    /**
     * Obtiene el valor de la propiedad timbreFiscalDigital.
     * 
     * @return
     *     possible object is
     *     {@link TimbreFiscalDigital }
     *     
     */
    public TimbreFiscalDigital getTimbreFiscalDigital() {
        return timbreFiscalDigital;
    }

    /**
     * Define el valor de la propiedad timbreFiscalDigital.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbreFiscalDigital }
     *     
     */
    public void setTimbreFiscalDigital(TimbreFiscalDigital value) {
        this.timbreFiscalDigital = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link Impuesto }
     *     
     */
    public Impuesto getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Impuesto }
     *     
     */
    public void setImpuestos(Impuesto value) {
        this.impuestos = value;
    }

}
