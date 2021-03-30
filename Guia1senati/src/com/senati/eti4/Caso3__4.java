package com.senati.eti4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Caso3__4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Integer[ ]numeros=new Integer[5];
		for (int x=0;x<=numeros.length-1;x++) {
			System.out.println("Ingrese número "+(x+1)+ " : ");
			numeros[x]=sc.nextInt();
			
		}
		
		//Ordenar de forma Ascendente 
		
		Arrays.sort(numeros);
		
		System.out.println("NÚMEROS ORDENADOS DE FORMA ASCENDENTE ");
		System.out.println("----------------------------------------------------");
		for (int x=0; x<numeros.length;x++)
			System.out.println("Número "+(x+1)+ ": "+numeros[x]);
//Ordenar de forma descendente 
		Arrays.sort(numeros,Collections.reverseOrder());
		
		System.out.println("NÚMEROS ORDENADOS DE FORMA DESCENDENTE ");
		System.out.println("----------------------------------------------------");
		for (int x=0; x<numeros.length;x++)
			System.out.println("Número "+(x+1)+ ": "+numeros[x]);

	}

}
