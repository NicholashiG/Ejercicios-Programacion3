package recursividad;

public class CantidadCifrasNumero {

	/*
	 * Hallar la cantidad de cifras de un número entero. Parámetro: n (número
	 * entero).
	 * 
	 * Para hallar la cantidad de cifras se va dividiendo de a 10. En caso de que
	 * esa división igual a cero, se termina el algoritmo, por lo que ese sería el
	 * caso base. El caso recursivo sería que siga dividiendo el número sobre 10.
	 * 
	 * Sirve para números tanto positivos, como negativos
	 * 
	 */
	public static void main(String[] args) {
		int numero = 1000;
		System.out.println(cantidadCifrasNumero(numero));
	}

	public static int cantidadCifrasNumero(int n) {
		if (n / 10 >= 1 || n / 10 < 0) {
			return 1 + cantidadCifrasNumero(n / 10);
		}
		return 1;
	}

}
