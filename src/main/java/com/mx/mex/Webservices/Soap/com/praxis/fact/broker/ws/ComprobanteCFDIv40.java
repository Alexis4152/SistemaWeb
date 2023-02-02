
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteCFDIv40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteCFDIv40">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}comprobanteCFDIDomain">
 *       &lt;sequence>
 *         &lt;element name="addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfdiRelacionados" type="{http://ws.broker.fact.praxis.com/}cfdiRelacionados" minOccurs="0"/>
 *         &lt;element name="comisionDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoPagos20" type="{http://ws.broker.fact.praxis.com/}complementoPagos20" minOccurs="0"/>
 *         &lt;element name="conceptos" type="{http://ws.broker.fact.praxis.com/}conceptoCFDIv40" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="confirmacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosAICMDTO" type="{http://ws.broker.fact.praxis.com/}datosAICMDTO" minOccurs="0"/>
 *         &lt;element name="datosSap" type="{http://ws.broker.fact.praxis.com/}datoSapDTO" minOccurs="0"/>
 *         &lt;element name="exportacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFactGlobal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmas" type="{http://ws.broker.fact.praxis.com/}firma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impuesto" type="{http://ws.broker.fact.praxis.com/}impuestoCFDIv40" minOccurs="0"/>
 *         &lt;element name="informacionGlobal" type="{http://ws.broker.fact.praxis.com/}informacionGlobal" minOccurs="0"/>
 *         &lt;element name="montoDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptorCFDIv40" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteCFDIv40", propOrder = {
    "addenda",
    "cantidadDispersion",
    "cfdiRelacionados",
    "comisionDispersion",
    "complementoPagos20",
    "conceptos",
    "confirmacion",
    "datosAICMDTO",
    "datosSap",
    "exportacion",
    "fechaFactGlobal",
    "firmas",
    "id",
    "impuesto",
    "informacionGlobal",
    "montoDispersion",
    "origen",
    "receptor"
})
public class ComprobanteCFDIv40
    extends ComprobanteCFDIDomain
{

    protected String addenda;
    protected String cantidadDispersion;
    protected CfdiRelacionados cfdiRelacionados;
    protected String comisionDispersion;
    protected ComplementoPagos20 complementoPagos20;
    @XmlElement(nillable = true)
    protected List<ConceptoCFDIv40> conceptos;
    protected String confirmacion;
    protected DatosAICMDTO datosAICMDTO;
    protected DatoSapDTO datosSap;
    protected String exportacion;
    protected String fechaFactGlobal;
    @XmlElement(nillable = true)
    protected List<Firma> firmas;
    protected Long id;
    protected ImpuestoCFDIv40 impuesto;
    protected InformacionGlobal informacionGlobal;
    protected String montoDispersion;
    protected String origen;
    protected ReceptorCFDIv40 receptor;

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
     * Obtiene el valor de la propiedad cantidadDispersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDispersion() {
        return cantidadDispersion;
    }

    /**
     * Define el valor de la propiedad cantidadDispersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDispersion(String value) {
        this.cantidadDispersion = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiRelacionados.
     * 
     * @return
     *     possible object is
     *     {@link CfdiRelacionados }
     *     
     */
    public CfdiRelacionados getCfdiRelacionados() {
        return cfdiRelacionados;
    }

    /**
     * Define el valor de la propiedad cfdiRelacionados.
     * 
     * @param value
     *     allowed object is
     *     {@link CfdiRelacionados }
     *     
     */
    public void setCfdiRelacionados(CfdiRelacionados value) {
        this.cfdiRelacionados = value;
    }

    /**
     * Obtiene el valor de la propiedad comisionDispersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComisionDispersion() {
        return comisionDispersion;
    }

    /**
     * Define el valor de la propiedad comisionDispersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComisionDispersion(String value) {
        this.comisionDispersion = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoPagos20.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoPagos20 }
     *     
     */
    public ComplementoPagos20 getComplementoPagos20() {
        return complementoPagos20;
    }

    /**
     * Define el valor de la propiedad complementoPagos20.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoPagos20 }
     *     
     */
    public void setComplementoPagos20(ComplementoPagos20 value) {
        this.complementoPagos20 = value;
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
     * {@link ConceptoCFDIv40 }
     * 
     * 
     */
    public List<ConceptoCFDIv40> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<ConceptoCFDIv40>();
        }
        return this.conceptos;
    }

    /**
     * Obtiene el valor de la propiedad confirmacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmacion() {
        return confirmacion;
    }

    /**
     * Define el valor de la propiedad confirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmacion(String value) {
        this.confirmacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAICMDTO.
     * 
     * @return
     *     possible object is
     *     {@link DatosAICMDTO }
     *     
     */
    public DatosAICMDTO getDatosAICMDTO() {
        return datosAICMDTO;
    }

    /**
     * Define el valor de la propiedad datosAICMDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAICMDTO }
     *     
     */
    public void setDatosAICMDTO(DatosAICMDTO value) {
        this.datosAICMDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad datosSap.
     * 
     * @return
     *     possible object is
     *     {@link DatoSapDTO }
     *     
     */
    public DatoSapDTO getDatosSap() {
        return datosSap;
    }

    /**
     * Define el valor de la propiedad datosSap.
     * 
     * @param value
     *     allowed object is
     *     {@link DatoSapDTO }
     *     
     */
    public void setDatosSap(DatoSapDTO value) {
        this.datosSap = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacion(String value) {
        this.exportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFactGlobal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFactGlobal() {
        return fechaFactGlobal;
    }

    /**
     * Define el valor de la propiedad fechaFactGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFactGlobal(String value) {
        this.fechaFactGlobal = value;
    }

    /**
     * Gets the value of the firmas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firmas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirmas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Firma }
     * 
     * 
     */
    public List<Firma> getFirmas() {
        if (firmas == null) {
            firmas = new ArrayList<Firma>();
        }
        return this.firmas;
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
     *     {@link ImpuestoCFDIv40 }
     *     
     */
    public ImpuestoCFDIv40 getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestoCFDIv40 }
     *     
     */
    public void setImpuesto(ImpuestoCFDIv40 value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionGlobal.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGlobal }
     *     
     */
    public InformacionGlobal getInformacionGlobal() {
        return informacionGlobal;
    }

    /**
     * Define el valor de la propiedad informacionGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGlobal }
     *     
     */
    public void setInformacionGlobal(InformacionGlobal value) {
        this.informacionGlobal = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDispersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoDispersion() {
        return montoDispersion;
    }

    /**
     * Define el valor de la propiedad montoDispersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoDispersion(String value) {
        this.montoDispersion = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDIv40 }
     *     
     */
    public ReceptorCFDIv40 getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDIv40 }
     *     
     */
    public void setReceptor(ReceptorCFDIv40 value) {
        this.receptor = value;
    }

}
