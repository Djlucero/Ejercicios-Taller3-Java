package com.sofka.Taller6;

public class Ejercicio6_Ciclos {

	String nombre;
	String organizacion;
	int telefono;
	
	
	public Ejercicio6_Ciclos(String nombre2, String organizacion2, int telefono2) {
		this.nombre = nombre;
		this.organizacion=organizacion;
		this.telefono=telefono;
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}