package com.sofka.Taller7;

import java.util.ArrayList;
import java.util.Scanner;

public class controlador {

	
	
	 ArrayList<Parqueadero> lista_parqueadero = new ArrayList<>();

	
	
	 public void crearCliente(String nombre, String telefono, String placa, String marca) {
	        lista_parqueadero.add(new Parqueadero(nombre, telefono, placa, marca));
	    }
	
	
	 public ArrayList<Parqueadero> buscarvehiculo(String placa) {
	        
	        return lista_parqueadero;
	    }
	 
	 
	 
	 public boolean eliminarCliente(int pos) {
	        try {
	            lista_parqueadero.remove(pos);
	        } catch (Exception posicion_no_valida) {
	            return false;
	        }
	        return true;
	    }


	
	
}
	 
	 
	 
	
	