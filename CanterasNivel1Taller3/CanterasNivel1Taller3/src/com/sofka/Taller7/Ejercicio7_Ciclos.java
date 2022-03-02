package com.sofka.Taller7;

import java.util.Scanner;

public class Ejercicio7_Ciclos {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		 controlador bo = new controlador();
		 
		 while (true) {
			 
			 	System.out.println("-----------------------------------------");
	            System.out.println("PARQUEADERO EL GUARDIAN");
	            System.out.println("Seleccione tarea a realizar:");
	            System.out.println("1. Ingreso de Vehiculos");
	            System.out.println("2. Salida de Vehiculos");
	            System.out.println("3. Consultar");
	            System.out.println("4. Salir");
	            System.out.println("Opción:\n");
	            System.out.println("-----------------------------------------");
	            int opcion = lector.nextInt();
	            
	            
	            if (opcion == 4) {
	                System.out.println("Hasta pronto");
	                break;
	                
	                
	            } else if (opcion == 1) {
	                System.out.println("**** Ingreso de Vehiculo ****");
	                System.out.println("Digite nombre y apellido de usuario");
	                lector.nextLine();
	                String nombre = lector.nextLine();
	                System.out.println("Digite numero de telefono:");
	                String telefono = lector.nextLine();
	                System.out.println("Digite placa del vehiculo:");
	                String placa = lector.nextLine();
	                System.out.println("Digite Marca del Vehiculo:");
	                String marca = lector.nextLine();
	                System.out.println("Se agregó el vehiculo\n");
	                bo.crearCliente(nombre, telefono, placa, marca);
	     
				} else if (opcion == 2) {
					System.out.println("*** Salida de Vehiculos ***");
					System.out.println("Digite numero de Placa del vehiculo:\n");
					lector.nextLine();
					String eliminar = lector.nextLine();
					for (int pos = 0; pos < bo.lista_parqueadero.size(); pos++) {
						String elimina = bo.lista_parqueadero.get(pos).getPlaca();
						if (eliminar.equals(elimina)) {
							bo.eliminarCliente(pos);
							System.out.println("el vehiculo ha salido con exito\n");
					
						} else {
							System.out.println("el vehiculo no se encuentra en el estacionamiento\n");
             }

         }
		 
				 } else if (opcion == 3) {
		                System.out.println("*** Consultar Vehiculos ***");
		                System.out.println("Digite numero de Placa del vehiculo:\n");
		                lector.nextLine();
		                String buscar = lector.nextLine();
		                for (int pos = 0; pos < bo.lista_parqueadero.size(); pos++) {
		                    if (buscar.equals(bo.lista_parqueadero.get(pos).getPlaca())) {
		                        Parqueadero encontrado = bo.lista_parqueadero.get(pos);
		                        System.out.println("Información del vehiculo\n");
		                        System.out.println("Nombre: " + encontrado.getNombre());
		                        System.out.println("Telefono: " + encontrado.getTelefono());
		                        System.out.println("Placa: " + encontrado.getPlaca());
		                        System.out.println("Marca: " + encontrado.getMarca());
		                 		 
				 	}

		 		}
			
	                 
		 }

		 }

		}
	}



