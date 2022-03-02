package com.sofka.Taller4;

import java.util.Scanner;



public class Ejercicio4_Ciclos {
	
	static int num1;
	static int i;
	
	public static void IngresarNumero() {
	Scanner lector =new Scanner(System.in);
	System.out.println("Digita el nuero de la tabla a multiplicar"); 	
	num1 = lector.nextInt();
	}
	public static void Calculo() {
		for (i=0; i<10; i++) {
			System.out.println(i+"*"+num1+"="+i*num1); 	
				
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		  
		Ejercicio4_Ciclos bo = new Ejercicio4_Ciclos();
		
		bo.IngresarNumero();
		bo.Calculo();
	}
}


