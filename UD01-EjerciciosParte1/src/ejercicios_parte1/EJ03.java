package ejercicios_parte1;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
	// Escribir una aplicación que pida el año actual y el año 
	// de nacimiento del usuario. Debe calcular su edad.

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar el año actual 
		int anoActual; 
		
		// Crear variable  para almacenar el año de nacimiento
		int anoNacimiento; 
		
		// Pedir al usuario que introduzca el año en el que se encuentra
		System.out.println("¿En que año estás?");
		anoActual = reader.nextInt(); 
		
		// Pedir al usuario que introduzca su año de nacimiento
		System.out.println("¿En que año naciste?");
		anoNacimiento = reader.nextInt(); 
		
		// Mostrar por pantalla la edad del usuario
		System.out.println("Tienes " + (anoActual - anoNacimiento) + " años");
		
		// Cerrar scanner
		reader.close();
	}

}
