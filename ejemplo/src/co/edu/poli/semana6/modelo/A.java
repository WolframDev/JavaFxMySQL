package co.edu.poli.semana6.modelo;

public class A {
	
	private String id;
	private String nombre;
	
	public A(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int ope (int i) {
		return 2*i;
	}
	
	@Override
	public String toString() {
		return "A [id=" + id + ", nombre=" + nombre + "]";
	}

}
