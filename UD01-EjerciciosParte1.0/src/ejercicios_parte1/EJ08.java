package ejercicios_parte1;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		
	// Escribe un programa que pida al usuario su nombre 
	// y su edad y muestre por pantalla un mensaje como 
	// el siguiente: “Hola Juanito, tienes 21 años, 
	// ¡qué mayor eres!”. 
		
		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar el nombre del usuario
		String nombre; 
		
		// Crear variable para almacenar la edad del usuario
		int edad; 
		
		// Pedir al usuario que introduzca el nombre y la edad del usuario 
		System.out.println("Introduzca tu nombre: ");
		nombre = reader.nextLine(); 
		
		System.out.println("Introduzca tu edad: ");
		edad = reader.nextInt(); 
		
		// Mostrar por pantalla un mensaje
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		// Cerrar scanner 
		reader.close();

	}

}
