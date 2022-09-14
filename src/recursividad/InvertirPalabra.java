package recursividad;

public class InvertirPalabra {

	/*
	 * Invertir una palabra de forma recursiva
	 * 
	 * Para invertir una palabra de forma recursiva está esta idea: recorrer el
	 * arreglo de char (la palabra) de fin a inicio e ir retornando una nueva
	 * palabra de tal forma que inicie con la última letra y siga con la penúltima y
	 * así suscesivamente
	 * 
	 * Por lo que por parámetro necesitamos la palabra y el iterador (para la
	 * posición de la letra); el iterador debe iniciar el el tamaño de la palabra-1
	 * y cada vez se le irá disminuyendo de a uno para ir invirtiendo la palabra
	 * 
	 * Caso base: cuando el iterador llegue a un valor menor a cero Caso recursivo:
	 * mientras que se pueda seguir recorriendo la palabra de atrás hacia adelante
	 */

	public static void main(String[] args) {
		String palabra = "palabra";
		System.out.println(invertirPalabra(palabra.toLowerCase(), palabra.length() - 1));
	}

	public static String invertirPalabra(String palabra, int i) {
		if (i >= 0) {
			return "" + palabra.charAt(i) + invertirPalabra(palabra, i - 1);
		}
		return "";
	}

}
