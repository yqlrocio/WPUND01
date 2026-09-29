package ejercicio13;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {

		//	Pide al usuario una cantidad de dinero con decimales. 
		//	Mediante un cast a int obtén la cantidad de euros 
		//	enteros. A partir de la parte decimal, calcula también 
		//	los céntimos y redondéalos correctamente.

		// Creamos scanner
		Scanner reader = new Scanner(System.in); 
		
		// Creamos variables para almacenar dinero, euro y céntimo
		double dinero; 
		int euro;
		double centimo; 
		
		
		// Pedir al usuario una cantidad de dinero
		System.out.println("Introduce una cantidad de dinero: ");
		dinero = reader.nextDouble(); 
		
		// Hacemos cast del dinero para obtener en euro
		euro = (int) (Math.floor(dinero));
		centimo = (dinero - euro);
		
		// Mostramos por pantalla la solución 
		System.out.println("La cantidad de dinero es --> " + dinero + "€");
		System.out.println("En euro --> " + euro + "€");
		System.out.printf("En céntimos --> %.2f €", centimo);		
		
		// Cerramos scanner
		reader.close();
	}

}
