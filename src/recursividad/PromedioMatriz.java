package recursividad;

public class PromedioMatriz {

	/*
	 * Hallar recursivamente el promedio de los elementos de la diagonal de una
	 * matriz cuadrada.
	 * 
	 * Se debe recorrer una matriz de forma recursiva y sumarle a un acumulador.
	 * Luego, ese acumulador se promedia con el tamaño de la matriz y ese es el
	 * promedio.
	 * 
	 * Caso base: cuando llegue al final de la matriz Caso recursivo: mientras que
	 * esté dentro de la matriz se retorna el valor dentro de la matriz y sigue con
	 * el otro
	 */

	public static void main(String[] args) {

		int[][] matriz = { { 4, 1,  2,  2 }, 
				           { 5, 1,  9,  1 }, 
				           { 1, 2,  8,  9 }, 
				           { 5, 12, 6,  9 } };
		// Suma = 77 
		// Prom = 4.8125

		System.out.println(promedioMatriz(matriz, 0, 0));

	}

	// Se recorre la matriz normal devolviendo cada valor en la posición y sumándolo
	public static int sumaMatriz(int[][] matriz, int i, int j) {

		if (i < matriz.length) {
			if (j < matriz[i].length) {
				return matriz[i][j] + sumaMatriz(matriz, i, j + 1);
			} else
				return sumaMatriz(matriz, i + 1, 0);
		}
		return 0;
	}

	// Ya con la suma obtenida en sumaMatriz, se promedia por la cantidad de valores
	// que tiene la matriz, en este caso, como debe ser cuadrada, 
	// el promedio es el área de un cuadrado
	// es decir, base por altura, teniendo, en este caso, 16 posiciones
	public static double promedioMatriz(int[][] matriz, int i, int j) {
		return (sumaMatriz(matriz, i, j) / (matriz.length * matriz.length + 0.0));
	}
}
