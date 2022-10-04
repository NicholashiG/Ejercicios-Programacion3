package persistencia1;

public class Empleado {

	// Constructor
	public Empleado(String nombre, String id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	// Variables
	private String nombre;
	private String id;

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ("$ Nombre empleado: " + nombre + ", ID: " + id);
	}

}
