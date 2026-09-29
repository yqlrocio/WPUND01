package ejercicio15;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		
	//	Solicita tres números enteros a, b y c. Calcula 
	//	y muestra el resultado de las expresiones a + b * c 
	//	y (a + b) * c. Comprueba que los resultados pueden 
	//	ser distintos y explica mediante un comentario en 
	//	el código el motivo.
		
		// Creamos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos variables para almacenar a, b y c
		Integer a; 
		Integer b; 
		Integer c; 
		Integer resultado1; 
		Integer resultado2; 
		
		// Pedir al usuario por los valores de a, b y c
		System.out.println("Introduce valor de a: ");
		a = reader.nextInt(); 
		System.out.println("Introduce valor de b: ");
		b = reader.nextInt(); 
		System.out.println("Introduce valor de c: ");
		c = reader.nextInt(); 
		
		// Operació 1
		resultado1 = a + b * c; 
		
		// Operació 1
		resultado2 = (a + b) * c; 
		
		// Mostramos por pantala los resultado
		System.out.println("Resultado de a + b * c --> " + resultado1);
		System.out.println("Resultado de (a + b) * c --> " + resultado2);

		// Cerramos scanner
		reader.close();

	}

}
