package com.sofka.Taller6;


import java.util.ArrayList;
public class Ejercio6BO {
	
	

	 ArrayList<Ejercicio6_Ciclos> lista_telefonica= new ArrayList<>(3);
	 
	 public void crearDirectorio(String nombre, String organizacion, int telefono) {
		  lista_telefonica.add(new Ejercicio6_Ciclos(nombre, organizacion, telefono));
		
		
		 }
		 
	    
	 public ArrayList<Ejercicio6_Ciclos> BuscarContacto(String nombre) {
	        return lista_telefonica;
	    }
	
	 
		 
	 public boolean eliminarDirectorio(int pos) {
	        try {
	            lista_telefonica.remove(pos);
	        } catch (Exception posicion_no_valida) {
	            return false;
	        }
	        return true;
	    }
	 
	 
}
