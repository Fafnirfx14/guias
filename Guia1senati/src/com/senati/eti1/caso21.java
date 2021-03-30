package com.senati.eti1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresos: ");
		float ingresos = sc.nextFloat();
		
		System.out.print("Ganancia Neta: ");
		float gananciaNeta = sc.nextFloat();
		
		float gasto = (float) ((ingresos - gananciaNeta) * 0.88);
		
		System.out.println("\n=============== Resultados ===============");
		System.out.println("Gasto.....................: " +"S/. " + df.format(gasto));

	}

}

