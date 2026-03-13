package co.edu.poli.semana6.modelo;

public class B extends A{
	
	private String composicion;

	public B(String Id, String nombre, String composicion) {
		super(Id, nombre);
		this.composicion = composicion;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	@Override
	public String toString() {
		return "B [composicion=" + composicion + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int ope(int i) {
		return 5*i;
	}


}
