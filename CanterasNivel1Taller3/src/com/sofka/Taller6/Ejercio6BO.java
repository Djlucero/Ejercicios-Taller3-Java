package com.sofka.Taller6;


import java.util.ArrayList;

public class Ejercio6BO {
	

	 ArrayList<Ejercicio6_Ciclos> lista_telefonica = new ArrayList<>();
	 
	 public void crearDirectorio(String nombre, String organizacion, int telefono) {
		 lista_telefonica.add(new Ejercicio6_Ciclos(nombre, organizacion, telefono));
		 
	    }
	 public ArrayList<Ejercicio6_Ciclos> BuscarContacto() {
	        return lista_telefonica;
	    }
	 
	 
	// public ArrayList<Ejercicio6_Ciclos> BuscarContactos(String nombre) {
        // try {
          //  for (int pos = 0; pos < lista_telefonica.size(); pos++) {
              //  if (nombre.equals(lista_telefonica.get(pos).getNombre())) {
              //  	lista_telefonica.get(pos).getNombre();
                //	lista_telefonica.get(pos).getOrganizacion();
                //	lista_telefonica.get(pos).getTelefono();
       //         }
     //       }

    //    } catch (Exception posicion_no_valida) {
   //         return false;
       
   // }
   //     return lista_telefonica;
   // }

	 
	 public boolean eliminarDirectorio(int pos) {
	        try {
	            lista_telefonica.remove(pos);
	        } catch (Exception posicion_no_valida) {
	            return false;
	        }
	        return true;
	    }
	 
	 
}
