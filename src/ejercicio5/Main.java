package ejercicio5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int tabla [] = {1,2,52,1,2,52,1};
		SinRepetir.sinRepetidos(tabla);
		System.out.println(Arrays.toString(SinRepetir.sinRepetidos(tabla)));
	}

}
