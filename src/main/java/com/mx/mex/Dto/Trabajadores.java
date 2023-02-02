package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.sql.Date;

public class Trabajadores {

	
//	{
//	
//		"idTrabajador": 1,
//		"nombre":"aLEXIS",
//		"edad":1,
//		"salario":20.00
//		"fechaIngreso": 22/12/12
//		
//	}
	
	private BigDecimal idTrabajador;
	private String nombre;
	private Integer edad;
	private Double salario;
	private Date fechaIngreso;
	
	
	
	public BigDecimal getIdTrabajador() {
		return idTrabajador;
	}
	public void setIdTrabajador(BigDecimal idTrabajador) {
		this.idTrabajador = idTrabajador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario= salario;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
