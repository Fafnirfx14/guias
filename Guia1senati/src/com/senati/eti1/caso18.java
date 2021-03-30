package com.senati.eti1;
import java.util.Scanner;
public class caso18 {

	public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
		
		System.out.print("Ingrese base: ");
		float lado = sc.nextFloat();
		
		System.out.print("Ingrese altura: ");
		float altura = sc.nextFloat();
		
		float area = lado * altura / 2;
		
		System.out.println("\n====== Resultados ======");
		System.out.println("Área del triángulo: " + area);
		
		
		

	}

}