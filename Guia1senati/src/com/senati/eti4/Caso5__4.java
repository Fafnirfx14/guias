package com.senati.eti4;
import java.util.Scanner;
public class Caso5__4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		String[] arrCodigo= {"A-123","A-456","A-789","A-777"};
		String []arrNombre= {"Favio ","Teresa","Anthony","Raùl"};
		int [] arrNota={17,15,12,8};
		
		System.out.println("BUSQUEDA DE DATOS");
		System.out.println("-----------------------------------");
		System.out.print("Código a buscar : ");
		String codigo=sc.nextLine();//A-789
		
		//posicion=2
		
		int pos=-1;
		for (int x=0;x<=arrCodigo.length-1;x++) {
			if (codigo.equals(arrCodigo[x])) {
				pos =x;
				break;
			}
				
			}
		
		if (pos==-1) {
			System.out.println("-----------------------");
			System.out.println("EL CÓDIGO NO EXISTE");
			System.out.println("-----------------------");
		}
		else {
				System.out.println("-----------------------");
				System.out.println("CÓDIGO ENCONTRADO");
				System.out.println("-----------------------");
				System.out.println("Código........... : "+arrCodigo[pos]);
				System.out.println("Nombre.......... : "+arrNombre[pos]);
				System.out.println("Nota................ : "+arrNota[pos]);
		}
		

	}

}
