package ejercicio2;

public class ValorMax {
	
	public static int maximo (int t[]) {
		int valorMax=0;
		int maximo=Integer.MIN_VALUE;
		for (int i=0;i<t.length;i++) {
			if  (maximo<t[i]) {
				maximo=t[i];
				valorMax=t[i];
			}
		}
		return valorMax;
	}
}
