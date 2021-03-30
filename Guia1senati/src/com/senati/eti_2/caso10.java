package com.senati.eti_2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del empleado.............: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas trabajdas.................: ");
		float ht = sc.nextFloat();
		
		System.out.print("Tarifa por horas................: ");
		float th = sc.nextFloat();
		
		System.out.print("Número de minutos de tardanza...: ");
		float min = sc.nextFloat();
		
		float importe = ht * th;
		float bono = 0;
		float descuento = 0; 
		
		if (ht > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		if (min > 15)
			descuento = importe * 0.03f;
		else
			descuento = 0;
		
        float alcanzado = (ht * 100) / 70;
        
        System.out.println("\n======== Resultados ========");
        System.out.println("Trabajador..........: " + nombre);
        System.out.println("Horas trabajadas....: " + df.format(ht));
        System.out.println("Tarifa por horas....: " + df.format(th));
        System.out.println("Importe.............: " + df.format(importe));
        System.out.println("Bono................: " + df.format(bono));
        System.out.println("Descuento...........: " + df.format(descuento));
        System.out.println("Meta alcanzada......: " + df.format(alcanzado) + "%");
	}

}
