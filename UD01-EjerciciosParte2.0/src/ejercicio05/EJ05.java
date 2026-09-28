package ejercicio05;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		
	//	Escribe un programa que solicite un número 
	//	real y muestre su valor absoluto y su raíz 
	//	cuadrada utilizando métodos de la clase Math. 
	//	Prueba el programa con diferentes valores positivos.

		// Creamos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos una variable para almacenar un número real
		double num; 
		
		// Pedir al usuario un número
		System.out.println("Introduce un número: ");
		num = reader.nextDouble(); 
		
		// Mostrar por pantalla el valor absoluto y su raiz cuadrada
		System.out.println("Su valor absoluto es: " + Math.abs(num));
		System.out.println("Su raiz cuadrada es: " + Math.sqrt(num));
		
		// Cerramos scanner
		reader.close();
	}

}
