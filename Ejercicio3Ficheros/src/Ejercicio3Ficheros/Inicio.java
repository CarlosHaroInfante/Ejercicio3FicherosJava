package Ejercicio3Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = "C:\\Users\\Carlos\\Desktop\\ED\\Ejercicio3Ficheros\\src\\Ejercicio3Ficheros\\prueba.csv";
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Nombre del usuario");
			 String nombreCompleto = sc.nextLine();
			 
			 System.out.println("Teléfono del usuario");
			 String telefono = sc.nextLine();
			 
			 System.out.println("correo");
			 String correo = sc.next();
			 
			String cliente = String.format("%s,%s,%s\n", nombreCompleto, telefono, correo);
		try {
			 FileWriter escribe = new FileWriter(ruta, true);
			 
			 escribe.write(cliente);
			 
			 escribe.close();
			 
			 
			System.out.println("Se ha escrito correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al escribir " + e.getMessage());
		}
	}

}
