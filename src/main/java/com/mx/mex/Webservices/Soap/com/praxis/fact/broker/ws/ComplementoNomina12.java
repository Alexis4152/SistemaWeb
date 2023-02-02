
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoNomina12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoNomina12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deducciones" type="{http://ws.broker.fact.praxis.com/}deducciones12" minOccurs="0"/>
 *         &lt;element name="emisor" type="{http://ws.broker.fact.praxis.com/}emisorComplementoNomina" minOccurs="0"/>
 *         &lt;element name="fechaFinalPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicialPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incapacidades" type="{http://ws.broker.fact.praxis.com/}incapacidades12" minOccurs="0"/>
 *         &lt;element name="numDiasPagados" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="otrosPagos" type="{http://ws.broker.fact.praxis.com/}otrosPagos" minOccurs="0"/>
 *         &lt;element name="percepciones" type="{http://ws.broker.fact.praxis.com/}percepciones12" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://ws.broker.fact.praxis.com/}receptorComplementoNomina" minOccurs="0"/>
 *         &lt;element name="tipoNomina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDeducciones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalOtrosPagos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalPercepciones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoNomina12", propOrder = {
    "deducciones",
    "emisor",
    "fechaFinalPago",
    "fechaInicialPago",
    "fechaPago",
    "incapacidades",
    "numDiasPagados",
    "otrosPagos",
    "percepciones",
    "receptor",
    "tipoNomina",
    "totalDeducciones",
    "totalOtrosPagos",
    "totalPercepciones"
})
public class ComplementoNomina12 {

    protected Deducciones12 deducciones;
    protected EmisorComplementoNomina emisor;
    protected String fechaFinalPago;
    protected String fechaInicialPago;
    protected String fechaPago;
    protected Incapacidades12 incapacidades;
    protected BigDecimal numDiasPagados;
    protected OtrosPagos otrosPagos;
    protected Percepciones12 percepciones;
    protected ReceptorComplementoNomina receptor;
    protected String tipoNomina;
    protected BigDecimal totalDeducciones;
    protected BigDecimal totalOtrosPagos;
    protected BigDecimal totalPercepciones;

    /**
     * Obtiene el valor de la propiedad deducciones.
     * 
     * @return
     *     possible object is
     *     {@link Deducciones12 }
     *     
     */
    public Deducciones12 getDeducciones() {
        return deducciones;
    }

    /**
     * Define el valor de la propiedad deducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Deducciones12 }
     *     
     */
    public void setDeducciones(Deducciones12 value) {
        this.deducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link EmisorComplementoNomina }
     *     
     */
    public EmisorComplementoNomina getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorComplementoNomina }
     *     
     */
    public void setEmisor(EmisorComplementoNomina value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinalPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalPago() {
        return fechaFinalPago;
    }

    /**
     * Define el valor de la propiedad fechaFinalPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalPago(String value) {
        this.fechaFinalPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicialPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicialPago() {
        return fechaInicialPago;
    }

    /**
     * Define el valor de la propiedad fechaInicialPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicialPago(String value) {
        this.fechaInicialPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad incapacidades.
     * 
     * @return
     *     possible object is
     *     {@link Incapacidades12 }
     *     
     */
    public Incapacidades12 getIncapacidades() {
        return incapacidades;
    }

    /**
     * Define el valor de la propiedad incapacidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Incapacidades12 }
     *     
     */
    public void setIncapacidades(Incapacidades12 value) {
        this.incapacidades = value;
    }

    /**
     * Obtiene el valor de la propiedad numDiasPagados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumDiasPagados() {
        return numDiasPagados;
    }

    /**
     * Define el valor de la propiedad numDiasPagados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumDiasPagados(BigDecimal value) {
        this.numDiasPagados = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPagos.
     * 
     * @return
     *     possible object is
     *     {@link OtrosPagos }
     *     
     */
    public OtrosPagos getOtrosPagos() {
        return otrosPagos;
    }

    /**
     * Define el valor de la propiedad otrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link OtrosPagos }
     *     
     */
    public void setOtrosPagos(OtrosPagos value) {
        this.otrosPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad percepciones.
     * 
     * @return
     *     possible object is
     *     {@link Percepciones12 }
     *     
     */
    public Percepciones12 getPercepciones() {
        return percepciones;
    }

    /**
     * Define el valor de la propiedad percepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Percepciones12 }
     *     
     */
    public void setPercepciones(Percepciones12 value) {
        this.percepciones = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorComplementoNomina }
     *     
     */
    public ReceptorComplementoNomina getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorComplementoNomina }
     *     
     */
    public void setReceptor(ReceptorComplementoNomina value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNomina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNomina() {
        return tipoNomina;
    }

    /**
     * Define el valor de la propiedad tipoNomina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNomina(String value) {
        this.tipoNomina = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDeducciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    /**
     * Define el valor de la propiedad totalDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDeducciones(BigDecimal value) {
        this.totalDeducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOtrosPagos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    /**
     * Define el valor de la propiedad totalOtrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOtrosPagos(BigDecimal value) {
        this.totalOtrosPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPercepciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    /**
     * Define el valor de la propiedad totalPercepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPercepciones(BigDecimal value) {
        this.totalPercepciones = value;
    }

}
