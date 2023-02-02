
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comercioExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificadoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveDePedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emisor" type="{http://ws.broker.fact.praxis.com/}emisorComplementoComercioExterior" minOccurs="0"/>
 *         &lt;element name="incoterm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listDestinatario" type="{http://ws.broker.fact.praxis.com/}destinatario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listPropietario" type="{http://ws.broker.fact.praxis.com/}propietarioComercioExterior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mercancias" type="{http://ws.broker.fact.praxis.com/}mercanciasComercioExterior" minOccurs="0"/>
 *         &lt;element name="motivoTraslado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificadoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroExportadorConfiable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptorComplementoComercioExterior" minOccurs="0"/>
 *         &lt;element name="subdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambioUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comercioExterior", propOrder = {
    "certificadoOrigen",
    "claveDePedimento",
    "emisor",
    "incoterm",
    "listDestinatario",
    "listPropietario",
    "mercancias",
    "motivoTraslado",
    "numCertificadoOrigen",
    "numeroExportadorConfiable",
    "observaciones",
    "receptor",
    "subdivision",
    "tipoCambioUSD",
    "tipoOperacion",
    "totalUSD"
})
public class ComercioExterior {

    protected String certificadoOrigen;
    protected String claveDePedimento;
    protected EmisorComplementoComercioExterior emisor;
    protected String incoterm;
    @XmlElement(nillable = true)
    protected List<Destinatario> listDestinatario;
    @XmlElement(nillable = true)
    protected List<PropietarioComercioExterior> listPropietario;
    protected MercanciasComercioExterior mercancias;
    protected String motivoTraslado;
    protected String numCertificadoOrigen;
    protected String numeroExportadorConfiable;
    protected String observaciones;
    protected ReceptorComplementoComercioExterior receptor;
    protected String subdivision;
    protected String tipoCambioUSD;
    protected String tipoOperacion;
    protected String totalUSD;

    /**
     * Obtiene el valor de la propiedad certificadoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificadoOrigen() {
        return certificadoOrigen;
    }

    /**
     * Define el valor de la propiedad certificadoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificadoOrigen(String value) {
        this.certificadoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad claveDePedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveDePedimento() {
        return claveDePedimento;
    }

    /**
     * Define el valor de la propiedad claveDePedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveDePedimento(String value) {
        this.claveDePedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link EmisorComplementoComercioExterior }
     *     
     */
    public EmisorComplementoComercioExterior getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorComplementoComercioExterior }
     *     
     */
    public void setEmisor(EmisorComplementoComercioExterior value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad incoterm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterm() {
        return incoterm;
    }

    /**
     * Define el valor de la propiedad incoterm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterm(String value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the listDestinatario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDestinatario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDestinatario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destinatario }
     * 
     * 
     */
    public List<Destinatario> getListDestinatario() {
        if (listDestinatario == null) {
            listDestinatario = new ArrayList<Destinatario>();
        }
        return this.listDestinatario;
    }

    /**
     * Gets the value of the listPropietario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPropietario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPropietario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropietarioComercioExterior }
     * 
     * 
     */
    public List<PropietarioComercioExterior> getListPropietario() {
        if (listPropietario == null) {
            listPropietario = new ArrayList<PropietarioComercioExterior>();
        }
        return this.listPropietario;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasComercioExterior }
     *     
     */
    public MercanciasComercioExterior getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasComercioExterior }
     *     
     */
    public void setMercancias(MercanciasComercioExterior value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoTraslado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoTraslado() {
        return motivoTraslado;
    }

    /**
     * Define el valor de la propiedad motivoTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoTraslado(String value) {
        this.motivoTraslado = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificadoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertificadoOrigen() {
        return numCertificadoOrigen;
    }

    /**
     * Define el valor de la propiedad numCertificadoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertificadoOrigen(String value) {
        this.numCertificadoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroExportadorConfiable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroExportadorConfiable() {
        return numeroExportadorConfiable;
    }

    /**
     * Define el valor de la propiedad numeroExportadorConfiable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroExportadorConfiable(String value) {
        this.numeroExportadorConfiable = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorComplementoComercioExterior }
     *     
     */
    public ReceptorComplementoComercioExterior getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorComplementoComercioExterior }
     *     
     */
    public void setReceptor(ReceptorComplementoComercioExterior value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad subdivision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Define el valor de la propiedad subdivision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivision(String value) {
        this.subdivision = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioUSD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambioUSD() {
        return tipoCambioUSD;
    }

    /**
     * Define el valor de la propiedad tipoCambioUSD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambioUSD(String value) {
        this.tipoCambioUSD = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalUSD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalUSD() {
        return totalUSD;
    }

    /**
     * Define el valor de la propiedad totalUSD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalUSD(String value) {
        this.totalUSD = value;
    }

}
