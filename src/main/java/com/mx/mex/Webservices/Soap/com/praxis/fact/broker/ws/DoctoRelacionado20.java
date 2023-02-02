
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DoctoRelacionado20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DoctoRelacionado20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equivalenciaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impPagado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impSaldoAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impSaldoInsoluto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestosDR" type="{http://ws.broker.fact.praxis.com/}impuestosDR" minOccurs="0"/>
 *         &lt;element name="monedaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numParcialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetoImpDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoctoRelacionado20", propOrder = {
    "equivalenciaDR",
    "folio",
    "idDocumento",
    "impPagado",
    "impSaldoAnt",
    "impSaldoInsoluto",
    "impuestosDR",
    "monedaDR",
    "numParcialidad",
    "objetoImpDR",
    "serie"
})
public class DoctoRelacionado20 {

    protected String equivalenciaDR;
    protected String folio;
    protected String idDocumento;
    protected String impPagado;
    protected String impSaldoAnt;
    protected String impSaldoInsoluto;
    protected ImpuestosDR impuestosDR;
    protected String monedaDR;
    protected String numParcialidad;
    protected String objetoImpDR;
    protected String serie;

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
     * Obtiene el valor de la propiedad impPagado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpPagado() {
        return impPagado;
    }

    /**
     * Define el valor de la propiedad impPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpPagado(String value) {
        this.impPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpSaldoAnt() {
        return impSaldoAnt;
    }

    /**
     * Define el valor de la propiedad impSaldoAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpSaldoAnt(String value) {
        this.impSaldoAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoInsoluto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpSaldoInsoluto() {
        return impSaldoInsoluto;
    }

    /**
     * Define el valor de la propiedad impSaldoInsoluto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpSaldoInsoluto(String value) {
        this.impSaldoInsoluto = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosDR.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosDR }
     *     
     */
    public ImpuestosDR getImpuestosDR() {
        return impuestosDR;
    }

    /**
     * Define el valor de la propiedad impuestosDR.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosDR }
     *     
     */
    public void setImpuestosDR(ImpuestosDR value) {
        this.impuestosDR = value;
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
     *     {@link String }
     *     
     */
    public String getNumParcialidad() {
        return numParcialidad;
    }

    /**
     * Define el valor de la propiedad numParcialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumParcialidad(String value) {
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

}
