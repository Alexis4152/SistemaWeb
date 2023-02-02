package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.Alumnos;

public interface IAlumnos {

	public List<Alumnos> getAlumno();
	
	public String insertAlumno(Alumnos nuevoAlumno);
	
	public String deleteAlumno(Alumnos nuevoAlumno);
	
}
