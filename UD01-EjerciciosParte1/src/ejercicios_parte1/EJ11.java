package ejercicios_parte1;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		
	// Realiza un conversor de pesetas a euros. 
	// Para ello, pídele al usuario que te 
	// introduzca el valor en pesetas y, a 
	// posteriori, debes mostrarle el resultado 
	// de la conversión.(1€ = 166 ptas).

		//Creamos un scanner
		Scanner reader = new Scanner (System.in); 
		double numero;
		
		//Pedimos un número al usuario
		System.out.println("Introduce la cantidad de dinero en peseta:");
		numero = reader.nextInt();
		
		//Mostrarle al usuario la cantidad de dinero introducido anteriormente en euro
		System.out.print("La cantidad de dinero introducido a euro es:"+ (numero/166) + "€" );
		
		//Cerramos el Scanner
		reader.close();

			}
	}

