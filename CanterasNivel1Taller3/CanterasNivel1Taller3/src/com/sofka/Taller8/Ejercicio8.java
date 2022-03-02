package com.sofka.Taller8;

import java.util.Scanner;

import com.sofka.Taller6.Ejercicio6_Ciclos;

public class Ejercicio8 {

	
	public void Ejercicio8() {
		
		
		leerMenu();
		
		
	}
		
	
	
	public static void leerMenu() {
		
		Scanner leer= new Scanner (System.in);
		Alumno a[] = new Alumno[2];
		
		String nombre =" ";
		String prueba=" ";
		int puntaje= 0;
		String resp = null;
		
		
		while (true) {	
			System.out.println("*** ESCUELA AUTOMOVILISTICA EL MAESTRO ***");
            System.out.println("Seleccione tarea a realizar:");
            System.out.println("1.Registro de Usuarios al curso");
            System.out.println("2.Consultar Usuarios y Resultados");
            System.out.println("3. Salir");
            System.out.println("Opción:\n");
            int opcion = leer.nextInt();
	
         
         if (opcion == 3) {
             System.out.println("Hasta pronto");
             break;
	
         } else if (opcion == 1) {
        	   	 for (int i=0; i<a.length; i++) {
        		 System.out.println("Digite nombre y apellido del alumno ");
                 nombre=leer.next();
                 System.out.println("Digite (presento) o (pendiente) para la prueba");
                 prueba=leer.next();
                 System.out.println("digite puntaje obtenido en la prueba de (1 a 5)");
                 puntaje=leer.nextInt();
                 a[i]=new Alumno(nombre,prueba,puntaje);
                
                 
        	 }
         

        	 }  else if (opcion == 2) {  
	                System.out.println("Buscar Contacto\"");
	                System.out.println("Digite nombre y apellido del alumno:\n");
	                leer.nextLine();
	                String buscar = leer.nextLine();
	                for (int i=0; i<a.length; i++) {
	                if	(buscar.equals(a[i].getNombre())) {
	                	Alumno encontrado=a[i];
	                        System.out.println("Nombres: " + encontrado.getNombre());
	                        System.out.println("prueba: " + encontrado.getPrueba());
	                        System.out.println("puntaje: " + encontrado.getPuntaje());
	                       
	                        if(puntaje>3) {
	                        	System.out.println(" Felilcitaciones Aprobo");
	                        	
	                        }else
	                        	
	                        { System.out.println("Lo sentimos usted No aprobo\n");
	                        	System.out.println("debe presentar la prueba nuevamente\n");
	                        
	                        break;
	                   
	                        
	                } 
	                    
	                    }
	                }
	
        	 }
		}
		}



	
	
	}

			
	
	
	
	
	
         
		
	
	

