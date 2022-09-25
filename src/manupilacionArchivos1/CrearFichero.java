package manupilacionArchivos1;

import java.io.File;
import java.io.IOException;

public class CrearFichero {

	/*
	 * Si queremos crear un fichero con Java nos tenemos que apoyar en la clase File
	 * de Java IO la cual nos proporciona un método createNewFile que generará el
	 * fichero en el path que le indiquemos. El path debe ser absoluto, según veo,
	 * porque si se pone absoluto genera una excepción de tipo IOException
	 * 
	 * Forma 1: File fichero = new File ("c:\temp\lineadecodigo\fichero.txt");
	 * 
	 * Forma 2 indicando el directorio y el fichero por separado: File fichero = new
	 * File ("c:\temp\victor","fichero.txt");
	 * 
	 * Debemos de tener cuidado en utilizar la doble barra para indicar el
	 * directorio ya que cuando utilizamos la barra sola se asume que es una
	 * secuencia de escape del estilo n b t…
	 * 
	 * Una vez creado el fichero simplemente bastará invocar el método createNewFile
	 * teniendo cuidado de que puede ser lanzada la excepción IOException a si que
	 * debemos de capturarla.
	 * 
	 */

	public static void main(String[] args) {
		// Se crea un nuevo fichero de tipo File y se guarda en el escritorio
		File fichero = new File("/Users/nicolasjurado/Desktop/ejemplo1.txt");
		try {
			// A partir del objeto File creamos el fichero físicamente
			if (fichero.createNewFile())
				System.out.println("El fichero se ha creado correctamente");
			else
				System.out.println("No ha podido ser creado el fichero, puede que ya exista");
		} catch (IOException ioe) {
			System.out.println("Al parecer el directorio ingresado no existe");
			ioe.printStackTrace();
		}
	}

	// Después de la prueba, efectivamente se crea el fichero en la dirección insertada.

}
