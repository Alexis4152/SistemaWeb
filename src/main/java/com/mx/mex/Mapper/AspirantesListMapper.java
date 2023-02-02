package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mex.Dto.Aspirantes;
import com.mx.mex.Dto.Usuario;


public class AspirantesListMapper<T> implements RowMapper<Aspirantes> {

	public Aspirantes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Aspirantes objeto = new Aspirantes();

	    objeto.setIdAlumno(rs.getBigDecimal("ID_ALUMNO"));
	    objeto.setNombreAlumno(rs.getString("NOMBRE_ALUMNO"));
	    objeto.setEdad(rs.getInt("EDAD"));
	    objeto.setFechaInscripcion(rs.getDate("FECHA_INSCRIPCION"));
	    objeto.setMaestro(rs.getString("NOMBRE"));
	    objeto.setCurso(rs.getString("NOMBRE_MATERIA"));
	    
		return objeto;
	}


}

