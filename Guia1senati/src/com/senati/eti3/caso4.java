package com.senati.eti3;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =0 , i=1 , num_mayor =0;
		while (i<=4) {
			System.out.println("Ingrese número "+i+": ");
			n=sc.nextInt();
			
			if (n>num_mayor) num_mayor=n;
			i++;
			
		}
	System.out.println("\n============Resultados============");
	System.out.println("El número mayor es : "+num_mayor);

	}

}
