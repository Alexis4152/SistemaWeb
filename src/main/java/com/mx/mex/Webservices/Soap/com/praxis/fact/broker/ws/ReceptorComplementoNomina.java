
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para receptorComplementoNomina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="receptorComplementoNomina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="antiguedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveEntFed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuentaBancaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicioRelLaboral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicidadPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riesgoPuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salarioBaseCotApor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="salarioDiarioIntegrado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sindicalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subContratacion" type="{http://ws.broker.fact.praxis.com/}subContratacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoJornada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receptorComplementoNomina", propOrder = {
    "antiguedad",
    "banco",
    "claveEntFed",
    "cuentaBancaria",
    "curp",
    "departamento",
    "fechaInicioRelLaboral",
    "numEmpleado",
    "numSeguridadSocial",
    "periodicidadPago",
    "puesto",
    "riesgoPuesto",
    "salarioBaseCotApor",
    "salarioDiarioIntegrado",
    "sindicalizado",
    "subContratacion",
    "tipoContrato",
    "tipoJornada",
    "tipoRegimen"
})
public class ReceptorComplementoNomina {

    protected String antiguedad;
    protected String banco;
    protected String claveEntFed;
    protected String cuentaBancaria;
    protected String curp;
    protected String departamento;
    protected String fechaInicioRelLaboral;
    protected String numEmpleado;
    protected String numSeguridadSocial;
    protected String periodicidadPago;
    protected String puesto;
    protected String riesgoPuesto;
    protected BigDecimal salarioBaseCotApor;
    protected BigDecimal salarioDiarioIntegrado;
    protected String sindicalizado;
    @XmlElement(nillable = true)
    protected List<SubContratacion> subContratacion;
    protected String tipoContrato;
    protected String tipoJornada;
    protected String tipoRegimen;

    /**
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiguedad() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiguedad(String value) {
        this.antiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad claveEntFed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveEntFed() {
        return claveEntFed;
    }

    /**
     * Define el valor de la propiedad claveEntFed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveEntFed(String value) {
        this.claveEntFed = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Define el valor de la propiedad cuentaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaBancaria(String value) {
        this.cuentaBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioRelLaboral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioRelLaboral() {
        return fechaInicioRelLaboral;
    }

    /**
     * Define el valor de la propiedad fechaInicioRelLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioRelLaboral(String value) {
        this.fechaInicioRelLaboral = value;
    }

    /**
     * Obtiene el valor de la propiedad numEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Define el valor de la propiedad numEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEmpleado(String value) {
        this.numEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad numSeguridadSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    /**
     * Define el valor de la propiedad numSeguridadSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSeguridadSocial(String value) {
        this.numSeguridadSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidadPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidadPago() {
        return periodicidadPago;
    }

    /**
     * Define el valor de la propiedad periodicidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidadPago(String value) {
        this.periodicidadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad puesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Define el valor de la propiedad puesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuesto(String value) {
        this.puesto = value;
    }

    /**
     * Obtiene el valor de la propiedad riesgoPuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiesgoPuesto() {
        return riesgoPuesto;
    }

    /**
     * Define el valor de la propiedad riesgoPuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiesgoPuesto(String value) {
        this.riesgoPuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioBaseCotApor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioBaseCotApor() {
        return salarioBaseCotApor;
    }

    /**
     * Define el valor de la propiedad salarioBaseCotApor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarioBaseCotApor(BigDecimal value) {
        this.salarioBaseCotApor = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioDiarioIntegrado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioDiarioIntegrado() {
        return salarioDiarioIntegrado;
    }

    /**
     * Define el valor de la propiedad salarioDiarioIntegrado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarioDiarioIntegrado(BigDecimal value) {
        this.salarioDiarioIntegrado = value;
    }

    /**
     * Obtiene el valor de la propiedad sindicalizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSindicalizado() {
        return sindicalizado;
    }

    /**
     * Define el valor de la propiedad sindicalizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSindicalizado(String value) {
        this.sindicalizado = value;
    }

    /**
     * Gets the value of the subContratacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subContratacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubContratacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubContratacion }
     * 
     * 
     */
    public List<SubContratacion> getSubContratacion() {
        if (subContratacion == null) {
            subContratacion = new ArrayList<SubContratacion>();
        }
        return this.subContratacion;
    }

    /**
     * Obtiene el valor de la propiedad tipoContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Define el valor de la propiedad tipoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContrato(String value) {
        this.tipoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoJornada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoJornada() {
        return tipoJornada;
    }

    /**
     * Define el valor de la propiedad tipoJornada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoJornada(String value) {
        this.tipoJornada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRegimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * Define el valor de la propiedad tipoRegimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegimen(String value) {
        this.tipoRegimen = value;
    }

}
