package com.senati.eti_2;
import java.util.Scanner;
public class caso13_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("N�mero 1 : ");
		int n1=sc.nextInt();
		System.out.println("N�mero 2 : ");
		int n2=sc.nextInt();
		int division=0;
		int suma=n1+n2;
		int resta =n1-n2;
		int producto=n1*n2;
		String mensaje1="",mensaje2="";
		if (n2!=0)
			division=n1/n2;
		else
			mensaje1="No es posible dividir entre cero";
		if (n2!=0)
			division=n1/n2;
		else
			mensaje2="No es posible hallar el resto entero";
		
		int promedio=(n1+n2)/2;
		
		System.out.println("=====================");
		System.out.println("-----------Resultados-------------");
		System.out.println("======================");
		System.out.println("Suma de los n�meros : "+suma );
		System.out.println("Resta de los n�meros : "+resta);
		System.out.println("Producto de los n�meros : "+producto);
		System.out.println("Divsi�n de los n�meros  : "+division);
		System.out.println("Promedio de los n�meros : "+promedio);
		
		
		
		
		
		
		
		
			
		

	}

}
