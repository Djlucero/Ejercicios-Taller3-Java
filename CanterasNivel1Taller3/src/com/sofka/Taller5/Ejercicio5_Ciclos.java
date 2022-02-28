package com.sofka.Taller5;

import java.util.Scanner;



public class Ejercicio5_Ciclos {
	
	public static void main( String args[] ) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Digite su Nombre y Apellido"); 	
    	String nombre = lector.nextLine();
    	System.out.println(nombre+" Bienvenid@ desea continuar S/N"); 
    	String opc = lector.next();
        
            while (opc.equals("s") || opc.equals("S")) {
            System.out.print("Terminado: ");
            
        }
        
    }
}
