package manupilacionArchivos1;

import java.io.File;

public class ImprimirContenidoCarpeta {

	public static void main(String[] args) {
		// Creamos el directorio en el que queremos iniciar la búsqueda
		File directorio = new File("/Users/nicolasjurado/Downloads");
		// Llamamos la función
		mostrarCarpeta(directorio);
	}

	// Una funcion recursiva que se llame a sí misma, recibe como parámetro
	// el directorio donde se quiere iniciar
	public static void mostrarCarpeta(File fichero) {
		System.out.println("En directorio " + fichero.toString());
		// Revisa si el File es un directorio
		if (fichero.isDirectory()) {
			// El método listFiles devuelve un array de Files
			File[] lista = fichero.listFiles();
			// Recorre cada File de la lista obtenida
			for (int i = 0; i < lista.length; i++) {
				System.out.print("Archivo o directorio: ");
				// Imprime el nombre del archivo o directorio
				System.out.println(lista[i].getName());
				// Con el método isDirectory revisa si es un directorio
				if (lista[i].isDirectory()) {
					System.out.println("Entra al directorio " + lista[i].toString());
					// En caso de ser verdadero llama de nuevo a la función, pero con un
					// Path más específico, es decir, un nivel inferior
					mostrarCarpeta(lista[i]);
				}
			}
		}
	}
}
