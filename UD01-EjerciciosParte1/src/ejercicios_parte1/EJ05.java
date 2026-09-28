package ejercicios_parte1;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		
	// Diseñar una aplicación que calcule la longitud y 
	// el área de una circunferencia. Para ello, el usuario 
	// debe introducir el radio, que puede contener decimales. 
	// Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)

	
		// Crear scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear una variable para almacenar el radio
		double radio; 
		
		// Crear una variable para almacenar la longitud
		double longitud;
		
		// Crear una variable para almacenar el área
		double area;
		
		// Mostrar por pantalla la longitud de una circunsferencia
		System.out.println("Introducir el radio de la circunsferencia: ");
		radio = reader.nextDouble(); 
		
		// Calcular la longitud
		longitud = 2 * Math.PI * radio;
		
		// Calcular el área
		area = Math.PI * radio * radio; 
		
		// Mostrar por pantalla la longitud de una circunsferencia
		System.out.println("La longitud de la circunsferencia es: " + longitud);
		
		// Mostrar por pantalla el área de una circunsferencia 
		System.out.println("El área de la circunsferencia es: " + area);
		
		// Cerrar scanner
		reader.close();
		
	}

}
