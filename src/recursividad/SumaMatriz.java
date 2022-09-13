package recursividad;

public class SumaMatriz {

	public static void main(String[] args) {

		/*
		 * Programar un algoritmo recursivo que permita sumar los elementos de una
		 * matriz. El recorrido tiene que ser retrocediendo en columnas y avanzando en
		 * las filas. Parámetros( matriz, i, j).
		 */

		int matriz[][] = { { 1, 2, 3, 5 },
						   { 0, 4, 5, 1 }, 
						   { 5, 3, 1, 6 }, 
						   { 1, 0, 8, 2 }, 
						   { 1, 0, 0, 4 } };

		// sum = 52

		int suma = sumarMatriz(matriz, 0, matriz[0].length - 1); // Se envía como parámetro la matriz,
																 // la posición 0 para i porque va a recorrer
																 // hacia abajo, pero se manda la última posición - 1
																 // a la j porque va a recorrerlo de derecha a izquierda
																 // SE TOMA EN CUENTA QUE LA MATRIZ ES RECTANGULAR

		System.out.println(suma);

	}

	public static int sumarMatriz(int[][] matriz, int i, int j) {
		if (matriz != null) {
			if (i < matriz.length) {
				if (j == 0) {
					return matriz[i][0] + sumarMatriz(matriz, i + 1, matriz[i].length - 1);
				} else if (j > 0) {
					return matriz[i][j] + sumarMatriz(matriz, i, j - 1);
				}
			}
		}
		return 0;
	}
}
