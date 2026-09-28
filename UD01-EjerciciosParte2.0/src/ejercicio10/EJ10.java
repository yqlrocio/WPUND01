package ejercicio10;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		
		// Solicita al usuario un mes (1-12) y un año. 
		// Calcula mediante una expresión booleana si 
		// el año es bisiesto. Muestra el resultado 
		// como true o false.
		
		/*
		 * Un año es bisiesto si es divisible por 400 o
		 * por 4 y no por 100
		 */
		
		// Creación scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear una variable para almacenar el año
		Integer year; 
		
		// Pedir al usuario un año para comprobar si es bisiestro
		System.out.println("Introduce un año: ");
		year = reader.nextInt(); 
		
		// Calcular si el año introducido es bisiesto
		if (year % 400 == 0) {
			System.out.println("El año " + year + " es bisiesto");
		} else if (year%4 == 0 && year%100 != 0) {
			System.out.println("El año " + year + " es bisiesto");
		} else {
			System.out.println("El año " + year + " no es bisiesto");
		}
		
		// Cerrar scanner
		reader.close();

	}

}
