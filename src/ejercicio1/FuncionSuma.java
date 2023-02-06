package ejercicio1;

public class FuncionSuma {
	//Creamos la funcion con una tabla como parámetro de entrada
	public static long numSuma (int numEntero []) {
		//Declaramos variable e inicializamos a 0
		long suma = 0;
		//Recorremos el array con un for each
		for(int valor: numEntero) {
			//Le sumamos el valor a suma
			suma+=valor;
		}
		//Devolvemos dato
		return suma;
	}
}
