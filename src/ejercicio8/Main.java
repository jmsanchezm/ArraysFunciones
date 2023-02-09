package ejercicio8;

public class Main {

	public static void main(String[] args) {
		int result[]= new int [0];
		
		int t[]= {1,2,3,4,5,6,7};
		int numElementos=2;
		int sum=0;
		for(int i =0; i<t.length;i++) {
			for (int j=0;j<numElementos;j++) {
				sum+=t[i];
			}
		}
		System.out.println(sum);
	}

}
