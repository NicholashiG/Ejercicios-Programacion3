package recursividad;

public class CerosArreglo {

	public static void main(String[] args) {
		// Contar ceros arreglo
		// Contar la cantidad de ceros que se encuentran dentro de un arreglo
		// unidimensional de enteros. Parámetros: int arreglo[], int n

		int[] arreglo1 = { 0, 1, 3, 0, 1, 0, 0, 4, 6, 6, 0, 134, 0, 43, 0, 9, 9 };  // 7
		int[] arreglo2 = { 0, 0, 0, 0, 0, 12, 32, 43, 65, 0, 1, 0, 1, 3, 4543, 0 }; // 8
		int[] arreglo3 = { 12, 32, 43, 65, 0, 1, 0, 1, 3, 4543 };                   // 2
		int[] arreglo4 = { 32, 10, 20, 1342, 30, 10, 45, 0 };                       // 1

		int cant = contarCeros(arreglo4, 0);

		System.out.println(cant);

	}

	public static int contarCeros(int[] arr, int n) {
		if (arr != null) {
			if (arr.length != 0) {
				if (n <= arr.length - 1) {
					if (arr[n] == 0) {
						return (1 + contarCeros(arr, n + 1));
					} else {
						return contarCeros(arr, n + 1);
					}
				}
			}
		}
		return 0;
	}

}
