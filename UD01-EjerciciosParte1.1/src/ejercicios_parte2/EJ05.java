package ejercicios_parte2;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		
	//	Diseña una aplicación que solicite al usuario 
	//	que introduzca una cantidad de segundos. La 
	//	aplicación debe mostrar cuántas horas, minutos 
	//	y segundos hay en el número de segundos 
	//	introducidos por el usuario.
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar segundos, minutos y horas
		Integer seg;
		Integer min;
		Integer hora;
		
		// Pedir al usuario los segundos
		System.out.println("Introduce los segundos: ");
		seg = reader.nextInt();
		
		// Hacemos la conversion de segundo a hora, minutos y segundos
		hora = seg/3600; 
		min = (seg%3600)/60; 
		seg = seg%60; 
		
		// Mostrar por pantalla la conversión
		System.out.println("Los segundos introducido serían --> " + hora + " horas");
		System.out.println("Los segundos introducido serían --> " + min + " minutos");
		System.out.println("Los segundos introducido serían --> " + seg + " segundos");

		// Cerramos scanner
		reader.close();

	}

}
