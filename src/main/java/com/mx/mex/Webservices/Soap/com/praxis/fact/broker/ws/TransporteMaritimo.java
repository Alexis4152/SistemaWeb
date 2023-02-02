
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transporteMaritimo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transporteMaritimo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="calado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contenedor" type="{http://ws.broker.fact.praxis.com/}contenedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eslora" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lineaNaviera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manga" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nacionalidadEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAgenteNaviero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numAutorizacionNaviero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertITC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numConocEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroOMI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadesDeArqBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transporteMaritimo", propOrder = {
    "anioEmbarcacion",
    "calado",
    "contenedor",
    "eslora",
    "lineaNaviera",
    "manga",
    "matricula",
    "nacionalidadEmbarc",
    "nombreAgenteNaviero",
    "nombreAseg",
    "nombreEmbarc",
    "numAutorizacionNaviero",
    "numCertITC",
    "numConocEmbarc",
    "numPermisoSCT",
    "numPolizaSeguro",
    "numViaje",
    "numeroOMI",
    "permSCT",
    "tipoCarga",
    "tipoEmbarcacion",
    "unidadesDeArqBruto"
})
public class TransporteMaritimo {

    protected Integer anioEmbarcacion;
    protected BigDecimal calado;
    @XmlElement(nillable = true)
    protected List<Contenedor> contenedor;
    protected BigDecimal eslora;
    protected String lineaNaviera;
    protected BigDecimal manga;
    protected String matricula;
    protected String nacionalidadEmbarc;
    protected String nombreAgenteNaviero;
    protected String nombreAseg;
    protected String nombreEmbarc;
    protected String numAutorizacionNaviero;
    protected String numCertITC;
    protected String numConocEmbarc;
    protected String numPermisoSCT;
    protected String numPolizaSeguro;
    protected String numViaje;
    protected String numeroOMI;
    protected String permSCT;
    protected String tipoCarga;
    protected String tipoEmbarcacion;
    protected BigDecimal unidadesDeArqBruto;

    /**
     * Obtiene el valor de la propiedad anioEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnioEmbarcacion() {
        return anioEmbarcacion;
    }

    /**
     * Define el valor de la propiedad anioEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnioEmbarcacion(Integer value) {
        this.anioEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad calado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalado() {
        return calado;
    }

    /**
     * Define el valor de la propiedad calado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalado(BigDecimal value) {
        this.calado = value;
    }

    /**
     * Gets the value of the contenedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contenedor }
     * 
     * 
     */
    public List<Contenedor> getContenedor() {
        if (contenedor == null) {
            contenedor = new ArrayList<Contenedor>();
        }
        return this.contenedor;
    }

    /**
     * Obtiene el valor de la propiedad eslora.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEslora() {
        return eslora;
    }

    /**
     * Define el valor de la propiedad eslora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEslora(BigDecimal value) {
        this.eslora = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaNaviera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaNaviera() {
        return lineaNaviera;
    }

    /**
     * Define el valor de la propiedad lineaNaviera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaNaviera(String value) {
        this.lineaNaviera = value;
    }

    /**
     * Obtiene el valor de la propiedad manga.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManga() {
        return manga;
    }

    /**
     * Define el valor de la propiedad manga.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManga(BigDecimal value) {
        this.manga = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadEmbarc() {
        return nacionalidadEmbarc;
    }

    /**
     * Define el valor de la propiedad nacionalidadEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadEmbarc(String value) {
        this.nacionalidadEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAgenteNaviero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAgenteNaviero() {
        return nombreAgenteNaviero;
    }

    /**
     * Define el valor de la propiedad nombreAgenteNaviero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAgenteNaviero(String value) {
        this.nombreAgenteNaviero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAseg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAseg() {
        return nombreAseg;
    }

    /**
     * Define el valor de la propiedad nombreAseg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAseg(String value) {
        this.nombreAseg = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmbarc() {
        return nombreEmbarc;
    }

    /**
     * Define el valor de la propiedad nombreEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmbarc(String value) {
        this.nombreEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad numAutorizacionNaviero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAutorizacionNaviero() {
        return numAutorizacionNaviero;
    }

    /**
     * Define el valor de la propiedad numAutorizacionNaviero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAutorizacionNaviero(String value) {
        this.numAutorizacionNaviero = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertITC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertITC() {
        return numCertITC;
    }

    /**
     * Define el valor de la propiedad numCertITC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertITC(String value) {
        this.numCertITC = value;
    }

    /**
     * Obtiene el valor de la propiedad numConocEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumConocEmbarc() {
        return numConocEmbarc;
    }

    /**
     * Define el valor de la propiedad numConocEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumConocEmbarc(String value) {
        this.numConocEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad numPermisoSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * Define el valor de la propiedad numPermisoSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPermisoSCT(String value) {
        this.numPermisoSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad numPolizaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPolizaSeguro() {
        return numPolizaSeguro;
    }

    /**
     * Define el valor de la propiedad numPolizaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPolizaSeguro(String value) {
        this.numPolizaSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad numViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumViaje() {
        return numViaje;
    }

    /**
     * Define el valor de la propiedad numViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumViaje(String value) {
        this.numViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOMI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOMI() {
        return numeroOMI;
    }

    /**
     * Define el valor de la propiedad numeroOMI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOMI(String value) {
        this.numeroOMI = value;
    }

    /**
     * Obtiene el valor de la propiedad permSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * Define el valor de la propiedad permSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermSCT(String value) {
        this.permSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define el valor de la propiedad tipoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarga(String value) {
        this.tipoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * Define el valor de la propiedad tipoEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbarcacion(String value) {
        this.tipoEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadesDeArqBruto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnidadesDeArqBruto() {
        return unidadesDeArqBruto;
    }

    /**
     * Define el valor de la propiedad unidadesDeArqBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnidadesDeArqBruto(BigDecimal value) {
        this.unidadesDeArqBruto = value;
    }

}
