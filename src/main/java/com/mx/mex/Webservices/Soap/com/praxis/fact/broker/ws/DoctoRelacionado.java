
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para doctoRelacionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doctoRelacionado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equivalenciaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impPagodo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="impSaldoAnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="impSaldoInsoluto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="impuestosDR" type="{http://ws.broker.fact.praxis.com/}impuestosDR2" minOccurs="0"/>
 *         &lt;element name="metodoDePagoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numParcialidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="objetoImpDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoCambioDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRetenidos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalTrasladados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doctoRelacionado", propOrder = {
    "equivalenciaDR",
    "folio",
    "idDocumento",
    "impPagodo",
    "impSaldoAnt",
    "impSaldoInsoluto",
    "impuestosDR",
    "metodoDePagoDR",
    "monedaDR",
    "numParcialidad",
    "objetoImpDR",
    "serie",
    "subtotal",
    "tipoCambioDR",
    "totalRetenidos",
    "totalTrasladados"
})
public class DoctoRelacionado {

    protected String equivalenciaDR;
    protected String folio;
    protected String idDocumento;
    protected BigDecimal impPagodo;
    protected BigDecimal impSaldoAnt;
    protected BigDecimal impSaldoInsoluto;
    protected ImpuestosDR2 impuestosDR;
    protected String metodoDePagoDR;
    protected String monedaDR;
    protected Integer numParcialidad;
    protected String objetoImpDR;
    protected String serie;
    protected BigDecimal subtotal;
    protected String tipoCambioDR;
    protected BigDecimal totalRetenidos;
    protected BigDecimal totalTrasladados;

    /**
     * Obtiene el valor de la propiedad equivalenciaDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalenciaDR() {
        return equivalenciaDR;
    }

    /**
     * Define el valor de la propiedad equivalenciaDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalenciaDR(String value) {
        this.equivalenciaDR = value;
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
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad impPagodo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpPagodo() {
        return impPagodo;
    }

    /**
     * Define el valor de la propiedad impPagodo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpPagodo(BigDecimal value) {
        this.impPagodo = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoAnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpSaldoAnt() {
        return impSaldoAnt;
    }

    /**
     * Define el valor de la propiedad impSaldoAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpSaldoAnt(BigDecimal value) {
        this.impSaldoAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoInsoluto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpSaldoInsoluto() {
        return impSaldoInsoluto;
    }

    /**
     * Define el valor de la propiedad impSaldoInsoluto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpSaldoInsoluto(BigDecimal value) {
        this.impSaldoInsoluto = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosDR.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosDR2 }
     *     
     */
    public ImpuestosDR2 getImpuestosDR() {
        return impuestosDR;
    }

    /**
     * Define el valor de la propiedad impuestosDR.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosDR2 }
     *     
     */
    public void setImpuestosDR(ImpuestosDR2 value) {
        this.impuestosDR = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoDePagoDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePagoDR() {
        return metodoDePagoDR;
    }

    /**
     * Define el valor de la propiedad metodoDePagoDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePagoDR(String value) {
        this.metodoDePagoDR = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDR() {
        return monedaDR;
    }

    /**
     * Define el valor de la propiedad monedaDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDR(String value) {
        this.monedaDR = value;
    }

    /**
     * Obtiene el valor de la propiedad numParcialidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumParcialidad() {
        return numParcialidad;
    }

    /**
     * Define el valor de la propiedad numParcialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumParcialidad(Integer value) {
        this.numParcialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoImpDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoImpDR() {
        return objetoImpDR;
    }

    /**
     * Define el valor de la propiedad objetoImpDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoImpDR(String value) {
        this.objetoImpDR = value;
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
     * Obtiene el valor de la propiedad subtotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubtotal(BigDecimal value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambioDR() {
        return tipoCambioDR;
    }

    /**
     * Define el valor de la propiedad tipoCambioDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambioDR(String value) {
        this.tipoCambioDR = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRetenidos() {
        return totalRetenidos;
    }

    /**
     * Define el valor de la propiedad totalRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRetenidos(BigDecimal value) {
        this.totalRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTrasladados() {
        return totalTrasladados;
    }

    /**
     * Define el valor de la propiedad totalTrasladados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTrasladados(BigDecimal value) {
        this.totalTrasladados = value;
    }

}
