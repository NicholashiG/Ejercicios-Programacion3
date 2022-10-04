package persistencia1;

public class Empleado {

	// Constructor
	public Empleado(String nombre, String id, int sueldo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.sueldo = sueldo;
	}

	// Variables
	private String nombre;
	private String id;
	private int sueldo;

	// Getters y setters
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

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
		return ("$ Nombre empleado: " + nombre + ", ID: " + id + ", sueldo: " + sueldo);
	}

}
