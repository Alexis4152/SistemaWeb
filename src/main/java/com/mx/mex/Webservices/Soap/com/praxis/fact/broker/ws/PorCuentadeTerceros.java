
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para porCuentadeTerceros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="porCuentadeTerceros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuentaPredial" type="{http://ws.broker.fact.praxis.com/}CuentaPredial2" minOccurs="0"/>
 *         &lt;element name="impuestos" type="{http://ws.broker.fact.praxis.com/}impuestos" minOccurs="0"/>
 *         &lt;element name="informacionAduanera" type="{http://ws.broker.fact.praxis.com/}informacionAduanera" minOccurs="0"/>
 *         &lt;element name="informacionFiscalTercero" type="{http://ws.broker.fact.praxis.com/}informacionFiscalTercero" minOccurs="0"/>
 *         &lt;element name="listParte" type="{http://ws.broker.fact.praxis.com/}parte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "porCuentadeTerceros", propOrder = {
    "cuentaPredial",
    "impuestos",
    "informacionAduanera",
    "informacionFiscalTercero",
    "listParte",
    "nombre",
    "rfc"
})
public class PorCuentadeTerceros {

    protected CuentaPredial2 cuentaPredial;
    protected Impuestos impuestos;
    protected InformacionAduanera informacionAduanera;
    protected InformacionFiscalTercero informacionFiscalTercero;
    @XmlElement(nillable = true)
    protected List<Parte> listParte;
    protected String nombre;
    protected String rfc;

    /**
     * Obtiene el valor de la propiedad cuentaPredial.
     * 
     * @return
     *     possible object is
     *     {@link CuentaPredial2 }
     *     
     */
    public CuentaPredial2 getCuentaPredial() {
        return cuentaPredial;
    }

    /**
     * Define el valor de la propiedad cuentaPredial.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaPredial2 }
     *     
     */
    public void setCuentaPredial(CuentaPredial2 value) {
        this.cuentaPredial = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link Impuestos }
     *     
     */
    public Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Impuestos }
     *     
     */
    public void setImpuestos(Impuestos value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAduanera.
     * 
     * @return
     *     possible object is
     *     {@link InformacionAduanera }
     *     
     */
    public InformacionAduanera getInformacionAduanera() {
        return informacionAduanera;
    }

    /**
     * Define el valor de la propiedad informacionAduanera.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionAduanera }
     *     
     */
    public void setInformacionAduanera(InformacionAduanera value) {
        this.informacionAduanera = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionFiscalTercero.
     * 
     * @return
     *     possible object is
     *     {@link InformacionFiscalTercero }
     *     
     */
    public InformacionFiscalTercero getInformacionFiscalTercero() {
        return informacionFiscalTercero;
    }

    /**
     * Define el valor de la propiedad informacionFiscalTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionFiscalTercero }
     *     
     */
    public void setInformacionFiscalTercero(InformacionFiscalTercero value) {
        this.informacionFiscalTercero = value;
    }

    /**
     * Gets the value of the listParte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listParte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListParte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parte }
     * 
     * 
     */
    public List<Parte> getListParte() {
        if (listParte == null) {
            listParte = new ArrayList<Parte>();
        }
        return this.listParte;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

}
