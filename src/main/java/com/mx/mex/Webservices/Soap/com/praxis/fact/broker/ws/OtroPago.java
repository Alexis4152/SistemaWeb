
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para otroPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="otroPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compensacionSaldosAFavor" type="{http://ws.broker.fact.praxis.com/}compensacionSaldosAFavor" minOccurs="0"/>
 *         &lt;element name="concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="subsidioAlEmpleo" type="{http://ws.broker.fact.praxis.com/}subsidioAlEmpleo" minOccurs="0"/>
 *         &lt;element name="tipoOtroPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otroPago", propOrder = {
    "clave",
    "compensacionSaldosAFavor",
    "concepto",
    "importe",
    "subsidioAlEmpleo",
    "tipoOtroPago"
})
public class OtroPago {

    protected String clave;
    protected CompensacionSaldosAFavor compensacionSaldosAFavor;
    protected String concepto;
    protected BigDecimal importe;
    protected SubsidioAlEmpleo subsidioAlEmpleo;
    protected String tipoOtroPago;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad compensacionSaldosAFavor.
     * 
     * @return
     *     possible object is
     *     {@link CompensacionSaldosAFavor }
     *     
     */
    public CompensacionSaldosAFavor getCompensacionSaldosAFavor() {
        return compensacionSaldosAFavor;
    }

    /**
     * Define el valor de la propiedad compensacionSaldosAFavor.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensacionSaldosAFavor }
     *     
     */
    public void setCompensacionSaldosAFavor(CompensacionSaldosAFavor value) {
        this.compensacionSaldosAFavor = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidioAlEmpleo.
     * 
     * @return
     *     possible object is
     *     {@link SubsidioAlEmpleo }
     *     
     */
    public SubsidioAlEmpleo getSubsidioAlEmpleo() {
        return subsidioAlEmpleo;
    }

    /**
     * Define el valor de la propiedad subsidioAlEmpleo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidioAlEmpleo }
     *     
     */
    public void setSubsidioAlEmpleo(SubsidioAlEmpleo value) {
        this.subsidioAlEmpleo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOtroPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOtroPago() {
        return tipoOtroPago;
    }

    /**
     * Define el valor de la propiedad tipoOtroPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOtroPago(String value) {
        this.tipoOtroPago = value;
    }

}
