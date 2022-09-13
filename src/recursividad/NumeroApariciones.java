package recursividad;

public class NumeroApariciones {

	/*
	 * Recorra el arreglo desde la primera posición hasta la última posición y
	 * retorne el número de veces que se repite el elemento.
	 * 
	 * Parámetros: vector[] (arreglo en el cual se encuentran los elementos), inicio
	 * (es el inicio del vector), fin (es el fin del vector), elem (es el número a
	 * buscar dentro del arreglo)
	 * 
	 * Bien, este es recorrer un arreglo y únicamente suma en caso de que el
	 * elemento del arreglo sea igual al elemento buscado
	 * 
	 * Caso base: cuando se termine de recorrer la matríz, es decir, cuando el
	 * inicio sea igual al fin 
	 * Caso recursivo: si es el elemento retorne 1 + la
	 * búsqueda del siguiente elemento, de lo contrario, solo retorne la búsqueda
	 * del siguiente elemento
	 */

	public static void main(String[] args) {
		int[] arreglo = { 1, 4, 6, 2, 4, 1, 3, 5, 7, 1, 31, 35, 47, 1, 1, 1 };
		int buscado = 1; // 1 está 6 veces
		System.out.println(numeroApariciones(arreglo, 0, arreglo.length, buscado));
	}

	public static int numeroApariciones(int[] arr, int inicio, int fin, int elem) {
		if (inicio != fin) {
			if (arr[inicio] == elem) {
				return 1 + numeroApariciones(arr, inicio + 1, fin, elem);
			} else {
				return numeroApariciones(arr, inicio + 1, fin, elem);
			}
		}
		return 0;
	}

}
