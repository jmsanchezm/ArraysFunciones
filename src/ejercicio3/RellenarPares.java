package ejercicio3;

import java.util.Arrays;

public class RellenarPares {

	static int [] rellenaPares (int longitud, int fin) {
		int tabla[]=new int [longitud];
	
		for (int i = 0; i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*(fin-2+1)+2);
			
			if (tabla[i]%2!=0) {
				tabla[i]++;
			}
		}
		Arrays.sort(tabla);
		return tabla ;
	}

}
