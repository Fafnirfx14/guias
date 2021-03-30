package com.senati.eti1;
import java.util.Scanner;
public class caso13 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("---------------------------------");
		System.out.println("=========== Registro= ===========");
		System.out.println("---------------------------------");
		System.out.println("Alumno: " + nombre + " " + apellido);	

	}

}
