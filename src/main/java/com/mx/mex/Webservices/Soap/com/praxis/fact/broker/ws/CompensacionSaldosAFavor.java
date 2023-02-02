
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para compensacionSaldosAFavor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="compensacionSaldosAFavor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="remanenteSalFav" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saldoAFavor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compensacionSaldosAFavor", propOrder = {
    "ano",
    "remanenteSalFav",
    "saldoAFavor"
})
public class CompensacionSaldosAFavor {

    protected short ano;
    protected BigDecimal remanenteSalFav;
    protected BigDecimal saldoAFavor;

    /**
     * Obtiene el valor de la propiedad ano.
     * 
     */
    public short getAno() {
        return ano;
    }

    /**
     * Define el valor de la propiedad ano.
     * 
     */
    public void setAno(short value) {
        this.ano = value;
    }

    /**
     * Obtiene el valor de la propiedad remanenteSalFav.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemanenteSalFav() {
        return remanenteSalFav;
    }

    /**
     * Define el valor de la propiedad remanenteSalFav.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemanenteSalFav(BigDecimal value) {
        this.remanenteSalFav = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoAFavor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoAFavor() {
        return saldoAFavor;
    }

    /**
     * Define el valor de la propiedad saldoAFavor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoAFavor(BigDecimal value) {
        this.saldoAFavor = value;
    }

}
