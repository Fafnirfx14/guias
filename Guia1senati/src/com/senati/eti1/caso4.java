package com.senati.eti1;
import java.util.Scanner;
public class caso4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float división = (float) n1/n2;
		float mod = n1 % n2;
		
		System.out.println("******* Valores ingresados *******");
		System.out.println("Suma...........: " + suma);
		System.out.println("Resta..........: " + resta);
		System.out.println("Producto.......: " + producto);
		System.out.println("División.......: " + división);
		System.out.println("Resto entero...: " + mod);

	}

}
