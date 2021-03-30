package com.senati.eti.guia5_;

import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.modelo.Publicacion;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
		
		// Forma 2: Crear el objeto de tipo Publicacion (Tipado con la clase Publicación)
		
		Publicacion publi1 = new Publicacion("Los perros Hambrientos", "Ciro Alegría", "1");
		Publicacion publi2 = new Publicacion("Tradiciones peruanas", "Ricardo Palma", "1");
		Publicacion publi3 = new Publicacion("Informatica Global", "Bill Gates", "2");
		Publicacion publi4 = new Publicacion("Los Heraldos Negros", "César Vallejo", "1");
		Publicacion publi5 = new Publicacion("Rev. Dig. Merca2.0", "Mark Zuckerberg", "2");
		
		
		arrPublicacion.add(publi1);
		arrPublicacion.add(publi2);
		arrPublicacion.add(publi3);
		arrPublicacion.add(publi4);
		arrPublicacion.add(publi5);
		
		System.out.println("\n LISTA DE DATOS REGISTRADOS");
		System.out.println("=========================================================");
		String patron = "%-4s %-25s %-18s %-18s";
		
		System.out.println(String.format(patron, "N.", "Título", "Autor", "tipo"));
		System.out.println(String.format(patron, "==", "------", "------", "------"));
		
		for (int x = 0; x < arrPublicacion.size();x++)
			System.out.println(String.format(patron, (x + 1), 
					arrPublicacion.get(x).getTitulo(),
					arrPublicacion.get(x).getAutor(),
					arrPublicacion.get(x).MostrarTipo()));
	

	}

}
