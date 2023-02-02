package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mex.Dto.AlumnosNoviembre;

public class AlumnosNoviembreMapper<T> implements RowMapper<AlumnosNoviembre> {

	public AlumnosNoviembre mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnosNoviembre objeto = new AlumnosNoviembre();
		objeto.setIdAlumno(rs.getBigDecimal("ID_ALUMNO"));
		objeto.setNombreAlumno(rs.getString("NOMBRE_DEL_ALUMNO"));
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setFechaInscripcion(rs.getDate("FECHA_DE_INSCRIPCION"));
		objeto.setMateria(rs.getString("MATERIA"));
		objeto.setMaestro(rs.getString("MAESTRO"));
		
		return objeto;
	}
}
