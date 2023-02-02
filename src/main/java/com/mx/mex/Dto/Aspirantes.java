package com.mx.mex.Dto;

import java.math.BigDecimal;
import java.util.Date;

public class Aspirantes {

	
	private BigDecimal idAlumno;
	private String nombreAlumno;
	private Integer edad;
	private Date fechaInscripcion;
	private String curso;
	private String maestro;
	private BigDecimal cursoId;
	private BigDecimal maestroId;
		

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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}

	public BigDecimal getCursoId() {
		return cursoId;
	}
	public void setCursoId(BigDecimal cursoId) {
		this.cursoId = cursoId;
	}
	public BigDecimal getMaestroId() {
		return maestroId;
	}
	public void setMaestroId(BigDecimal maestroId) {
		this.maestroId = maestroId;
	}
	
	@Override
	public String toString() {
		return "Aspirantes [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + ", edad=" + edad
				+ ", fechaInscripcion=" + fechaInscripcion + ", curso=" + curso + ", masestro=" + maestro + "]";
	}
	
	
	
}
