package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int longitud;
		int fin;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca la longitud de la tabla:");
		longitud=read.nextInt();
		
		System.out.println("Introduzca el valor máximo al que desea llegar: ");
		fin = read.nextInt();
		
		RellenarPares.rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(RellenarPares.rellenaPares(longitud, fin)));
		

	}

}
