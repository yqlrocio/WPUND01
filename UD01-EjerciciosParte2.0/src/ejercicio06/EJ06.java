package ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		
		//	Simula el lanzamiento de un dado. Genera mediante 
		//	Math.random() un número entero aleatorio comprendido 
		//	entre 1 y 6, ambos incluidos. Recuerda que será 
		//	necesario realizar una conversión de tipo (cast).
		
		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos una variable para almacenar un numero aleatorio entre 1-6
		Random rand = new Random(); 
		Integer numAleatorio = rand.nextInt(1,7);
		
		// Mostrar por pantalla el número aleatorio generado
		System.out.println("Número aleatorio generado: " + numAleatorio);
		
		// Cerrar scanner
		reader.close();
	}
}