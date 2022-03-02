package com.sofka.Taller8;

import com.sofka.Taller6.Ejercicio6_Ciclos;

public class Alumno {

	
	private String nombre;
	private String prueba;
	private int puntaje;
	
	public Alumno() {
		nombre = " ";
		prueba = " ";
		puntaje = 0;
	}

	public Alumno(String nombre, String prueba, int puntaje) {
		this.nombre = nombre;
		this.prueba=prueba;
		this.puntaje=puntaje;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	

	
}
