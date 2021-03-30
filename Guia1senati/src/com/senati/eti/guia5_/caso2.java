package com.senati.eti.guia5_;
import java.util.Scanner;
import com.senati.eti.modelo.calculadora2;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Número 1 :  ");
		float n1=sc.nextFloat();
		System.out.println("Número 2 : ");
		float n2=sc.nextFloat();
		
		calculadora2 calc=new calculadora2(n1,n2);
		
		System.out.println("\n ** NÚMEROS INGRESADOS ** ");
		System.out.println("-------------------------------------------------");
		System.out.println("Primer número  : "+calc.getNumero1());
		System.out.println("Segundo Número...................... : "+calc.getNumero2());
		
		
		
		System.out.println("\n **  RESULTADOS  **   ");
		System.out.println("------------------------");
		
	System.out.println("1.Suma.................................... : "+calc.Operar(1));
	System.out.println("2.Resta..................................... : "+calc.Operar(2));
	System.out.println("3.Producto................................ : "+calc.Operar(3));
	System.out.println("4.División................................ : "+calc.Operar(4));
	System.out.println("5.Resto Entero........................ : "+calc.Operar(5));
	System.out.println("6.Promedio........................ : "+calc.Operar(6));
	System.out.println("7.Suma de cuadrados ........................ : "+calc.Operar(7));
	System.out.println("8.Suma de cuadrados ........................ : "+calc.Operar(8));
	System.out.println("9.Mayor numero ........................ : "+calc.Operar(9));
	System.out.println("10.Menor número........................ : "+calc.Operar(10));
	System.out.println("11.Diferencia porcentual .........................: "+calc.Operar(11));
	

	}

}
