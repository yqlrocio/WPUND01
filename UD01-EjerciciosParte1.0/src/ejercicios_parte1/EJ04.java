package ejercicios_parte1;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		
	// Crear una aplicación que calcule la media aritmética 
	// de dos notas enteras. Hay que tener en cuenta que la 
	// nota media puede tener decimales.

		// Crear scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar dos notas
		double nota1, nota2; 
		
		// Pedir al usuario que introduzca dos notas
		System.out.println("Introduzca nota 1: ");
		nota1 = reader.nextDouble(); 
		
		System.out.println("Introduzca nota 2: ");
		nota2 = reader.nextDouble(); 
		
		// Mostrar por pantalla la media de las notas
		System.out.println("La nota media es: " + ((nota1 + nota2)/2));
		
		// Cerrar scanner
		reader.close();
		
	}

}
