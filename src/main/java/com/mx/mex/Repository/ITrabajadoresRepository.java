package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.Trabajadores;

public interface ITrabajadoresRepository {

	public List<Trabajadores> getTrabjadores();
	public Integer insertTrabajadores(Trabajadores nuevoTrabajador);

}
