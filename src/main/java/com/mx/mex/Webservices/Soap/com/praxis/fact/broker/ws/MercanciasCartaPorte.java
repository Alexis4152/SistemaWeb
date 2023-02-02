
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mercanciasCartaPorte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mercanciasCartaPorte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autotransporte" type="{http://ws.broker.fact.praxis.com/}autotransporte" minOccurs="0"/>
 *         &lt;element name="cargoPorTasacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="mercancia" type="{http://ws.broker.fact.praxis.com/}mercanciaCartaPorte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numTotalMercancias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pesoBrutoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pesoNetoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="transporteAereo" type="{http://ws.broker.fact.praxis.com/}transporteAereo" minOccurs="0"/>
 *         &lt;element name="transporteFerroviario" type="{http://ws.broker.fact.praxis.com/}transporteFerroviario" minOccurs="0"/>
 *         &lt;element name="transporteMaritimo" type="{http://ws.broker.fact.praxis.com/}transporteMaritimo" minOccurs="0"/>
 *         &lt;element name="unidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mercanciasCartaPorte", propOrder = {
    "autotransporte",
    "cargoPorTasacion",
    "mercancia",
    "numTotalMercancias",
    "pesoBrutoTotal",
    "pesoNetoTotal",
    "transporteAereo",
    "transporteFerroviario",
    "transporteMaritimo",
    "unidadPeso"
})
public class MercanciasCartaPorte {

    protected Autotransporte autotransporte;
    protected BigDecimal cargoPorTasacion;
    @XmlElement(nillable = true)
    protected List<MercanciaCartaPorte> mercancia;
    protected int numTotalMercancias;
    protected BigDecimal pesoBrutoTotal;
    protected BigDecimal pesoNetoTotal;
    protected TransporteAereo transporteAereo;
    protected TransporteFerroviario transporteFerroviario;
    protected TransporteMaritimo transporteMaritimo;
    protected String unidadPeso;

    /**
     * Obtiene el valor de la propiedad autotransporte.
     * 
     * @return
     *     possible object is
     *     {@link Autotransporte }
     *     
     */
    public Autotransporte getAutotransporte() {
        return autotransporte;
    }

    /**
     * Define el valor de la propiedad autotransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Autotransporte }
     *     
     */
    public void setAutotransporte(Autotransporte value) {
        this.autotransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoPorTasacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCargoPorTasacion() {
        return cargoPorTasacion;
    }

    /**
     * Define el valor de la propiedad cargoPorTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCargoPorTasacion(BigDecimal value) {
        this.cargoPorTasacion = value;
    }

    /**
     * Gets the value of the mercancia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercancia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercancia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MercanciaCartaPorte }
     * 
     * 
     */
    public List<MercanciaCartaPorte> getMercancia() {
        if (mercancia == null) {
            mercancia = new ArrayList<MercanciaCartaPorte>();
        }
        return this.mercancia;
    }

    /**
     * Obtiene el valor de la propiedad numTotalMercancias.
     * 
     */
    public int getNumTotalMercancias() {
        return numTotalMercancias;
    }

    /**
     * Define el valor de la propiedad numTotalMercancias.
     * 
     */
    public void setNumTotalMercancias(int value) {
        this.numTotalMercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBrutoTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * Define el valor de la propiedad pesoBrutoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBrutoTotal(BigDecimal value) {
        this.pesoBrutoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoNetoTotal() {
        return pesoNetoTotal;
    }

    /**
     * Define el valor de la propiedad pesoNetoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoNetoTotal(BigDecimal value) {
        this.pesoNetoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteAereo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteAereo }
     *     
     */
    public TransporteAereo getTransporteAereo() {
        return transporteAereo;
    }

    /**
     * Define el valor de la propiedad transporteAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteAereo }
     *     
     */
    public void setTransporteAereo(TransporteAereo value) {
        this.transporteAereo = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteFerroviario.
     * 
     * @return
     *     possible object is
     *     {@link TransporteFerroviario }
     *     
     */
    public TransporteFerroviario getTransporteFerroviario() {
        return transporteFerroviario;
    }

    /**
     * Define el valor de la propiedad transporteFerroviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteFerroviario }
     *     
     */
    public void setTransporteFerroviario(TransporteFerroviario value) {
        this.transporteFerroviario = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteMaritimo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteMaritimo }
     *     
     */
    public TransporteMaritimo getTransporteMaritimo() {
        return transporteMaritimo;
    }

    /**
     * Define el valor de la propiedad transporteMaritimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteMaritimo }
     *     
     */
    public void setTransporteMaritimo(TransporteMaritimo value) {
        this.transporteMaritimo = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPeso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPeso() {
        return unidadPeso;
    }

    /**
     * Define el valor de la propiedad unidadPeso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPeso(String value) {
        this.unidadPeso = value;
    }

}
