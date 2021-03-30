package com.senati.eti_2;

import java.util.Scanner;

public class caso4_4y5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese primer nùmero : ");
		int n1=sc.nextInt();
		System.out.println("Ingrese segundo nùmero : ");
		int n2=sc.nextInt();
		System.out.println("Ingrese tercer nùmero : ");
		int n3=sc.nextInt();
		System.out.println("Ingrese cuarto nùmero : ");
		int n4=sc.nextInt();
		String mensaje="";
		if (n1==n2 && n1==n3 && n1==n4)
			mensaje="Todos son iguales";
		else if (n1<n2 && n1<n3 && n1<n4)
			mensaje="El menor es n1 : "+n1;
		else if (n2<n1 && n2<n3 && n2<n4)
			mensaje="El menor es n2 : "+n2;
		else if (n3<n1 && n3<n2&& n3<n4)
			mensaje="El menor es n3 : "+n3;
		else
			mensaje="El menores n4 : "+n4;
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println(mensaje);
	}

}
