package com.senati.eti.guia5_;
import java.io.*;
public class caso5 {

	public static void main(String[] args) {
		File archivo=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			archivo=new File("datos.txt");
			fr =new FileReader(archivo);
			br=new BufferedReader(fr);
			System.out.println(String.format("%-20s %-20s %-20s",		
					"Nombre y Apellido ","Distrito ","Mes"));
			System.out.println(String.format("%-20s %-20s %-20s",	
			"-------------- ","--------- ","---"));
			
			String linea="";
			while ((linea=br.readLine())!=null) {
				//System.out.println(linea);
				String [] contenido=linea.split(";");
				
				for (int x=0;x<contenido.length;x++)
					System.out.print(String.format("%-20s ",
							contenido[x]));
				System.out.println();
			}
		}catch(Exception ex1) {
			ex1.printStackTrace();
		}finally {
			try {
				if(fr!=null)
					fr.close();
			}catch(Exception ex2) {
				ex2.printStackTrace();
			}
		}

	}
public static String Formatear(String cadena) {
	 String [] palabra =cadena.split(" ");
	 String junto =" ";
			 for (int x=0;x<palabra.length;x++) {
				 junto +=palabra[x].substring(0,1).toUpperCase()+
palabra[x].substring(1)+" ";
				 System.out.println();
			 }
			 }catch(Exception ex3) {
	ex3.printStackTrace();

}
}


