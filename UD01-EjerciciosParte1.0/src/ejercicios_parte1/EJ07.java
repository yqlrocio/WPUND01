package ejercicios_parte1;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		
		// Escribir un programa que le pida al usuario su nombre, 
		// dirección y teléfono. Guarda cada dato en variables 
		// distintas. 

		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear una variable para almacenar el nombre, la dirección y el teléfono del usuario
		String nombre;
		String direccion; 
		int telefono;
		
		// Pedir al usuario el nombre y mostrarlo por pantalla
		System.out.println("Introduzca tu nombre: ");
		nombre = reader.nextLine(); 
		
		// Pedir al usuario la dirección y mostrarlo por pantalla
		System.out.println("Introduzca tu dirección: ");
		direccion = reader.nextLine(); 
		
		// Pedir al usuario el teléfono y mostrarlo por pantalla
		System.out.println("Introduzca tu teléfono: ");
		telefono = reader.nextInt(); 
		
		// Mostrar los datos
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);
				
		// Cerrar scanner
		reader.close();
	}

}
