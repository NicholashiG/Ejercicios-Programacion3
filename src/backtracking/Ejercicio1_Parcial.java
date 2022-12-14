package backtracking;

public class Ejercicio1_Parcial {
	
	public char[][] carcel={ 
	        {' ', 'P', 'X', ' ', 'P', 'P', ' ', 'P'},
		    {' ', 'P', 'P', ' ', 'P', 'P', ' ', 'P'},
		    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
		    {'P', ' ', 'P', 'P', ' ', 'P', 'P', ' '},
		    {'P', ' ', 'X', 'P', ' ', 'P', 'P', ' '},
		    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
		    {'P', 'X', 'P', ' ', 'P', 'P', ' ', 'P'}
	    };

    
	/* --------------------- PRUEBA DEL ALGORITMO --------------------- */
	public static void main(String[] args) {
		Ejercicio1_Parcial x = new Ejercicio1_Parcial(); // construimos un objeto de la clase Laberinto por defecto
		x.carcel[0][0] = 'O'; // introducimos en este caso, la salida (X) en las coordenadas (1,1)
		x.resuelve(0, 6, x); // ahora, introducimos la entrada (S) en las coordenadas (8,1)
		// y llamamos al algoritmo
		// imprimimos el laberinto ya resuelto (si tiene solución)
	}

	/* ----------------- IMPLEMENTACIÓN DEL ALGORITMO ----------------- */
	public void resuelve(int x, int y, Ejercicio1_Parcial x2) { // permite introducir unas coordenadas (x, y)
		if (paso(x, y, x2)) { // intentar resolver el laberinto en estas coordenadas
			carcel[x][y] = 'S';
			// introduce en las coordenadas (x, y) la entrada
		}
	}

	private boolean paso(int x, int y, Ejercicio1_Parcial m) {
		
		

		if (carcel[x][y] == 'O') { // si hemos llegado a X quiere decir que hemos encontrado solución
			System.out.println(m.imprimirLaberinto()); //imprimimos cada solución
			return false; // luego, el algoritmo termina
		}

		if (carcel[x][y] == '*' || carcel[x][y] == 'P' || carcel[x][y] == 'X' || (x >= carcel.length-1 || y >= carcel[x].length-1)  ) { // si llegamos a una pared o
																							// al mismo punto,
			return false; // entonces el laberinto no puede resolverse y termina.
		}
		

		// si no se cumple ninguna de estas dos situaciones, quiere decir que nos
		// encontramos en un
		// caso intermedio, por lo tanto, que empezamos a recorrer o todavía no hemos
		// llegado a nada
		carcel[x][y] = '*'; // marcamos la posición como visitada (si es la primera, en las coordenadas x e
								// y

		boolean result; // se coloca S de START)

		result = paso(x, y + 1, m); // intentamos ir hacia la DERECHA. Primera llamada recursiva
		if (result)
			return true; // si el resultado es el final, entonces el algoritmo termina
		
		result = paso(x + 1, y, m); // intentamos ir hacia ABAJO. Cuarta llamada recursiva
		if (result)
			return true; // si el resultado es el final, entonces el algoritmo termina

		result = paso(x - 1, y, m); // intentamos ir hacia ARRIBA. Segunda llamada recursiva
		if (result)
			return true; // si el resultado es el final, entonces el algoritmo termina

		result = paso(x, y - 1, m); // intentamos ir hacia la IZQUIERDA. Tercera llamada recursiva
		if (result)
			return true; // si el resultado es el final, entonces el algoritmo termina

		

		// si no hemos encontrado la solución en estos cuatros movimientos, volvemos
		// atrás, aunque hay que
		// considerar que en este punto, todas las llamadas recursivas han finalizado.
		// Si en ninguna de ellas
		// se ha conseguido el éxito, entonces el algoritmo termina y devuelve false.
		carcel[x][y] = ' '; // al dar vuelta atrás se debe limpiar el camino ya hecho para
								// encontrar una solución diferente a las anteriores
		return false; // vuelta atrás si la solución no se encuentra aquí
	}

	private String imprimirLaberinto() { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene
											// implementado
		String salida = ""; // un método toString para arrays bidimensionales, lo programamos a mano
		for (int x = 0; x < carcel.length; x++) { // recorremos filas
			for (int y = 0; y < carcel[x].length; y++) { // recorremos columnas
				salida += carcel[x][y] + " "; // output es nuestra variable que va almacenando los valores a imprimir
			}
			salida += "\n"; // devolvemos esta variable con un salto de línea
		}
		return salida;
	}

}
