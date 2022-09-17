package recursividad;

public class Ejercicio3_Parcial {
	
	/*
	 * Método recursivo usando divide y vencerás
	 * Calcule el producto de los elementos del array mayores que b
	 * El tamaño del array es de 5, b es un parámetro que entra al método
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = {1, 3, 5, 2, 7};
		System.out.println(mayoresB(2, arreglo, 0, arreglo.length-1, 0));
	}
	
	public static int mayoresB(int b, int[] arreglo, int inicio, int fin, int mayoresB) {
		
		if (arreglo!=null) {
			if (inicio<=fin) {
				if (inicio==fin) {
					return arreglo[0];
				}
				int mid = arreglo.length/2;
				int cantIzq = mayoresB(b, arreglo, inicio, mid-1, mayoresB);
				int cantDer = mayoresB(b, arreglo, mid+1, fin, mayoresB);
				
				if (cantIzq > b || cantDer > b) {
					mayoresB+=1;
				}
			}
		}
		
		return 0;
		
	}

}
