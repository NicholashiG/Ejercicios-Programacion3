package manupilacionArchivos1;

import java.io.File;

public class CrearCarpeta {

	/*
	 * Para crear un directorio con Java deberemos de utilizar un objeto File. La
	 * ruta que debe de contener dicho objeto deberá de hacer referencia a un
	 * directorio en vez de a un archivo.
	 * 
	 * NOTA: para windows debe hacerse con los dos slash, en mac o linux con el normal
	 * 
	 * File directorio = new File("c:\\temp\\directorio");
	 * 
	 * Cuando especificamos el path mediante la cadena de texto debemos de recordar
	 * que la barra debe de repetirse dos veces ya que usada de manera aislada hace
	 * referencia a una secuencia de escape.
	 * 
	 * Una vez tenemos creado el objeto File podemos invocar a dos métodos:
	 * 
	 * mkdir(), el cual asume que la ruta de directorios existe, a excepción del
	 * último que será el directorio generado. 
	 * mkdirs(), independientemente de que existan o no los directorios serán creados.
	 * Al contrario de lo que sucede con la creación de ficheros, 
	 * a la hora de crear un directorio no estamos obligados a capturar la excepción 
	 * IOException.
	 * 
	 */

	public static void main(String[] args) {
		File directorio = new File("/Users/nicolasjurado/Desktop/carpetaEjemplo");
		directorio.mkdirs();
		System.out.println("El directorio se creó satisfactoriamente");
	}

}
