package com.mx.mex.RepositoryImplement;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.Alumnos;
import com.mx.mex.Mapper.AlumnosMapper;
import com.mx.mex.Repository.IAlumnosRepository;

@Repository
public class AlumnosRepositoryImpl implements IAlumnosRepository{

	@Autowired
	DataSource dataSource; // CONTIENE LA CONEXION A LA BD
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); // NOS PERMITE EJECUTAR LAS CONSULTAS DE LA BD
	
	
	@Override
	public List<Alumnos> getAlumno() {
	   jdbcTemplate.setDataSource(getDataSource()); // SE ASIGNA LA CONEXION A NUESTRO OBJETO JDBCTEMPLATE
		return jdbcTemplate.query("SELECT * FROM ALUMNOS", new AlumnosMapper<Alumnos>());
	}

	@Override
	public Integer insertAlumno(Alumnos nuevoAlumno) {
		jdbcTemplate.setDataSource(getDataSource()); // SE ASIGNA LA CONEXION A NUESTRO OBJETO JDBCTEMPLATE
		return jdbcTemplate.update("INSERT INTO ALUMNOS (NOMBRE,SALON) VALUES (?,?)"
				,nuevoAlumno.getNombre(),nuevoAlumno.getSalon());
	}
	
	@Override
	public Integer deleteAlumno(Alumnos nuevoAlumno) {
		jdbcTemplate.setDataSource(getDataSource()); // SE ASIGNA LA CONEXION A NUESTRO OBJETO JDBCTEMPLATE
		return jdbcTemplate.update("DELETE FROM ALUMNOS WHERE ID_ALUMNO = ?",nuevoAlumno.getIdAlumno());
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
