
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteCFDIv33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteCFDIv33">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}comprobanteCFDIDomain">
 *       &lt;sequence>
 *         &lt;element name="addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfdiRelacionados" type="{http://ws.broker.fact.praxis.com/}cfdiRelacionados" minOccurs="0"/>
 *         &lt;element name="clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisionDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptos" type="{http://ws.broker.fact.praxis.com/}conceptoCFDIv33" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosSap" type="{http://ws.broker.fact.praxis.com/}datoSapDTO" minOccurs="0"/>
 *         &lt;element name="destinoMercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmas" type="{http://ws.broker.fact.praxis.com/}firma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impuesto" type="{http://ws.broker.fact.praxis.com/}impuestoCFDIv33" minOccurs="0"/>
 *         &lt;element name="kilometros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoDispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numSiniestros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenMercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptorCFDIv33" minOccurs="0"/>
 *         &lt;element name="vehiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteCFDIv33", propOrder = {
    "addenda",
    "cantidadDispersion",
    "cfdiRelacionados",
    "clase",
    "comisionDispersion",
    "conceptos",
    "conductor",
    "confirmacion",
    "datosSap",
    "destinoMercancia",
    "firmas",
    "fraccion",
    "id",
    "impuesto",
    "kilometros",
    "montoDispersion",
    "numSiniestros",
    "origen",
    "origenMercancia",
    "peso",
    "placas",
    "receptor",
    "vehiculo",
    "volumen"
})
public class ComprobanteCFDIv33
    extends ComprobanteCFDIDomain
{

    protected String addenda;
    protected String cantidadDispersion;
    protected CfdiRelacionados cfdiRelacionados;
    protected String clase;
    protected String comisionDispersion;
    @XmlElement(nillable = true)
    protected List<ConceptoCFDIv33> conceptos;
    protected String conductor;
    protected String confirmacion;
    protected DatoSapDTO datosSap;
    protected String destinoMercancia;
    @XmlElement(nillable = true)
    protected List<Firma> firmas;
    protected String fraccion;
    protected Long id;
    protected ImpuestoCFDIv33 impuesto;
    protected String kilometros;
    protected String montoDispersion;
    protected String numSiniestros;
    protected String origen;
    protected String origenMercancia;
    protected String peso;
    protected String placas;
    protected ReceptorCFDIv33 receptor;
    protected String vehiculo;
    protected String volumen;

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
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClase(String value) {
        this.clase = value;
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
     * {@link ConceptoCFDIv33 }
     * 
     * 
     */
    public List<ConceptoCFDIv33> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<ConceptoCFDIv33>();
        }
        return this.conceptos;
    }

    /**
     * Obtiene el valor de la propiedad conductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * Define el valor de la propiedad conductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductor(String value) {
        this.conductor = value;
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
     * Obtiene el valor de la propiedad destinoMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoMercancia() {
        return destinoMercancia;
    }

    /**
     * Define el valor de la propiedad destinoMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoMercancia(String value) {
        this.destinoMercancia = value;
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
     * Obtiene el valor de la propiedad fraccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccion() {
        return fraccion;
    }

    /**
     * Define el valor de la propiedad fraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccion(String value) {
        this.fraccion = value;
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
     *     {@link ImpuestoCFDIv33 }
     *     
     */
    public ImpuestoCFDIv33 getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestoCFDIv33 }
     *     
     */
    public void setImpuesto(ImpuestoCFDIv33 value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad kilometros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilometros() {
        return kilometros;
    }

    /**
     * Define el valor de la propiedad kilometros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilometros(String value) {
        this.kilometros = value;
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
     * Obtiene el valor de la propiedad numSiniestros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSiniestros() {
        return numSiniestros;
    }

    /**
     * Define el valor de la propiedad numSiniestros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSiniestros(String value) {
        this.numSiniestros = value;
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
     * Obtiene el valor de la propiedad origenMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenMercancia() {
        return origenMercancia;
    }

    /**
     * Define el valor de la propiedad origenMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenMercancia(String value) {
        this.origenMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad placas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacas() {
        return placas;
    }

    /**
     * Define el valor de la propiedad placas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacas(String value) {
        this.placas = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDIv33 }
     *     
     */
    public ReceptorCFDIv33 getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDIv33 }
     *     
     */
    public void setReceptor(ReceptorCFDIv33 value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculo(String value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumen(String value) {
        this.volumen = value;
    }

}
