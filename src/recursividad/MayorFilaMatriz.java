package recursividad;

public class MayorFilaMatriz {
	/*
	 * Retornar el número de la fila de la matriz cuya suma de todos sus elementos
	 * sea mayor.
	 * 
	 * Por parámetro debemos pasar la posiciónMayor, la matriz, i y j
	 */
	public static void main(String[] args) {
		int[][] matriz = { { 10000, 2, 0, 9 }, { 20, 3, 4, 5 }, { 0, 409, 5, 6 }, { 9, 5, 6, 7 } };

		System.out.println(mayorFilaMatriz(matriz, 0, 0, 0, 0));
	}

	public static int mayorFilaMatriz(int[][] matriz, int i, int j, int suma, int pos) {
		
		if (i<= matriz.length) {
			if (i==matriz.length) {
				return pos;
			}
			int sumaAct = sumaFilaMatriz(matriz, i, j);
			if (sumaAct>suma) {
				return mayorFilaMatriz(matriz, i+1, j, sumaAct, i);
			}
			else {
				return mayorFilaMatriz(matriz, i+1, j, suma, pos);
			}
		}
		
		return 0;
		

	}

	public static int sumaFilaMatriz(int[][] matriz, int i, int j) {

		if (i < matriz.length) {
			if (j < matriz[i].length) {
				return matriz[i][j] + sumaFilaMatriz(matriz, i, j + 1);
			}
		}
		return 0;

	}

}
