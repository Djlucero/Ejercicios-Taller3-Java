package com.sofka.Taller2;

public class Ejercicio2_Ciclos {
	
	 public static void main(String[] args) {
		 
    int n=10;
    int f=0, a=0, e=0;

    for(f=1;f<=10;f++)
    {
      for(e=0;e<n;e++)
        {
            System.out.print(" ");
        }
      
      n=n-1;
      for(a=0; a<f; a++) {
    	  System.out.print("*");
      }
        System.out.println();
    }
}
}
