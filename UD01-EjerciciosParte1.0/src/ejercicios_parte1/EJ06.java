package ejercicios_parte1;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		
		// Escribir un programa que le pida dos números al usuario. 
		// A continuación, debe mostrar la suma, la resta, la multiplicación 
		// y la división de ambos números. Debe mostrarse el resultado de 
		// cada operación en una línea distinta.
		
		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable que almacene dos número enteros del usuario
		int num1, num2; 
		
		// Crear una variable para almacenar la suma, la resta, la multiplicación y la division
		int suma, resta, multiplicacion, division; 
		
		// Pedir al usuario que introduzca dos números enteros
		System.out.println("Introduzca número 1: ");
		num1 = reader.nextInt(); 
		
		System.out.println("Introduzca número 2: ");
		num2 = reader.nextInt(); 
		
		// Calcular la suma, la resta, la multiplicación y la división con los dos números introducidos por el usuario
		suma = num1 + num2; 
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2; 
		
		// Mostrar por pantalla los resultados de las operciones 
		System.out.println("La suma es: " + suma );
		
		System.out.println("La resta es: " + resta );
		
		System.out.println("La multiplicación es: " + multiplicacion );
		
		System.out.println("La división es: " + division );
		
		// Cerrar scanner
		reader.close();
	}

}
