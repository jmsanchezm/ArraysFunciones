package ejercicio5;

import java.util.Arrays;

public class SinRepetir {
	static int [] sinRepetidos (int t[]) {
		int result[]= new int [0];
		int valor;
		int posicion;
		int index=0;
		Arrays.sort(t);
		
		for (int i =0; i<t.length;i++) {
			valor=t[i];
			posicion=Arrays.binarySearch(result,valor);
			
			if (posicion<0) {
				result= Arrays.copyOf(result, result.length+1);
				result[index]=valor;
				index++;
			}
		}
		return result;
	}
	
}
