package ejercicios_parte1;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		
	//	Escribir un programa que pida un número al 
	//	usuario e indique mediante un literal 
	//	booleano (true o false) si el número es par.

		//Creamos un scanner
		Scanner reader = new Scanner (System.in); 
		int numero;
		boolean esPar;
		
		//Pedimos un número al usuario
		System.out.println("Introduce un número");
		numero = reader.nextInt();
		
		//Comprovamos si el número es par
		esPar = numero%2 == 0; 
		
		System.out.print("¿El número es par?"+esPar);
		
		//Cerramos el Scanner
		reader.close();
		
		}
	}
