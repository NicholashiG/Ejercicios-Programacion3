package persistencia1;

public class Producto {

	// Constructor
	public Producto(String nombre, String id, int valor) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.valor = valor;
	}

	// Variables
	private String nombre;
	private String id;
	private int valor;

	// Getters y Setters
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return ("# Nombre producto: " + nombre + ", ID: " + id + ", valor: " + valor);
	}

}
