package ejercicio07;

import java.util.Random;
import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		
		//	Utiliza la clase Random para generar y mostrar 
		//	tres valores: un número entero aleatorio entre 
		//	1 y 100, un número real aleatorio y un valor 
		//	booleano aleatorio (true o false).
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos 3 variables para almacenar: numEntero, numReal y valorBooleano aleatorio
		Random rand = new Random(); 
		Integer numEntero = rand.nextInt(1,101);
		double numReal = rand.nextDouble(); 
		boolean valorBooleano = rand.nextBoolean(); 
		
		// Mostramos por pantalla los valores aleatorios generados
		System.out.println("Número entero aleatorio generado: " + numEntero);
		System.out.println("Número real aleatorio generado: " + numReal);
		System.out.println("Valor booleano aleatorio generado: " + valorBooleano);

		// Cerramos scanner 
		reader.close();
	}

}
