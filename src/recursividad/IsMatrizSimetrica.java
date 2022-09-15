package recursividad;

public class IsMatrizSimetrica {

	/*
	 * Determinar si una matriz es o no simétrica (es cuadrada y sus elementos por
	 * encima de la diagonal son iguales a los elementos de por debajo en forma de
	 * espejo)
	 * 
	 * ---------------------
	 * Matriz de posiciones:
	 * 
	 * 00 01 02 03
	 * 10 11 12 13
	 * 20 21 22 23
	 * 30 31 32 33
	 * ---------------------
	 * 
	 * Para saber si una matriz es simétrica, se debe ignorar la diagonal
	 * principal y solo tener en cuenta lo que está por encima y por debajo.
	 * Ahora bien, para saber si es simétrica, se debe comparar que la posición
	 * ij sea igual a la posición ji por ejemplo, que la 10 sea igual a la 01,
	 * la 21 igual a la 12
	 * 
	 * Caso base: cuando se termine de recorrer la matriz o cuando un valor no sea igual
	 * Caso recursivo: mientras que se cumpla la condición, retorne verdadero
	 */

	public static void main(String[] args) {
		int[][] matrizSimetrica= {{1,  2, 90, 9},
		                 		  {2,  3, 4,  5},
		                 		  {90, 4, 5,  6},
		                 		  {9,  5, 6,  7}};
		
		int[][] matrizNoSimetrica= {{1, 5, 3, 8},
       		  						{2, 3, 4, 5},
       		  						{3, 5, 5, 9},
       		  						{9, 5, 0, 7}};
		
		System.out.println(isSimetrica(matrizNoSimetrica, 0, 0));
	}

	public static boolean isSimetrica(int[][] matriz, int i, int j) {
		if (i < matriz.length) { // Mira si no se ha salido de los límites
			if (i == matriz.length - 1 && j == matriz[i].length - 1) {
				// Esta condición se puso con el objetivo de retornar verdadero
				// si y solo si i y j llegan hasta la última posición
				// con esto concluimos que se recorrió toda la matriz sin
				// que la condición de que el valor en ij = ji.
				return true;
			}
			if (j < matriz[i].length) {
				if (matriz[i][j] == matriz[j][i]) {
					// preguntamos que los valores sean el mismo
					// y si se cumple, revisamos en la siguiente columna
					// de lo contrario, se termina este if y sale hasta
					// la línea de retornar falso
					return isSimetrica(matriz, i, j + 1);
				}
			} else { // cuando termine la columna, siga en la siguiente e inicie desde
						// desde la columna 0
				return isSimetrica(matriz, i + 1, 0);
			}
		}
		return false;
	}
}
