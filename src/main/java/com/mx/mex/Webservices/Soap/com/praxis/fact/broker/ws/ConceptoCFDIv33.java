
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptoCFDIv33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptoCFDIv33">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}concepto">
 *       &lt;sequence>
 *         &lt;element name="claveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoConcepto" type="{http://ws.broker.fact.praxis.com/}complementoConcepto" minOccurs="0"/>
 *         &lt;element name="cuentaPredial" type="{http://ws.broker.fact.praxis.com/}cuentaPredial" minOccurs="0"/>
 *         &lt;element name="desConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestos" type="{http://ws.broker.fact.praxis.com/}impuestoConcepto" minOccurs="0"/>
 *         &lt;element name="informacionAduanera" type="{http://ws.broker.fact.praxis.com/}tInformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textoAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptoCFDIv33", propOrder = {
    "claveProdServ",
    "claveUnidad",
    "complementoConcepto",
    "cuentaPredial",
    "desConcepto",
    "descuento",
    "impuestos",
    "informacionAduanera",
    "textoAdicional"
})
public class ConceptoCFDIv33
    extends Concepto
{

    protected String claveProdServ;
    protected String claveUnidad;
    protected ComplementoConcepto complementoConcepto;
    protected CuentaPredial cuentaPredial;
    protected String desConcepto;
    protected String descuento;
    protected ImpuestoConcepto impuestos;
    @XmlElement(nillable = true)
    protected List<TInformacionAduanera> informacionAduanera;
    protected String textoAdicional;

    /**
     * Obtiene el valor de la propiedad claveProdServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveProdServ() {
        return claveProdServ;
    }

    /**
     * Define el valor de la propiedad claveProdServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveProdServ(String value) {
        this.claveProdServ = value;
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
     * Obtiene el valor de la propiedad complementoConcepto.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoConcepto }
     *     
     */
    public ComplementoConcepto getComplementoConcepto() {
        return complementoConcepto;
    }

    /**
     * Define el valor de la propiedad complementoConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoConcepto }
     *     
     */
    public void setComplementoConcepto(ComplementoConcepto value) {
        this.complementoConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaPredial.
     * 
     * @return
     *     possible object is
     *     {@link CuentaPredial }
     *     
     */
    public CuentaPredial getCuentaPredial() {
        return cuentaPredial;
    }

    /**
     * Define el valor de la propiedad cuentaPredial.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaPredial }
     *     
     */
    public void setCuentaPredial(CuentaPredial value) {
        this.cuentaPredial = value;
    }

    /**
     * Obtiene el valor de la propiedad desConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesConcepto() {
        return desConcepto;
    }

    /**
     * Define el valor de la propiedad desConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesConcepto(String value) {
        this.desConcepto = value;
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
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestoConcepto }
     *     
     */
    public ImpuestoConcepto getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestoConcepto }
     *     
     */
    public void setImpuestos(ImpuestoConcepto value) {
        this.impuestos = value;
    }

    /**
     * Gets the value of the informacionAduanera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionAduanera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInformacionAduanera }
     * 
     * 
     */
    public List<TInformacionAduanera> getInformacionAduanera() {
        if (informacionAduanera == null) {
            informacionAduanera = new ArrayList<TInformacionAduanera>();
        }
        return this.informacionAduanera;
    }

    /**
     * Obtiene el valor de la propiedad textoAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoAdicional() {
        return textoAdicional;
    }

    /**
     * Define el valor de la propiedad textoAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoAdicional(String value) {
        this.textoAdicional = value;
    }

}
