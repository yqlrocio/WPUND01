package ejercicio14;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		
	//	Un videojuego comienza con 100 puntos y 3 vidas. 
	//	Modifica estas variables utilizando los operadores 
	//	+=, -=, ++ y -- para representar esta secuencia: 
	//	gana 50 puntos, pierde 20 puntos, obtiene una vida 
	//	extra y después pierde una vida. Muestra el estado 
	//	final.
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos variables para almacenar los puntos y las vidas
		Integer punto = 100;
		Integer vida = 3; 
		
	
		// Gana 50 puntos
		punto += 50;
		System.out.println("¡HAS GANADO! --> " + punto + " PUNTOS");

		// Pierde 20 puntos
		punto -= 20;
		System.out.println("¡HAS PERDIDO! --> " + punto + " PUNTOS");
		
		// Obtiene una vida extra
		vida++;
		System.out.println("¡HAS GANADO! --> " + vida + " VIDA");

		// Pierde una vida
		vida--;
		System.out.println("¡HAS PERDIDO! --> " + vida + " VIDA");

		 
		
		
		// Cerramos scanner
		reader.close();
	}

}
