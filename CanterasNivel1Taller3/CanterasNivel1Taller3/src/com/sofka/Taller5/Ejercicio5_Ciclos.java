package com.sofka.Taller5;


import java.util.Scanner;



public class Ejercicio5_Ciclos {
	
	
	public static void main(String[] args) {
		
			 Scanner sc = new Scanner(System.in);
			 String resp;

			do {
				System.out.println("Digite su Nombre y Apellido"); 	
			    String nombre = sc.nextLine();
			    System.out.println(nombre+" Bienvenid@ desea continuar si / no"); 
			    resp= sc.nextLine();
			    
			}while(resp.equals("si") || resp.equals("SI"));
			
		}
	
	}

