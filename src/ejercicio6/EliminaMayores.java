package ejercicio6;

import java.util.Arrays;

public class EliminaMayores {
	public static int [] eliminarMayores (int t[], int valor) {

		int result[]= new int [0];
		
		for (int i = 0; i < t.length;i++) {
			if (valor>t[i]) {
				result=Arrays.copyOf(result, result.length+1);
				result[result.length-1]= t[i];
	
			}

		}
		return result;
	}
}
