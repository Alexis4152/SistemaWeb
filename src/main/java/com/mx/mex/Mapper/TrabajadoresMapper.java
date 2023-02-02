package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.mex.Dto.Trabajadores;

public class TrabajadoresMapper<T> implements RowMapper<Trabajadores>{

	@Override
	public Trabajadores mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trabajadores objeto = new Trabajadores();
		objeto.setIdTrabajador(rs.getBigDecimal("ID_TRABAJADOR"));
		objeto.setNombre(rs.getString("NOMBRE"));
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setSalario(rs.getDouble("SALARIO"));
		objeto.setFechaIngreso(rs.getDate("FECHA_INGRESO"));
//		objeto.setIdAlumno(rs.getBigDecimal("ID_ALUMNO"));
//		objeto.setNombre(rs.getString("NOMBRE"));
//		objeto.setSalon(rs.getBigDecimal("SALON"));
		
		return objeto;
	}

}
