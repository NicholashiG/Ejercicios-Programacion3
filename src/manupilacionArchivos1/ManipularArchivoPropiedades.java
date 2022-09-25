package manupilacionArchivos1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ManipularArchivoPropiedades {

	public static void main(String[] args) {
		Properties propiedades = new Properties();

		try {
			/* Leemos el archivo con InputStream */
			InputStream entrada = new FileInputStream(
					"/Users/nicolasjurado/eclipse-workspace/EjerciciosS3/src/.properties");

			/*
			 * Cargamos nuestro archivo en el objeto propiedades instanciado anteriormente
			 */
			propiedades.load(entrada);

			/* Obtenemos las propiedades del archivo con getProperty */
			System.out.println(propiedades.getProperty("usuario"));
			System.out.println(propiedades.getProperty("password"));

			/* Podemos asignar propiedades en tiempo de ejecucion con setProperty */
			propiedades.setProperty("nombre", "jose");

			System.out.println(propiedades.getProperty("nombre"));

			/* Cerramos nuestro InputStream */
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
