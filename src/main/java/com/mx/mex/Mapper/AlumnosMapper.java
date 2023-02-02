package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mex.Dto.Alumnos;

public class AlumnosMapper<T> implements RowMapper<Alumnos>{

	@Override
	public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumnos objeto = new Alumnos();
		
		objeto.setIdAlumno(rs.getBigDecimal("ID_ALUMNO"));
		objeto.setNombre(rs.getString("NOMBRE"));
		objeto.setSalon(rs.getBigDecimal("SALON"));
		
		return objeto;
	}

}
