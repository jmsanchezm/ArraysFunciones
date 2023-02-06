package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el array
		int tabla []= new int [5];
		
		long suma; //Se guardará el resultado de la función.
		
		//Creamos el array
		Scanner read= new Scanner (System.in);
		
		//Solicitamos números
		System.out.println("Introduzca 5 números");
		for (int i =0;i<tabla.length;i++) {
			//Leemos dato
			tabla[i]= read.nextInt();
		}
		//La suma será igual al resultado de la función.
		suma=FuncionSuma.numSuma(tabla);
		
		//Mostramos el array
		System.out.println(Arrays.toString(tabla));
		//Mostramos la suma
		System.out.println("La suma de los números contenidos en el array es "+ suma);

	}

}
