package ejercicio4;

public class Búsqueda {
	
	static int buscar (int t[], int clave) {
		int posicion=0;

		while (posicion<t.length && clave!=t[posicion]) {
			posicion++;
		}
		if (posicion>t.length) {
			posicion=-1;
		}
		
		return posicion;

}
}
