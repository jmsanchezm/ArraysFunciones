package ejercicio6;

import java.util.Arrays;

public class EliminaMayores {
	static int[] eliminarMayores(int t[], int valor) {
		int result[]=new int[0];
		for (int i = 0; i<t.length;i++) {
			if (t[i]>valor ) {
				System.arraycopy(t, i+1,t, i,t.length-i-1);
				
			}else {
				t=Arrays.copyOf(t, t.length);
			}
			result=t;
		}
		return result;
	}
}
