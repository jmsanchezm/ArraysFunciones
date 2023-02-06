package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

import ejercicio1.FuncionSuma;

public class Main {

	public static void main(String[] args) {
		//Creamos el array
		int table []= new int [5];
		
		int valMax; //Se guardará el valor maximo
		
		//Creamos el array
		Scanner read= new Scanner (System.in);
		
		for (int i =0; i<table.length;i++) {
			table [i]=read.nextInt();
		}
		valMax=ValorMax.maximo(table);
		//Mostramos el array
		System.out.println(Arrays.toString(table));
		//Mostramos la suma
		System.out.println("El valor máximo es "+ valMax);

	}

}
