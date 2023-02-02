
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mercanciaCartaPorte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mercanciaCartaPorte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bienesTransp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cantidadTransporta" type="{http://ws.broker.fact.praxis.com/}cantidadTransporta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claveSTCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveMaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleMercancia" type="{http://ws.broker.fact.praxis.com/}detalleMercancia" minOccurs="0"/>
 *         &lt;element name="dimensiones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="embalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guiasIdentificacion" type="{http://ws.broker.fact.praxis.com/}guiasIdentificacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="materialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedimentos" type="{http://ws.broker.fact.praxis.com/}pedimentos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pesoEnKg" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuidComercioExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorMercancia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mercanciaCartaPorte", propOrder = {
    "bienesTransp",
    "cantidad",
    "cantidadTransporta",
    "claveSTCC",
    "claveUnidad",
    "cveMaterialPeligroso",
    "descripEmbalaje",
    "descripcion",
    "detalleMercancia",
    "dimensiones",
    "embalaje",
    "fraccionArancelaria",
    "guiasIdentificacion",
    "materialPeligroso",
    "moneda",
    "pedimentos",
    "pesoEnKg",
    "unidad",
    "uuidComercioExt",
    "valorMercancia"
})
public class MercanciaCartaPorte {

    protected String bienesTransp;
    protected BigDecimal cantidad;
    @XmlElement(nillable = true)
    protected List<CantidadTransporta> cantidadTransporta;
    protected String claveSTCC;
    protected String claveUnidad;
    protected String cveMaterialPeligroso;
    protected String descripEmbalaje;
    protected String descripcion;
    protected DetalleMercancia detalleMercancia;
    protected String dimensiones;
    protected String embalaje;
    protected String fraccionArancelaria;
    @XmlElement(nillable = true)
    protected List<GuiasIdentificacion> guiasIdentificacion;
    protected String materialPeligroso;
    protected String moneda;
    @XmlElement(nillable = true)
    protected List<Pedimentos> pedimentos;
    protected BigDecimal pesoEnKg;
    protected String unidad;
    protected String uuidComercioExt;
    protected BigDecimal valorMercancia;

    /**
     * Obtiene el valor de la propiedad bienesTransp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBienesTransp() {
        return bienesTransp;
    }

    /**
     * Define el valor de la propiedad bienesTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBienesTransp(String value) {
        this.bienesTransp = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the cantidadTransporta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadTransporta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadTransporta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CantidadTransporta }
     * 
     * 
     */
    public List<CantidadTransporta> getCantidadTransporta() {
        if (cantidadTransporta == null) {
            cantidadTransporta = new ArrayList<CantidadTransporta>();
        }
        return this.cantidadTransporta;
    }

    /**
     * Obtiene el valor de la propiedad claveSTCC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveSTCC() {
        return claveSTCC;
    }

    /**
     * Define el valor de la propiedad claveSTCC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveSTCC(String value) {
        this.claveSTCC = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Define el valor de la propiedad claveUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUnidad(String value) {
        this.claveUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cveMaterialPeligroso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveMaterialPeligroso() {
        return cveMaterialPeligroso;
    }

    /**
     * Define el valor de la propiedad cveMaterialPeligroso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveMaterialPeligroso(String value) {
        this.cveMaterialPeligroso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEmbalaje() {
        return descripEmbalaje;
    }

    /**
     * Define el valor de la propiedad descripEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEmbalaje(String value) {
        this.descripEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleMercancia.
     * 
     * @return
     *     possible object is
     *     {@link DetalleMercancia }
     *     
     */
    public DetalleMercancia getDetalleMercancia() {
        return detalleMercancia;
    }

    /**
     * Define el valor de la propiedad detalleMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleMercancia }
     *     
     */
    public void setDetalleMercancia(DetalleMercancia value) {
        this.detalleMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad dimensiones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensiones() {
        return dimensiones;
    }

    /**
     * Define el valor de la propiedad dimensiones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensiones(String value) {
        this.dimensiones = value;
    }

    /**
     * Obtiene el valor de la propiedad embalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalaje() {
        return embalaje;
    }

    /**
     * Define el valor de la propiedad embalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalaje(String value) {
        this.embalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fraccionArancelaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionArancelaria() {
        return fraccionArancelaria;
    }

    /**
     * Define el valor de la propiedad fraccionArancelaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionArancelaria(String value) {
        this.fraccionArancelaria = value;
    }

    /**
     * Gets the value of the guiasIdentificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasIdentificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasIdentificacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiasIdentificacion }
     * 
     * 
     */
    public List<GuiasIdentificacion> getGuiasIdentificacion() {
        if (guiasIdentificacion == null) {
            guiasIdentificacion = new ArrayList<GuiasIdentificacion>();
        }
        return this.guiasIdentificacion;
    }

    /**
     * Obtiene el valor de la propiedad materialPeligroso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialPeligroso() {
        return materialPeligroso;
    }

    /**
     * Define el valor de la propiedad materialPeligroso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialPeligroso(String value) {
        this.materialPeligroso = value;
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
     * Gets the value of the pedimentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedimentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedimentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pedimentos }
     * 
     * 
     */
    public List<Pedimentos> getPedimentos() {
        if (pedimentos == null) {
            pedimentos = new ArrayList<Pedimentos>();
        }
        return this.pedimentos;
    }

    /**
     * Obtiene el valor de la propiedad pesoEnKg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoEnKg() {
        return pesoEnKg;
    }

    /**
     * Define el valor de la propiedad pesoEnKg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoEnKg(BigDecimal value) {
        this.pesoEnKg = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad uuidComercioExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidComercioExt() {
        return uuidComercioExt;
    }

    /**
     * Define el valor de la propiedad uuidComercioExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidComercioExt(String value) {
        this.uuidComercioExt = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMercancia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMercancia() {
        return valorMercancia;
    }

    /**
     * Define el valor de la propiedad valorMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMercancia(BigDecimal value) {
        this.valorMercancia = value;
    }

}
