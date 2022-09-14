package recursividad;

public class SumaDiagonalMatriz {

	/*
	 * Programar un algoritmo recursivo que permita sumar la diagonal principal de
	 * una matriz. Filas y columnas avanzando. Parámetros( matriz, i, j)
	 * 
	 * NOTA: LA MATRIZ DEBE DE SER CUADRADA
	 * 
	 * La diagonal de una matriz es cuando i es igual a j, por lo tanto, los dos
	 * índices se sumarán de igual forma.
	 * 
	 * Caso base: cuando i y j hayan llegado al tamaño de la matriz Caso recursivo:
	 * mientras que no lleguen al tamaño, se aumenta 1 a los dos índices
	 */

	public static void main(String[] args) {

		int[][] matriz = { { 4, 1,  2,  2 }, 
				           { 5, 1,  9,  1 }, 
				           { 1, 25, 88, 9 }, 
				           { 5, 12, 6,  9 } };

		// RECORDATORIO: PARA SACAR UNA DIAGONAL, LA MATRIZ DEBE DE SER
		// CUADRADA

		System.out.println(sumaDiagonalMatriz(matriz, 0, 0));
	}

	public static int sumaDiagonalMatriz(int[][] matriz, int i, int j) {
		if (i < matriz.length && j < matriz.length) {
			if (i == j) {
				return matriz[i][j] + sumaDiagonalMatriz(matriz, i + 1, j + 1);
			}
		}
		return 0;
	}

}
