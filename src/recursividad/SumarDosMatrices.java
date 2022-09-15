package recursividad;

public class SumarDosMatrices {

	/*
	 * Sumar dos matrices
	 * 
	 * Para sumar dos matrices, deben de ser del mismo tamaño
	 * La posición ij de la primera, con la ij de la segunda
	 * 
	 */

	public static void main(String[] args) {
		int[][] matriz1= {{1,  2, 90, 9},
						  {2,  3, 4,  5},
						  {90, 4, 5,  6},
					      {9,  5, 6,  7}};
		
		int[][] matriz2= {{1, 5, 3, 8},
						  {2, 3, 4, 5},
						  {3, 5, 5, 9},
						  {9, 5, 0, 7}};
		
		int[][] sumaMatriz = new int[matriz1.length][matriz1[0].length];
		
		sumaMatriz = sumaDosMatrices(matriz1, matriz2, sumaMatriz, 0, 0);
		imprimirMatriz(sumaMatriz);
		
	}	
	
	public static int[][] sumaDosMatrices(int[][] matriz1, int[][] matriz2, int[][] sumaMatriz, int i, int j) {
		if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
			if (i < matriz1.length) {
				if (j < matriz1[i].length) {
					sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
					return sumaDosMatrices(matriz1, matriz2, sumaMatriz, i, j + 1);
				} else {
					return sumaDosMatrices(matriz1, matriz2, sumaMatriz, i + 1, 0);
				}
			}
		}
		return sumaMatriz;

	}
	
	/**
     * Método que imprime una matriz de enteros
     * @param matriz 
     */
    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
    }

}
