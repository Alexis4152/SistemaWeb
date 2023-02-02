package com.mx.mex.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.mex.Dto.Usuario;


public class UsuariosListMapper<T> implements RowMapper<Usuario> {

	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario objeto = new Usuario();
		objeto.setNombre(rs.getString("NOMBRE"));
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setDireccion(rs.getString("DIRECCION"));
		return objeto;
	}


}
