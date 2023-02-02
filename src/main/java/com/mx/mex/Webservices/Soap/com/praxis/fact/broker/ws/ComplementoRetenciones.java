
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrendamientoEnFideicomiso" type="{http://ws.broker.fact.praxis.com/}arrendamientoEnFideicomiso" minOccurs="0"/>
 *         &lt;element name="dividendos" type="{http://ws.broker.fact.praxis.com/}dividendos" minOccurs="0"/>
 *         &lt;element name="enajenaciondeacciones" type="{http://ws.broker.fact.praxis.com/}enajenacionDeAcciones" minOccurs="0"/>
 *         &lt;element name="fideicomisonoempresarial" type="{http://ws.broker.fact.praxis.com/}fideicomisonoempresarial" minOccurs="0"/>
 *         &lt;element name="intereses" type="{http://ws.broker.fact.praxis.com/}intereses" minOccurs="0"/>
 *         &lt;element name="interesesHipotecarios" type="{http://ws.broker.fact.praxis.com/}interesesHipotecarios" minOccurs="0"/>
 *         &lt;element name="operacionesConDerivados" type="{http://ws.broker.fact.praxis.com/}operacionesConDerivados" minOccurs="0"/>
 *         &lt;element name="pagosAExtranjeros" type="{http://ws.broker.fact.praxis.com/}pagosAExtranjeros" minOccurs="0"/>
 *         &lt;element name="planesDeRetiro" type="{http://ws.broker.fact.praxis.com/}planesDeRetiro" minOccurs="0"/>
 *         &lt;element name="planesDeRetiro11" type="{http://ws.broker.fact.praxis.com/}planesDeRetiro11" minOccurs="0"/>
 *         &lt;element name="premios" type="{http://ws.broker.fact.praxis.com/}premios" minOccurs="0"/>
 *         &lt;element name="sectorFinanciero" type="{http://ws.broker.fact.praxis.com/}sectorFinanciero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoRetenciones", propOrder = {
    "arrendamientoEnFideicomiso",
    "dividendos",
    "enajenaciondeacciones",
    "fideicomisonoempresarial",
    "intereses",
    "interesesHipotecarios",
    "operacionesConDerivados",
    "pagosAExtranjeros",
    "planesDeRetiro",
    "planesDeRetiro11",
    "premios",
    "sectorFinanciero"
})
public class ComplementoRetenciones {

    protected ArrendamientoEnFideicomiso arrendamientoEnFideicomiso;
    protected Dividendos dividendos;
    protected EnajenacionDeAcciones enajenaciondeacciones;
    protected Fideicomisonoempresarial fideicomisonoempresarial;
    protected Intereses intereses;
    protected InteresesHipotecarios interesesHipotecarios;
    protected OperacionesConDerivados operacionesConDerivados;
    protected PagosAExtranjeros pagosAExtranjeros;
    protected PlanesDeRetiro planesDeRetiro;
    protected PlanesDeRetiro11 planesDeRetiro11;
    protected Premios premios;
    protected SectorFinanciero sectorFinanciero;

    /**
     * Obtiene el valor de la propiedad arrendamientoEnFideicomiso.
     * 
     * @return
     *     possible object is
     *     {@link ArrendamientoEnFideicomiso }
     *     
     */
    public ArrendamientoEnFideicomiso getArrendamientoEnFideicomiso() {
        return arrendamientoEnFideicomiso;
    }

    /**
     * Define el valor de la propiedad arrendamientoEnFideicomiso.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrendamientoEnFideicomiso }
     *     
     */
    public void setArrendamientoEnFideicomiso(ArrendamientoEnFideicomiso value) {
        this.arrendamientoEnFideicomiso = value;
    }

    /**
     * Obtiene el valor de la propiedad dividendos.
     * 
     * @return
     *     possible object is
     *     {@link Dividendos }
     *     
     */
    public Dividendos getDividendos() {
        return dividendos;
    }

    /**
     * Define el valor de la propiedad dividendos.
     * 
     * @param value
     *     allowed object is
     *     {@link Dividendos }
     *     
     */
    public void setDividendos(Dividendos value) {
        this.dividendos = value;
    }

    /**
     * Obtiene el valor de la propiedad enajenaciondeacciones.
     * 
     * @return
     *     possible object is
     *     {@link EnajenacionDeAcciones }
     *     
     */
    public EnajenacionDeAcciones getEnajenaciondeacciones() {
        return enajenaciondeacciones;
    }

    /**
     * Define el valor de la propiedad enajenaciondeacciones.
     * 
     * @param value
     *     allowed object is
     *     {@link EnajenacionDeAcciones }
     *     
     */
    public void setEnajenaciondeacciones(EnajenacionDeAcciones value) {
        this.enajenaciondeacciones = value;
    }

    /**
     * Obtiene el valor de la propiedad fideicomisonoempresarial.
     * 
     * @return
     *     possible object is
     *     {@link Fideicomisonoempresarial }
     *     
     */
    public Fideicomisonoempresarial getFideicomisonoempresarial() {
        return fideicomisonoempresarial;
    }

    /**
     * Define el valor de la propiedad fideicomisonoempresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link Fideicomisonoempresarial }
     *     
     */
    public void setFideicomisonoempresarial(Fideicomisonoempresarial value) {
        this.fideicomisonoempresarial = value;
    }

    /**
     * Obtiene el valor de la propiedad intereses.
     * 
     * @return
     *     possible object is
     *     {@link Intereses }
     *     
     */
    public Intereses getIntereses() {
        return intereses;
    }

    /**
     * Define el valor de la propiedad intereses.
     * 
     * @param value
     *     allowed object is
     *     {@link Intereses }
     *     
     */
    public void setIntereses(Intereses value) {
        this.intereses = value;
    }

    /**
     * Obtiene el valor de la propiedad interesesHipotecarios.
     * 
     * @return
     *     possible object is
     *     {@link InteresesHipotecarios }
     *     
     */
    public InteresesHipotecarios getInteresesHipotecarios() {
        return interesesHipotecarios;
    }

    /**
     * Define el valor de la propiedad interesesHipotecarios.
     * 
     * @param value
     *     allowed object is
     *     {@link InteresesHipotecarios }
     *     
     */
    public void setInteresesHipotecarios(InteresesHipotecarios value) {
        this.interesesHipotecarios = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionesConDerivados.
     * 
     * @return
     *     possible object is
     *     {@link OperacionesConDerivados }
     *     
     */
    public OperacionesConDerivados getOperacionesConDerivados() {
        return operacionesConDerivados;
    }

    /**
     * Define el valor de la propiedad operacionesConDerivados.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionesConDerivados }
     *     
     */
    public void setOperacionesConDerivados(OperacionesConDerivados value) {
        this.operacionesConDerivados = value;
    }

    /**
     * Obtiene el valor de la propiedad pagosAExtranjeros.
     * 
     * @return
     *     possible object is
     *     {@link PagosAExtranjeros }
     *     
     */
    public PagosAExtranjeros getPagosAExtranjeros() {
        return pagosAExtranjeros;
    }

    /**
     * Define el valor de la propiedad pagosAExtranjeros.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosAExtranjeros }
     *     
     */
    public void setPagosAExtranjeros(PagosAExtranjeros value) {
        this.pagosAExtranjeros = value;
    }

    /**
     * Obtiene el valor de la propiedad planesDeRetiro.
     * 
     * @return
     *     possible object is
     *     {@link PlanesDeRetiro }
     *     
     */
    public PlanesDeRetiro getPlanesDeRetiro() {
        return planesDeRetiro;
    }

    /**
     * Define el valor de la propiedad planesDeRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanesDeRetiro }
     *     
     */
    public void setPlanesDeRetiro(PlanesDeRetiro value) {
        this.planesDeRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad planesDeRetiro11.
     * 
     * @return
     *     possible object is
     *     {@link PlanesDeRetiro11 }
     *     
     */
    public PlanesDeRetiro11 getPlanesDeRetiro11() {
        return planesDeRetiro11;
    }

    /**
     * Define el valor de la propiedad planesDeRetiro11.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanesDeRetiro11 }
     *     
     */
    public void setPlanesDeRetiro11(PlanesDeRetiro11 value) {
        this.planesDeRetiro11 = value;
    }

    /**
     * Obtiene el valor de la propiedad premios.
     * 
     * @return
     *     possible object is
     *     {@link Premios }
     *     
     */
    public Premios getPremios() {
        return premios;
    }

    /**
     * Define el valor de la propiedad premios.
     * 
     * @param value
     *     allowed object is
     *     {@link Premios }
     *     
     */
    public void setPremios(Premios value) {
        this.premios = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link SectorFinanciero }
     *     
     */
    public SectorFinanciero getSectorFinanciero() {
        return sectorFinanciero;
    }

    /**
     * Define el valor de la propiedad sectorFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorFinanciero }
     *     
     */
    public void setSectorFinanciero(SectorFinanciero value) {
        this.sectorFinanciero = value;
    }

}
