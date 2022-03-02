package com.sofka.Taller6;

import java.util.Scanner;

public class Principal_Taller6 {

	public static void main(String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		
		Ejercio6BO bo = new Ejercio6BO();
		 while (true) {
	            System.out.println("CONTACTOS TELEFONICOS");
	            System.out.println("Seleccione tarea a realizar:");
	            System.out.println("1.Ingresar Contacto");
	            System.out.println("2.Buscar Contacto");
	            System.out.println("3.Eliminar Contacto");
	            System.out.println("4. Salir");
	            System.out.println("Opción:\n");
	            int opcion = lector.nextInt();

	            
	            if (opcion == 4) {
	                System.out.println("Hasta pronto");
	                break;
		
	            } else if (opcion == 1) {
	                System.out.println("Ingresar Contacto");
	                System.out.println("Digite nombre completo:");
	                lector.nextLine();
	                String nombre = lector.nextLine();
	                System.out.println("Digite nombre organizacion:");
	                String organizacion = lector.nextLine();
	                System.out.println("Digite Numero Telefono:");
	                int telefono = lector.nextInt();
	                System.out.println("Se agregó el contacto\n");
	                bo.crearDirectorio(nombre,organizacion,telefono);
	                
	            } else if (opcion == 2) {  
	                System.out.println("Buscar Contacto\"");
	                System.out.println("Digite nombre completo:\n");
	                lector.nextLine();
	                String buscar = lector.nextLine();
	                for (int post = 0; post < bo.lista_telefonica.size(); post++) {
	                    if (buscar.equals(bo.lista_telefonica.get(post).getNombre())) {
	                        Ejercicio6_Ciclos encontrado = bo.lista_telefonica.get(post);
	                        System.out.println("Nombres: " + encontrado.getNombre());
	                        System.out.println("Organizacion: " + encontrado.getOrganizacion());
	                        System.out.println("Telefono: " + encontrado.getTelefono());
	                        
	                    }
	                }
	                
	            } else if (opcion == 3) {
	                System.out.println("Eliminar contacto");
	                System.out.println("\"Digite nombre completo del contacto a eliminar:\n");
	                lector.nextLine();
	                String eliminar = lector.nextLine();
	                for (int pos = 0; pos < bo.lista_telefonica.size(); pos++) {
	                    String elimina = bo.lista_telefonica.get(pos).getNombre();
	                    if (eliminar.equals(elimina)) {
	                        bo.eliminarDirectorio(pos);
	                        System.out.println("el contacto ha sido eliminado con exito\n");
	                    } else {
							System.out.println("el contacto no se encuentra registrado\n");
	                    	}
	                    }

	                }
	                
	            }
	        }
	}

	


