
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catBeneficiarop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaOrdenante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctoRelacionado" type="{http://ws.broker.fact.praxis.com/}doctoRelacionado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaDePagoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestos" type="{http://ws.broker.fact.praxis.com/}impuestoCFDIv33" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monedaP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nomBancoOrdExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcEmisorCtaBen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcEmisorCtaOrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selloPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCadPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCambioP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pago", propOrder = {
    "cadPago",
    "catBeneficiarop",
    "certPago",
    "ctaOrdenante",
    "doctoRelacionado",
    "fechaPago",
    "formaDePagoP",
    "impuestos",
    "monedaP",
    "monto",
    "nomBancoOrdExt",
    "numOperacion",
    "rfcEmisorCtaBen",
    "rfcEmisorCtaOrd",
    "selloPago",
    "tipoCadPago",
    "tipoCambioP"
})
public class Pago {

    protected String cadPago;
    protected String catBeneficiarop;
    protected String certPago;
    protected String ctaOrdenante;
    @XmlElement(nillable = true)
    protected List<DoctoRelacionado> doctoRelacionado;
    protected String fechaPago;
    protected String formaDePagoP;
    @XmlElement(nillable = true)
    protected List<ImpuestoCFDIv33> impuestos;
    protected String monedaP;
    protected BigDecimal monto;
    protected String nomBancoOrdExt;
    protected String numOperacion;
    protected String rfcEmisorCtaBen;
    protected String rfcEmisorCtaOrd;
    protected String selloPago;
    protected String tipoCadPago;
    protected String tipoCambioP;

    /**
     * Obtiene el valor de la propiedad cadPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadPago() {
        return cadPago;
    }

    /**
     * Define el valor de la propiedad cadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadPago(String value) {
        this.cadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad catBeneficiarop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatBeneficiarop() {
        return catBeneficiarop;
    }

    /**
     * Define el valor de la propiedad catBeneficiarop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatBeneficiarop(String value) {
        this.catBeneficiarop = value;
    }

    /**
     * Obtiene el valor de la propiedad certPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertPago() {
        return certPago;
    }

    /**
     * Define el valor de la propiedad certPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertPago(String value) {
        this.certPago = value;
    }

    /**
     * Obtiene el valor de la propiedad ctaOrdenante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtaOrdenante() {
        return ctaOrdenante;
    }

    /**
     * Define el valor de la propiedad ctaOrdenante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtaOrdenante(String value) {
        this.ctaOrdenante = value;
    }

    /**
     * Gets the value of the doctoRelacionado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doctoRelacionado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoctoRelacionado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoctoRelacionado }
     * 
     * 
     */
    public List<DoctoRelacionado> getDoctoRelacionado() {
        if (doctoRelacionado == null) {
            doctoRelacionado = new ArrayList<DoctoRelacionado>();
        }
        return this.doctoRelacionado;
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
     * Obtiene el valor de la propiedad formaDePagoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePagoP() {
        return formaDePagoP;
    }

    /**
     * Define el valor de la propiedad formaDePagoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePagoP(String value) {
        this.formaDePagoP = value;
    }

    /**
     * Gets the value of the impuestos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestoCFDIv33 }
     * 
     * 
     */
    public List<ImpuestoCFDIv33> getImpuestos() {
        if (impuestos == null) {
            impuestos = new ArrayList<ImpuestoCFDIv33>();
        }
        return this.impuestos;
    }

    /**
     * Obtiene el valor de la propiedad monedaP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaP() {
        return monedaP;
    }

    /**
     * Define el valor de la propiedad monedaP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaP(String value) {
        this.monedaP = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad nomBancoOrdExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBancoOrdExt() {
        return nomBancoOrdExt;
    }

    /**
     * Define el valor de la propiedad nomBancoOrdExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBancoOrdExt(String value) {
        this.nomBancoOrdExt = value;
    }

    /**
     * Obtiene el valor de la propiedad numOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOperacion() {
        return numOperacion;
    }

    /**
     * Define el valor de la propiedad numOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOperacion(String value) {
        this.numOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmisorCtaBen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisorCtaBen() {
        return rfcEmisorCtaBen;
    }

    /**
     * Define el valor de la propiedad rfcEmisorCtaBen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisorCtaBen(String value) {
        this.rfcEmisorCtaBen = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmisorCtaOrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisorCtaOrd() {
        return rfcEmisorCtaOrd;
    }

    /**
     * Define el valor de la propiedad rfcEmisorCtaOrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisorCtaOrd(String value) {
        this.rfcEmisorCtaOrd = value;
    }

    /**
     * Obtiene el valor de la propiedad selloPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloPago() {
        return selloPago;
    }

    /**
     * Define el valor de la propiedad selloPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloPago(String value) {
        this.selloPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCadPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCadPago() {
        return tipoCadPago;
    }

    /**
     * Define el valor de la propiedad tipoCadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCadPago(String value) {
        this.tipoCadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambioP() {
        return tipoCambioP;
    }

    /**
     * Define el valor de la propiedad tipoCambioP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambioP(String value) {
        this.tipoCambioP = value;
    }

}
