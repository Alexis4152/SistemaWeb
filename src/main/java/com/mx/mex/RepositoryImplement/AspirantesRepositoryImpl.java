package com.mx.mex.RepositoryImplement;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.Aspirantes;
import com.mx.mex.Mapper.AspirantesListMapper;
import com.mx.mex.Mapper.AspirantesObjectMapper;
import com.mx.mex.Repository.IAspirantesRepository;

@Repository
public class AspirantesRepositoryImpl implements IAspirantesRepository {

	@Autowired
	DataSource dataSource;

	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	@Override
	public List<Aspirantes> getAspirantes() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT A.*,C.NOMBRE_MATERIA AS NOMBRE_MATERIA\r\n" + 
				",M.NOMBRE AS NOMBRE\r\n" + 
				"FROM ASPIRANTES A\r\n" + 
				"INNER JOIN CURSO C \r\n" + 
				"ON A.CURSO=C.ID_CURSO\r\n" + 
				"INNER JOIN MAESTROS M \r\n" + 
				"ON A.MAESTRO=M.ID_MAESTRO", new AspirantesListMapper<Aspirantes>());
	}
	
	@Override
	public Integer insertAspirantes(Aspirantes nuevoAspirante) {
		jdbcTemplate.setDataSource(getDataSource());
		return 
	jdbcTemplate.update("INSERT INTO ASPIRANTES (NOMBRE_ALUMNO,EDAD,FECHA_INSCRIPCION,CURSO,MAESTRO) "
				+ "VALUES (?,?,?,?,?)",nuevoAspirante.getNombreAlumno(),nuevoAspirante.getEdad(),
				nuevoAspirante.getFechaInscripcion(),Integer.parseInt(nuevoAspirante.getCurso()),Integer.parseInt(nuevoAspirante.getMaestro()));
	}
	
	@Override
	public Integer updateAspirantes(Aspirantes aspirante) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE ASPIRANTES SET NOMBRE_ALUMNO = ?, EDAD = ?, FECHA_INSCRIPCION = ?, CURSO = ?, MAESTRO = ? WHERE ID_ALUMNO = ?"
				,new Object[] {aspirante.getNombreAlumno(),aspirante.getEdad(),aspirante.getCursoId(),
						aspirante.getMaestroId(),aspirante.getIdAlumno()});
	}

	@Override
	public Integer deleteAspirantes(Aspirantes aspirante) {
		
		
		jdbcTemplate.setDataSource(getDataSource()); // SE ASIGNA LA CONEXION A NUESTRO OBJETO JDBCTEMPLATE
		return jdbcTemplate.update("DELETE FROM ASPIRANTES WHERE ID_ALUMNO = ?",aspirante.getIdAlumno());

	}
	@Override
	public Aspirantes getAspiranteById(Aspirantes aspirante) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(
				"SELECT * FROM ASPIRANTES WHERE ID_ALUMNO=?"
				, new Object[] {aspirante.getIdAlumno()}
		,new AspirantesObjectMapper<Aspirantes>()
		);
		
	}

	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}










	
	

}
