package ejercicios_parte1;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		
		// pedir al usuario su edad
		// indicar si la edad del usuario es mayor de edad
		
		//creación del scanner
		Scanner reader = new Scanner(System.in);
	
		//edad del usuario
		int edad; 
		boolean esMayor;
		
		//pedir al usuario su edad
		System.out.println("Introduza su edad:");
		edad = reader.nextInt();
		
		//Comprovamos si la edad es mayor de 18
		esMayor = edad >= 18; 
		
		System.out.println("¿Eres mayor de edad? " + esMayor);
		
		//Cerramos el Scanner
		reader.close();
		
		
	}

}
	