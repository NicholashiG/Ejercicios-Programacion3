package manupilacionArchivos1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AbrirArchivoVentana {

	public static void main(String[] args) {
		Scanner entrada = null;
		// Primero se crea el objeto JFileChooser invocando al constructor de la clase:
		JFileChooser fileChooser = new JFileChooser();
		// A continuación el método showOpenDialog() muestra la ventana donde podremos
		// seleccionar el fichero a leer:
		fileChooser.showOpenDialog(fileChooser);
		try {
			// Se obtiene un String que contiene la ruta del fichero seleccionado.
			String ruta = fileChooser.getSelectedFile().getAbsolutePath();
			File f = new File(ruta);
			// Una vez obtenida la ruta del archivo se crea un Scanner que hemos llamado
			// entrada para realizar la lectura:
			entrada = new Scanner(f);
			// Finalmente el bucle while se encarga de leer el fichero de texto línea a
			// línea y mostrar cada línea del mismo por pantalla.
			while (entrada.hasNext()) {
				System.out.println(entrada.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("No se ha seleccionado ningún fichero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	/*
	 * Si se ejecuta el programa se puede comprobar que el usuario solo puede
	 * seleccionar archivos. Mediante JFileChooser podemos limitar al usuario para
	 * que solo pueda seleccionar directorios o archivos o ambas cosas utilizando el
	 * método setFileSelectionMode(modo) Como parámetro en modo podemos usar estos
	 * valores: JFileChooser.DIRECTORIES_ONLY : permite seleccionar solo directorios
	 * JFileChooser.FILES_ONLY : permite seleccionar solo archivos. Es el valor por
	 * defecto. JFileChooser.FILES_AND_DIRECTORIES : Permite seleccionar archivos y
	 * directorios.
	 * 
	 * En algunas ocasiones resulta útil que en la ventana no se muestren todos los
	 * archivos sino que mediante un filtro solo se muestren los archivos que nos
	 * sean útiles para nuestra aplicación, por ejemplo los que tengan una
	 * determinada extensión (.java, .txt, etc.). Para ello se utiliza la clase
	 * FileNameExtensionFilter. Ejemplo de uso de FileNameExtensionFilter: Vamos a
	 * utilizar la clase FileNameExtensionFilter para indicar a JFileChooser que
	 * solo muestre los archivos con extensión .java
	 * 
	 * 
	 * Ejemplo con filtros:
	 * Para usarlo, debe cambiar el nombre a main, y la función de arriba, agregarle
	 * algo más en el nombre
	 */

	public static void main1(String[] args) {
		Scanner entrada = null;
		// Se crea el JFileChooser. Se le indica que la ventana se abra en el directorio
		// actual
		JFileChooser fileChooser = new JFileChooser(".");
		// Se crea el filtro. El primer parámetro es el mensaje que se muestra,
		// el segundo es la extensión de los ficheros que se van a mostrar
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos java (.java)", "java");
		// Se le asigna al JFileChooser el filtro
		fileChooser.setFileFilter(filtro);
		// se muestra la ventana
		int valor = fileChooser.showOpenDialog(fileChooser);
		if (valor == JFileChooser.APPROVE_OPTION) {
			String ruta = fileChooser.getSelectedFile().getAbsolutePath();
			try {
				File f = new File(ruta);
				entrada = new Scanner(f);
				while (entrada.hasNext()) {
					System.out.println(entrada.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} finally {
				if (entrada != null) {
					entrada.close();
				}
			}
		} else {
			System.out.println("No se ha seleccionado ningún fichero");
		}
	}

}
