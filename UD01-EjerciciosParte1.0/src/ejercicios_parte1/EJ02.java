package ejercicios_parte1;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		
	// Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.

		// Creación del scanner
		Scanner reader = new Scanner (System.in);
		
		// Crear variable para almacenar la edad
		int edad; 
		
		// Pedir al usuario su edad
		System.out.println("¿Cúantos años tienes?");

		// Leer la edad del usuario
		edad = reader.nextInt(); 
		
		// Mostrar por pantalla la edad que tendría el usuario el próximo año
		System.out.println("El año que viene tendrías: " + (edad + 1));
		
		// Cerrar scanner
		reader.close();
		
	}

}
