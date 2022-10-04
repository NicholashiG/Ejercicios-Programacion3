package persistencia1;

import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

	public static final String RUTA_ARCHIVO_PRODUCTOS = "src/persistencia1/archivoProductos.txt";
	public static final String RUTA_ARCHIVO_EMPLEADOS = "src/persistencia1/archivoEmpleados.txt";

	public static void guardarProductos(ArrayList<Producto> listaProductos) throws IOException {
		String contenido = "";

		for (Producto producto : listaProductos) {
			contenido += producto.toString() + "\n";
		}
		System.out.println(contenido);
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_PRODUCTOS, contenido, false);

	}

	public static void guardarEmpleados(ArrayList<Empleado> listaEmpleados) throws IOException {
		String contenido = "";

		for (Empleado empleado : listaEmpleados) {
			contenido += empleado.toString() + "\n";
		}
		System.out.println(contenido);

		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_EMPLEADOS, contenido, false);
	}

}
