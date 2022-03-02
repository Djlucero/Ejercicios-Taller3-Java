package com.sofka.Taller7;

public class Parqueadero {

	String nombre;
	String telefono;
	String placa;
	String marca;
	
	public Parqueadero(String nombre, String telefono, String placa, String marca) {
		this.nombre=nombre;
		this.telefono=telefono;
		this.placa=placa;
		this.marca=marca;
		
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
