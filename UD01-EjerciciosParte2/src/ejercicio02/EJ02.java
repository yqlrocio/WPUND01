package ejercicio02;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		
		// Diseña una aplicación que pida una cantidad entera 
		// de segundos y la convierta en horas, minutos y 
		// segundos. Para realizar la descomposición utiliza 
		// los operadores / y %.

		// Creamos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos variable para almacenar hora, minuto y segundo
		Integer hora; 
		Integer min; 
		Integer seg; 
		Integer segundos;
		
		// Pedimos al usuario una cantidad de segundos
		System.out.println("Introce una cantidad de segundos: ");
		segundos = reader.nextInt(); 
		
		// Calculamos los segundos en hora, minuto y segundo
		hora = segundos/3600;
		min = (segundos%3600)/60;
		seg = segundos%60; 
		
		// Mostramos por pantalla las horas, minutos y segundos tras la conversión
		System.out.println("Son: " + hora + " horas, " + min + " minutos y " + seg + " segundos");
		
		// Cerramos scanner 
		reader.close();
	}

}
