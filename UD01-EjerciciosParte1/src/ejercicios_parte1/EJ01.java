package ejercicios_parte1;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		
	// Diseña un programa que pida un número al usuario y a 
	// continuación lo muestre.

		//Creación del scanner
		Scanner reader = new Scanner (System.in);
				
		// Crear variable para almacenar el número del usuario 
		int number;
				
		// Preguntar al usuario que introduzca un número 
		System.out.println("Por favor, introduce un número:");
		        
		// Leer el número introducido por el usuario
		number = reader.nextInt();
		        
		// Imprimir por pantalla el número del usuario 
		System.out.println("Tu número es "+ (number));
		    		
		// Cerrar scanner
		reader.close();

		}

		
	}

