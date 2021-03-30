package com.senati.eti1;
import java.util.Scanner;
public class caso11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("-----------------------------------");
		System.out.println("========== Resultados ===========");
		System.out.println("-----------------------------------");
		System.out.println("Número de caracteres: " + nombre.length());
	}
}
