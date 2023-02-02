package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.Trabajadores;

public interface ITrabajadores {

	
	public List<Trabajadores> getTrabjadores();
	public String insertTrabajadores(Trabajadores nuevoTrabajador);
	
	
}
