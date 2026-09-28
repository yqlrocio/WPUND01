package ejercicio04;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		
		// Pide al usuario un número real y muestra: 
		// el entero inmediatamente inferior mediante 
		// Math.floor(), el entero inmediatamente 
		// superior mediante Math.ceil() y el entero 
		// más cercano mediante Math.round().

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos variable para almacenar el número real, número redondeado hacia arriba y el hacia abajo 
		double num; 
		
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: ");
		num = reader.nextDouble(); 
		
		// Mostrar por pantalla el entero inferior y el entero superior
		System.out.println("Entero inferior: " +  Math.floor(num));
		System.out.println("Entero inmediatamente superior: " + Math.ceil(num));
		System.out.println("Entero más cercano: " + Math.round(num));
		
		// Cerramos scanner
		reader.close();
	}

}
