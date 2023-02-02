package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.Alumnos;

public interface IAlumnosRepository {

	public List<Alumnos> getAlumno();
	
	public Integer insertAlumno(Alumnos nuevoAlumno);
	
	public Integer deleteAlumno(Alumnos nuevoAlumno);

	
}
