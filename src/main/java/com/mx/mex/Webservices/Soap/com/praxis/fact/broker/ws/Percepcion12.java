
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para percepcion12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="percepcion12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accionesOTitulos" type="{http://ws.broker.fact.praxis.com/}accionesOTitulos" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horasExtra" type="{http://ws.broker.fact.praxis.com/}horasExtra12" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="importeExento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="importeGravado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoPercepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percepcion12", propOrder = {
    "accionesOTitulos",
    "clave",
    "concepto",
    "horasExtra",
    "importeExento",
    "importeGravado",
    "tipoPercepcion"
})
public class Percepcion12 {

    protected AccionesOTitulos accionesOTitulos;
    protected String clave;
    protected String concepto;
    @XmlElement(nillable = true)
    protected List<HorasExtra12> horasExtra;
    protected BigDecimal importeExento;
    protected BigDecimal importeGravado;
    protected String tipoPercepcion;

    /**
     * Obtiene el valor de la propiedad accionesOTitulos.
     * 
     * @return
     *     possible object is
     *     {@link AccionesOTitulos }
     *     
     */
    public AccionesOTitulos getAccionesOTitulos() {
        return accionesOTitulos;
    }

    /**
     * Define el valor de la propiedad accionesOTitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link AccionesOTitulos }
     *     
     */
    public void setAccionesOTitulos(AccionesOTitulos value) {
        this.accionesOTitulos = value;
    }

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
     * Gets the value of the horasExtra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horasExtra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorasExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorasExtra12 }
     * 
     * 
     */
    public List<HorasExtra12> getHorasExtra() {
        if (horasExtra == null) {
            horasExtra = new ArrayList<HorasExtra12>();
        }
        return this.horasExtra;
    }

    /**
     * Obtiene el valor de la propiedad importeExento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteExento() {
        return importeExento;
    }

    /**
     * Define el valor de la propiedad importeExento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteExento(BigDecimal value) {
        this.importeExento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGravado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteGravado() {
        return importeGravado;
    }

    /**
     * Define el valor de la propiedad importeGravado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteGravado(BigDecimal value) {
        this.importeGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPercepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPercepcion() {
        return tipoPercepcion;
    }

    /**
     * Define el valor de la propiedad tipoPercepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPercepcion(String value) {
        this.tipoPercepcion = value;
    }

}
