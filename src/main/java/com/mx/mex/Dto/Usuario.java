package com.mx.mex.Dto;


//SIRVE PARA TRANSFERIR, MANIPULAR O ADMINISTRAR DATOS
//ES UNA CLASE QUE CONTIENE ATRIBUTOS
//VARIABLES
//METODOS
public class Usuario {

	
	private String nombre;
	private int edad;
	private String direccion;
	private String calle;
	private String codigoPostal;

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
}
