package com.senati.eti1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Precio de Costo....: ");
		float costo = sc.nextFloat();
		
		System.out.print("Ganancia deseada...: ");
		float ganancia = sc.nextFloat();
		
		float p_venta = (float)((float)(costo + ganancia) * 1.42);
		
		System.out.println("\n=============== Resultados ===============");
		System.out.println("Precio de venta................: " + "S/. " + df.format(p_venta)) ;
	

	}

}
