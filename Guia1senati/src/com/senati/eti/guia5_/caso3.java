package com.senati.eti.guia5_;
import java.util.ArrayList;
import java.util.Scanner;
import com.senati.eti.modelo.alumno;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		//Generar el conjunto de datos de tipo de alumno
		
		ArrayList <alumno> arralumno=new ArrayList<alumno>();
		//Forma 1 : Crear objeto de tipo alumno
		alumno alum1=new alumno();
		
		alum1.setNombre("Favio");
		alum1.setApellido("Pucho");
		alum1.setGenero("M");
		alum1.setEdad(18);
		//Forma 2 : Crear objeto de tipo alumno 
		alumno alum2=new alumno("Rosa","Flores","F",15);
		//Forma 3 : Crear el objeto de tipo alumno
		alumno alum3=null;
		String nom="",ape="",gen="";
		int ed=0;
		System.out.println("REGISTRO DE DATOS ");
		System.out.println("====================");
		System.out.println("Nombre.......... :  ");
		nom=sc.nextLine();
		System.out.println("Apellido.......... : ");
		ape=sc.nextLine();
		System.out.println("Género [M-F] : ");
		gen=sc.nextLine();
		System.out.println("Edad [18-30] : ");
		ed=sc.nextInt();
		
		alum3=new alumno(nom ,ape,gen,ed);
		arralumno.add(alum1);
		arralumno.add(alum2);
		arralumno.add(alum3);
		System.out.println("\n LISTA DE DATOS REGISTRADOS ");
		System.out.println("========================================");
        
		String patron="%-4s %-20s %-10s %-15s";
		
		System.out.println(String.format(patron, "N", "Nombres y Apellidos     "
	,"Género","Estado "));
		
		System.out.println(String.format(patron, "-","----------------------","---------","----------"));
		
		for (int x=0;x<arralumno.size();x++)
			System.out.println(String.format(patron, (x+1),
					arralumno.get(x).NombreCompleto(),
					arralumno.get(x).getGenero(),
					arralumno.get(x).MostrarEstado()));
	
	}
}
