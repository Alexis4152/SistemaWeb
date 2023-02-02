package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.sql.Date;

public class AlumnosNoviembre {

	private BigDecimal idAlumno;
	private String nombreAlumno;
	private int edad;
	private Date fechaInscripcion;
	private String materia;
	private String maestro;
	
	
	
	public BigDecimal getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(BigDecimal idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}
	
	
	
}
