package recursividad;

import java.util.Arrays;

public class NumeroMenorArreglo {

	/*
	 * El recorrido del arreglo se realiza de inicio a fin. El criterio de parada es
	 * cuando inicio y fin son iguales. Parámetros: vector[] (es el arreglo en el
	 * cual se encuentran los elementos), inicio (Es el inicio del arreglo), fin (Es
	 * el fin del arreglo y su valor es el tamaño del arreglo - 1).
	 * 
	 * Para ver el caso base y el recursivo se usará un ejemplo: Tenemos un arreglo
	 * [10 ,3 ,21, 5, 13] y queremos saber el menor, por lo que según lo solicitado
	 * el ejercicio se debe dividir el arreglo hasta que el inicio y el fin sean
	 * iguales, es decir, cuando los índices lo sean. Ahí devolvemos el menor de esa
	 * parte del arreglo, luego lo comparamos con la siguiente mitad del arreglo
	 * para saber el menor de esa parte, y así saber el menor de todo el arreglo.
	 * 
	 * Caso base: cuando los índices sean iguales Caso recursivo: cuando no sean
	 * iguales y se pueda comparar
	 */

	public static void main(String[] args) {

		int[] arr = { 13, 4, 6, 2, 8 };
		System.out.println(numeroMenorArreglo(arr, 0, arr.length - 1));

	}

	public static int numeroMenorArreglo(int[] arr, int inicio, int fin) {
		if (inicio == fin) {
			return arr[0];
		} else {
			if (fin > inicio) {
				int div = arr.length / 2;
				int menIzq = numeroMenorArreglo(Arrays.copyOfRange(arr, inicio, div), inicio, div-1);
				int menDer = numeroMenorArreglo(Arrays.copyOfRange(arr, div, fin), div+1, fin);
				if (menIzq < menDer) {
					return menIzq;
				} else {
					return menDer;
				}
			}
			// Buscar otra forma de dividir los arreglos, esta genera error en
			// la recursividad

			
		}
		return 0;
	}

}
