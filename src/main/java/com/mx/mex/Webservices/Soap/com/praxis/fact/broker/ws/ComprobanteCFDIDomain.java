
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteCFDIDomain complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteCFDIDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comercioExterior" type="{http://ws.broker.fact.praxis.com/}comercioExterior" minOccurs="0"/>
 *         &lt;element name="complementoCartaPorte" type="{http://ws.broker.fact.praxis.com/}complementoCartaPorte" minOccurs="0"/>
 *         &lt;element name="complementoImpuestosLocales" type="{http://ws.broker.fact.praxis.com/}impuestosLocales" minOccurs="0"/>
 *         &lt;element name="complementoLeyendasFiscales" type="{http://ws.broker.fact.praxis.com/}complementoLeyendasFiscales" minOccurs="0"/>
 *         &lt;element name="complementoNomina12" type="{http://ws.broker.fact.praxis.com/}complementoNomina12" minOccurs="0"/>
 *         &lt;element name="complementoPagos" type="{http://ws.broker.fact.praxis.com/}complementoPagos" minOccurs="0"/>
 *         &lt;element name="complementoServiciosParciales" type="{http://ws.broker.fact.praxis.com/}complementoServiciosParciales" minOccurs="0"/>
 *         &lt;element name="complementosNomina12" type="{http://ws.broker.fact.praxis.com/}complementosNomina12" minOccurs="0"/>
 *         &lt;element name="condicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosExtra" type="{http://ws.broker.fact.praxis.com/}datosExtra" minOccurs="0"/>
 *         &lt;element name="descLab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etiquetaPersonalizada" type="{http://ws.broker.fact.praxis.com/}etiquetaPersonalizada" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSucursal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ine11" type="{http://ws.broker.fact.praxis.com/}ine11" minOccurs="0"/>
 *         &lt;element name="listDeductivas" type="{http://ws.broker.fact.praxis.com/}deductivas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metodoDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelSalarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noCatorcena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionesSoloReporte" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeCambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAPagar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDeducciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalImpLocRetenidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalReducciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteCFDIDomain", propOrder = {
    "claveCFDI",
    "comercioExterior",
    "complementoCartaPorte",
    "complementoImpuestosLocales",
    "complementoLeyendasFiscales",
    "complementoNomina12",
    "complementoPagos",
    "complementoServiciosParciales",
    "complementosNomina12",
    "condicionesDePago",
    "datosExtra",
    "descLab",
    "descuento",
    "etiquetaPersonalizada",
    "folio",
    "formaDePago",
    "idSucursal",
    "importeTotal",
    "ine11",
    "listDeductivas",
    "lugarExpedicion",
    "metodoDePago",
    "moneda",
    "motivoDescuento",
    "nivelSalarial",
    "noCatorcena",
    "noContrato",
    "observaciones",
    "observacionesSoloReporte",
    "serie",
    "subTotal",
    "tipoDeCambio",
    "total",
    "totalAPagar",
    "totalDeducciones",
    "totalImpLocRetenidos",
    "totalReducciones"
})
@XmlSeeAlso({
    ComprobanteCFDIv40 .class,
    ComprobanteCFDIv32 .class,
    ComprobanteCFDIv33 .class
})
public class ComprobanteCFDIDomain {

    protected String claveCFDI;
    protected ComercioExterior comercioExterior;
    protected ComplementoCartaPorte complementoCartaPorte;
    protected ImpuestosLocales complementoImpuestosLocales;
    protected ComplementoLeyendasFiscales complementoLeyendasFiscales;
    protected ComplementoNomina12 complementoNomina12;
    protected ComplementoPagos complementoPagos;
    protected ComplementoServiciosParciales complementoServiciosParciales;
    protected ComplementosNomina12 complementosNomina12;
    protected String condicionesDePago;
    protected DatosExtra datosExtra;
    protected String descLab;
    protected String descuento;
    @XmlElement(nillable = true)
    protected List<EtiquetaPersonalizada> etiquetaPersonalizada;
    protected String folio;
    protected String formaDePago;
    protected Long idSucursal;
    protected String importeTotal;
    protected Ine11 ine11;
    @XmlElement(nillable = true)
    protected List<Deductivas> listDeductivas;
    protected String lugarExpedicion;
    protected String metodoDePago;
    protected String moneda;
    protected String motivoDescuento;
    protected String nivelSalarial;
    protected String noCatorcena;
    protected String noContrato;
    protected String observaciones;
    protected boolean observacionesSoloReporte;
    protected String serie;
    protected String subTotal;
    protected String tipoDeCambio;
    protected String total;
    protected String totalAPagar;
    protected String totalDeducciones;
    protected String totalImpLocRetenidos;
    protected String totalReducciones;

    /**
     * Obtiene el valor de la propiedad claveCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveCFDI() {
        return claveCFDI;
    }

    /**
     * Define el valor de la propiedad claveCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveCFDI(String value) {
        this.claveCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link ComercioExterior }
     *     
     */
    public ComercioExterior getComercioExterior() {
        return comercioExterior;
    }

    /**
     * Define el valor de la propiedad comercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link ComercioExterior }
     *     
     */
    public void setComercioExterior(ComercioExterior value) {
        this.comercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoCartaPorte.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoCartaPorte }
     *     
     */
    public ComplementoCartaPorte getComplementoCartaPorte() {
        return complementoCartaPorte;
    }

    /**
     * Define el valor de la propiedad complementoCartaPorte.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoCartaPorte }
     *     
     */
    public void setComplementoCartaPorte(ComplementoCartaPorte value) {
        this.complementoCartaPorte = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoImpuestosLocales.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosLocales }
     *     
     */
    public ImpuestosLocales getComplementoImpuestosLocales() {
        return complementoImpuestosLocales;
    }

    /**
     * Define el valor de la propiedad complementoImpuestosLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosLocales }
     *     
     */
    public void setComplementoImpuestosLocales(ImpuestosLocales value) {
        this.complementoImpuestosLocales = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoLeyendasFiscales.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoLeyendasFiscales }
     *     
     */
    public ComplementoLeyendasFiscales getComplementoLeyendasFiscales() {
        return complementoLeyendasFiscales;
    }

    /**
     * Define el valor de la propiedad complementoLeyendasFiscales.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoLeyendasFiscales }
     *     
     */
    public void setComplementoLeyendasFiscales(ComplementoLeyendasFiscales value) {
        this.complementoLeyendasFiscales = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoNomina12.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoNomina12 }
     *     
     */
    public ComplementoNomina12 getComplementoNomina12() {
        return complementoNomina12;
    }

    /**
     * Define el valor de la propiedad complementoNomina12.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoNomina12 }
     *     
     */
    public void setComplementoNomina12(ComplementoNomina12 value) {
        this.complementoNomina12 = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoPagos.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoPagos }
     *     
     */
    public ComplementoPagos getComplementoPagos() {
        return complementoPagos;
    }

    /**
     * Define el valor de la propiedad complementoPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoPagos }
     *     
     */
    public void setComplementoPagos(ComplementoPagos value) {
        this.complementoPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoServiciosParciales.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoServiciosParciales }
     *     
     */
    public ComplementoServiciosParciales getComplementoServiciosParciales() {
        return complementoServiciosParciales;
    }

    /**
     * Define el valor de la propiedad complementoServiciosParciales.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoServiciosParciales }
     *     
     */
    public void setComplementoServiciosParciales(ComplementoServiciosParciales value) {
        this.complementoServiciosParciales = value;
    }

    /**
     * Obtiene el valor de la propiedad complementosNomina12.
     * 
     * @return
     *     possible object is
     *     {@link ComplementosNomina12 }
     *     
     */
    public ComplementosNomina12 getComplementosNomina12() {
        return complementosNomina12;
    }

    /**
     * Define el valor de la propiedad complementosNomina12.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementosNomina12 }
     *     
     */
    public void setComplementosNomina12(ComplementosNomina12 value) {
        this.complementosNomina12 = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad datosExtra.
     * 
     * @return
     *     possible object is
     *     {@link DatosExtra }
     *     
     */
    public DatosExtra getDatosExtra() {
        return datosExtra;
    }

    /**
     * Define el valor de la propiedad datosExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosExtra }
     *     
     */
    public void setDatosExtra(DatosExtra value) {
        this.datosExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad descLab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLab() {
        return descLab;
    }

    /**
     * Define el valor de la propiedad descLab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLab(String value) {
        this.descLab = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the etiquetaPersonalizada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etiquetaPersonalizada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtiquetaPersonalizada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtiquetaPersonalizada }
     * 
     * 
     */
    public List<EtiquetaPersonalizada> getEtiquetaPersonalizada() {
        if (etiquetaPersonalizada == null) {
            etiquetaPersonalizada = new ArrayList<EtiquetaPersonalizada>();
        }
        return this.etiquetaPersonalizada;
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
     * Obtiene el valor de la propiedad formaDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Define el valor de la propiedad formaDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePago(String value) {
        this.formaDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad idSucursal.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSucursal() {
        return idSucursal;
    }

    /**
     * Define el valor de la propiedad idSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSucursal(Long value) {
        this.idSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad ine11.
     * 
     * @return
     *     possible object is
     *     {@link Ine11 }
     *     
     */
    public Ine11 getIne11() {
        return ine11;
    }

    /**
     * Define el valor de la propiedad ine11.
     * 
     * @param value
     *     allowed object is
     *     {@link Ine11 }
     *     
     */
    public void setIne11(Ine11 value) {
        this.ine11 = value;
    }

    /**
     * Gets the value of the listDeductivas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDeductivas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDeductivas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deductivas }
     * 
     * 
     */
    public List<Deductivas> getListDeductivas() {
        if (listDeductivas == null) {
            listDeductivas = new ArrayList<Deductivas>();
        }
        return this.listDeductivas;
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
     * Obtiene el valor de la propiedad metodoDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Define el valor de la propiedad metodoDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    /**
     * Define el valor de la propiedad motivoDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescuento(String value) {
        this.motivoDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelSalarial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelSalarial() {
        return nivelSalarial;
    }

    /**
     * Define el valor de la propiedad nivelSalarial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelSalarial(String value) {
        this.nivelSalarial = value;
    }

    /**
     * Obtiene el valor de la propiedad noCatorcena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCatorcena() {
        return noCatorcena;
    }

    /**
     * Define el valor de la propiedad noCatorcena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCatorcena(String value) {
        this.noCatorcena = value;
    }

    /**
     * Obtiene el valor de la propiedad noContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoContrato() {
        return noContrato;
    }

    /**
     * Define el valor de la propiedad noContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoContrato(String value) {
        this.noContrato = value;
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
     * Obtiene el valor de la propiedad observacionesSoloReporte.
     * 
     */
    public boolean isObservacionesSoloReporte() {
        return observacionesSoloReporte;
    }

    /**
     * Define el valor de la propiedad observacionesSoloReporte.
     * 
     */
    public void setObservacionesSoloReporte(boolean value) {
        this.observacionesSoloReporte = value;
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
     * Obtiene el valor de la propiedad tipoDeCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    /**
     * Define el valor de la propiedad tipoDeCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeCambio(String value) {
        this.tipoDeCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAPagar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAPagar() {
        return totalAPagar;
    }

    /**
     * Define el valor de la propiedad totalAPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAPagar(String value) {
        this.totalAPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDeducciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDeducciones() {
        return totalDeducciones;
    }

    /**
     * Define el valor de la propiedad totalDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDeducciones(String value) {
        this.totalDeducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpLocRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpLocRetenidos() {
        return totalImpLocRetenidos;
    }

    /**
     * Define el valor de la propiedad totalImpLocRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpLocRetenidos(String value) {
        this.totalImpLocRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalReducciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalReducciones() {
        return totalReducciones;
    }

    /**
     * Define el valor de la propiedad totalReducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalReducciones(String value) {
        this.totalReducciones = value;
    }

}
