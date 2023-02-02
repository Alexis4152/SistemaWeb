package com.mx.mex.Dto;

import java.math.BigDecimal;

public class Alumnos {

	private BigDecimal idAlumno;
	private String nombre;
	private BigDecimal salon;
	
	
	
	public BigDecimal getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(BigDecimal idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getSalon() {
		return salon;
	}
	public void setSalon(BigDecimal salon) {
		this.salon = salon;
	}
	
	
	
}
