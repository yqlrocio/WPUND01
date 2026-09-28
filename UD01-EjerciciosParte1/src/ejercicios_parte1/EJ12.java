package ejercicios_parte1;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		
	//	Un frutero necesita calcular los beneficios 
	//	anuales que obtiene de la venta de manzanas 
	//	y peras. Por este motivo, es necesario 
	//	diseñar una aplicación que solicite las 
	//	ventas (en kilos, tanto de las peras como 
	//	de las manzanas). La aplicación mostrará el 
	//	importe total sabiendo que el precio del kilo 
	//	de manzanas está fijado en 2,35€ y el kilo de 
	//	peras en 1,95€.
		
		// Crear el Scanner
		Scanner sc = new Scanner (System.in); 
	 
		//2.35€ el kilo de manzana y 1.95€ el kilo de pera
		double manzana;
		double pera;  
        
        // Preguntar al usuario cuántas manzanas quiere comprar 
        System.out.println("¿Cúantos kilos de manzanas has vendido?");
        manzana = sc.nextDouble(); 
        
        // Preguntar al usuario cuánto quiere comprar 
        System.out.println("¿Cúantos kilos de peras has vendido?");
        pera = sc.nextInt();
        
        // Mostrarle al usuario cuánto ha ganado en sus manzanas y peras
        System.out.println("Tus beneficios de manzanas son:" + manzana * 2.35 + "€");
        System.out.println("Tus beneficios de peras son:" + pera * 1.95 + "€");
        
       //Cerramos el Scanner
        sc.close();
	}

}