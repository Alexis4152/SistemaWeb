
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptoCFDIv40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptoCFDIv40">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}concepto">
 *       &lt;sequence>
 *         &lt;element name="claveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoConcepto" type="{http://ws.broker.fact.praxis.com/}complementoConcepto" minOccurs="0"/>
 *         &lt;element name="cuentaPredial" type="{http://ws.broker.fact.praxis.com/}CuentaPredial3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="desConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestos" type="{http://ws.broker.fact.praxis.com/}ImpuestoConcepto2" minOccurs="0"/>
 *         &lt;element name="informacionAduanera" type="{http://ws.broker.fact.praxis.com/}InformacionAduanera2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objetoImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parte" type="{http://ws.broker.fact.praxis.com/}Parte2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textoAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aCuentaTerceros" type="{http://ws.broker.fact.praxis.com/}aCuentaTerceros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptoCFDIv40", propOrder = {
    "claveProdServ",
    "claveUnidad",
    "complementoConcepto",
    "cuentaPredial",
    "desConcepto",
    "descuento",
    "impuestos",
    "informacionAduanera",
    "objetoImp",
    "parte",
    "textoAdicional",
    "aCuentaTerceros"
})
public class ConceptoCFDIv40
    extends Concepto
{

    protected String claveProdServ;
    protected String claveUnidad;
    protected ComplementoConcepto complementoConcepto;
    @XmlElement(nillable = true)
    protected List<CuentaPredial3> cuentaPredial;
    protected String desConcepto;
    protected String descuento;
    protected ImpuestoConcepto2 impuestos;
    @XmlElement(nillable = true)
    protected List<InformacionAduanera2> informacionAduanera;
    protected String objetoImp;
    @XmlElement(nillable = true)
    protected List<Parte2> parte;
    protected String textoAdicional;
    protected ACuentaTerceros aCuentaTerceros;

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
     * Gets the value of the cuentaPredial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentaPredial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentaPredial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuentaPredial3 }
     * 
     * 
     */
    public List<CuentaPredial3> getCuentaPredial() {
        if (cuentaPredial == null) {
            cuentaPredial = new ArrayList<CuentaPredial3>();
        }
        return this.cuentaPredial;
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
     *     {@link ImpuestoConcepto2 }
     *     
     */
    public ImpuestoConcepto2 getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestoConcepto2 }
     *     
     */
    public void setImpuestos(ImpuestoConcepto2 value) {
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
     * {@link InformacionAduanera2 }
     * 
     * 
     */
    public List<InformacionAduanera2> getInformacionAduanera() {
        if (informacionAduanera == null) {
            informacionAduanera = new ArrayList<InformacionAduanera2>();
        }
        return this.informacionAduanera;
    }

    /**
     * Obtiene el valor de la propiedad objetoImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoImp() {
        return objetoImp;
    }

    /**
     * Define el valor de la propiedad objetoImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoImp(String value) {
        this.objetoImp = value;
    }

    /**
     * Gets the value of the parte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parte2 }
     * 
     * 
     */
    public List<Parte2> getParte() {
        if (parte == null) {
            parte = new ArrayList<Parte2>();
        }
        return this.parte;
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

    /**
     * Obtiene el valor de la propiedad aCuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link ACuentaTerceros }
     *     
     */
    public ACuentaTerceros getACuentaTerceros() {
        return aCuentaTerceros;
    }

    /**
     * Define el valor de la propiedad aCuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link ACuentaTerceros }
     *     
     */
    public void setACuentaTerceros(ACuentaTerceros value) {
        this.aCuentaTerceros = value;
    }

}
