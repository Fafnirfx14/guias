package com.senati.eti.guia5_;
import com.senati.eti.modelo.calculadora1;
import java.util.Scanner;
public class Caso1__5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		calculadora1 calc=new calculadora1(5,3);
		
		float n1=0 ,n2=0;
		System.out.println("N�mero 1 : ");
		n1=sc.nextFloat();
		System.out.println("N�mero 2  : ");
		n2=sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\n  **   N�meros Ingresados   **  ");
		System.out.println("--------------------------------------------");
		System.out.println("Primer N�mero...................... : "+calc.getNumero1());
		System.out.println("Segundo N�mero...................... : "+calc.getNumero2());
		
		
		
		System.out.println("\n **  RESULTADOS  **   ");
		System.out.println("------------------------");
		
	System.out.println("1.Suma.................................... : "+calc.Suma());
	System.out.println("2.Resta..................................... : "+calc.Resta());
	System.out.println("3.Producto................................ : "+calc.Producto());
	System.out.println("4.Divisi�n................................ : "+calc.Divisi�n());
	System.out.println("5.Resto Entero........................ : "+calc.RestoEntero());
	
	
		

	}

}
