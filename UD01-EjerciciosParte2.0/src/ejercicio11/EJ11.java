package ejercicio11;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		
		//	Diseña un programa que determine si una persona puede 
		//	alquilar un vehículo. Solicita su edad y dos valores 
		//	booleanos que indiquen si posee permiso de conducir y 
		//	si tiene una sanción que le impida conducir. Podrá 
		//	alquilarlo si es mayor de edad, tiene permiso y no 
		//	tiene dicha sanción. Muestra únicamente el resultado 
		//	booleano.

		// Creamos scanner
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar: edad, 2 valores booleanos (carnet de conducir y sanción)
		Integer edad; 
		boolean carnetConducir; 
		boolean sancion; 
		
		// Pedir al usuario: edad, 2 valores booleanos (carnet de conducir y sanción)
		System.out.println("¿Cúantos años tienes?");
		edad = reader.nextInt(); 
		System.out.println("¿Tienes carnet de conducir? --> true/false");
		carnetConducir = reader.nextBoolean(); 
		System.out.println("¿Tienes sanciones? --> true/false");
		sancion = reader.nextBoolean(); 
		
		// Creamos condición: 
		if (edad > 18 && carnetConducir == true && sancion == false)  {
			System.out.println("¡TIENES PERMISO PARA ALQUILAR COCHE!");
		}else {
			System.out.println("¡NO TIENES PERMISO PARA ALQUILAR COCHE!");
		}
		
		// Cerramos scanner
		reader.close();
	}

}
