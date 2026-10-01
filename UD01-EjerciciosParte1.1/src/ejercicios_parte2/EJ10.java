package ejercicios_parte2;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		
	//	(Acepta el reto) El cinquecento es un periodo del arte 
	//	europeo (principalmente italiano) enclavado en pleno 
	//	Renacimiento. Aunque su nombre esconde el número cinco, 
	//	en realidad ¡pertenece al siglo XVI! Cinquecento es, 
	//	abreviadamente, "años [mil] quinientos", en italiano, y 
	//	es que el siglo XVI comprendió los años desde el 1501 al 
	//	1600, igual que el siglo XXI empezó en el 2001, con un 20 
	//	en sus dos primeros dígitos y no un 21.
	//	Dado un año, ¿de qué siglo es?

		// Crear scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variable para almacenar año
		Integer year; 
		Integer siglo; 
		
		// Pedir al usuario por un año 
		System.out.println("Introduce un año:");
		year = reader.nextInt(); 
		
		// Calcular el siglo
		siglo = (year - 1) / 100 + 1; 
		
		// Mostrar por pantalla el siglo
        System.out.println("El año introducido pertenece al siglo --> " + siglo);

		// Cerrar scanner
		reader.close();
	}

}
