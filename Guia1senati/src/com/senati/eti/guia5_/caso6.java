package com.senati.eti.guia5_;
import com.senati.eti.modelo.alumno;
import java.util.Scanner;
import java.io.*;
public class caso6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		FileWriter archivo =null;
		PrintWriter pw=null;
		
		try {
			archivo=new FileWriter("info.txt",true);
			pw=new PrintWriter(archivo);
			System.out.println("REGISTRO DE DATOS ");
			System.out.println("====================");
			System.out.println("Nombre.......... :  ");
			String nom=sc.nextLine();
			System.out.println("Apellido.......... : ");
			String ape=sc.nextLine();
			System.out.println("Género [M-F] : ");
			String gen=sc.nextLine();
			System.out.println("Edad [18-30] : ");
			int ed=sc.nextInt();
			alumno alu=new alumno(nom,ape,gen,ed);
			pw.print("Datos Registrados ");
			pw.print("-------------------------");
			
			pw.println("Nombre y Apellido ....... ; "+alu.NombreCompleto());
			pw.println("Género........................: "+alu.MostrarGenero());
			pw.println("Edad...........................: "+alu.getEdad());
		System.out.println("El archivo fue creado correctamente ");
		}catch(Exception ex1) {
			ex1.printStackTrace();
		}finally {
			try {
				if(archivo!=null)
					archivo.close();
			}catch(Exception ex2) {
				ex2.printStackTrace();
			}
		}

	}

}
