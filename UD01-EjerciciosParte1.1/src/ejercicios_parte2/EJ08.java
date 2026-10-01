package ejercicios_parte2;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		
	//	La FILA (Federación Internacional de Lanzamiento 
	//	de Algoritmo) realiza una competición donde cada 
	//	participante escribe un algoritmo en un papel y 
	//	lo lanza, ganando quien consiga lanzarlo más lejos. 
	//	La peculiaridad del concurso es que la longitud del 
	//	lanzamiento se mide en metros (con tantos decimales 
	//	como se desee), pero para el ranking solo se tiene 
	//	en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
	//	Realiza un programa que solicite la longitud (en 
	//	metros) de un lanzamiento y muestre la parte entera 
	//	correspondiente en centímetros. Utiliza la 
	//	conversión de tipos.

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar la longitud
		double longitud; 
		
		// Pedir al usuario introducir una longitud
		System.out.println("Introduce una longirud: ");
		longitud = reader.nextDouble(); 
		
		
		// Pasar la longitud de metro a centímretro
		longitud = longitud * 100; 
		
		// Mostrar por pantalla 
		System.out.println("La longitud en centímretros es --> " + Math.floor(longitud));
		
		// Cerramos scanner
		reader.close();
		
	}

}
