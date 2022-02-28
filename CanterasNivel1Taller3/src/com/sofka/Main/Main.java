package com.sofka.Main;

import java.io.IOException;
import java.util.Scanner;

import com.sofka.Taller1.Ejercicio1_Ciclos;
import com.sofka.Taller2.Ejercicio2_Ciclos;
import com.sofka.Taller3.Ejercicio3_Ciclos;
import com.sofka.Taller4.Ejercicio4_Ciclos;




public class Main {


		private static boolean bandera = true;
	    private static int opcion;

	    public static void main(String[] args) throws IOException {
	        do {
	            limpiarPantalla();
	            menu();
	            opcion = capturarOpcion();
	            bandera = evaluarOpcion(opcion);
	        } while (bandera == true);
	    }

			    private static void menu() {
			    	System.out.println("------------------------------------------------");
			        System.out.println("TALLER N.3 CICLOS");
			        System.out.println("Escoja un punto del taller");
			        System.out.println("1. Ejercicio N.1");
			        System.out.println("2. Ejercicio N.2");
			        System.out.println("3. Ejercicio N.3");
			        System.out.println("4. Ejercicio N.4");
			        System.out.println("5. Ejercicio N.5");
			        System.out.println("6. Ejercicio N.6");
			        System.out.println("7. Ejercicio N.7");
			        System.out.println("8. Ejercicio N.8");
			        System.out.println("9. Salir");
			        System.out.println("------------------------------------------------");
			    }

			    private static int capturarOpcion() {
			        Scanner input = new Scanner(System.in);
			        return input.nextInt();
			    }
			    
			    private static boolean evaluarOpcion(int opcion) throws IOException {
			        switch (opcion) {

					case 1:
						Ejercicio1_Ciclos p1 = new Ejercicio1_Ciclos();
					    p1.main(null);
					    return true;
					    
					case 2:
						Ejercicio2_Ciclos p2 = new Ejercicio2_Ciclos();
					    p2.main(null);
					    return true;
					case 3:
						Ejercicio3_Ciclos p3 = new Ejercicio3_Ciclos();
					    p3.main(null);
					    
					case 4:
						Ejercicio4_Ciclos p4 = new Ejercicio4_Ciclos();
					    p4.main(null);
					    
					case 5:
						
									    
					case 6:
						
						
					case 7:
						
						
					case 8:
						
			
							                
			                
			            case 9:
			                return false;
			                // break;
			            default:
			                System.out.println("Opción incorrecta");
			                System.in.read();
			                
			        }
			        return true;
			    }

			    private static void limpiarPantalla() {
			    		System.out.println();
			    		}
			    

	}
