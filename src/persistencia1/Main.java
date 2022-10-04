package persistencia1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		Persistencia persistencia = new Persistencia();

		// Se crean los productos
		Producto producto1 = new Producto("Arepa", "1", 500);
		Producto producto2 = new Producto("Pan", "2", 2000);
		Producto producto3 = new Producto("Achiras", "3", 400);
		Producto producto4 = new Producto("Agua", "4", 980);


		// Se crean los empleados
		Empleado empleado1 = new Empleado("Juan", "1", 20000);
		Empleado empleado2 = new Empleado("Pedro", "2", 12000);
		Empleado empleado3 = new Empleado("Andres", "3", 9082);
		
		// Se añaden los empleados y productos a la empresa
		ArrayList<Producto> productos = new ArrayList<>(); 
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		
		ArrayList<Empleado> empleados = new ArrayList<>(); 
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		
		Empresa empresa = new Empresa("ACME", empleados, productos);
		// Se guardan los valores en el archivo de texto correspondiente
		
		persistencia.guardarEmpleados(empresa.getEmpleados());
		persistencia.guardarProductos(empresa.getProductos());
		
		

	}

}
