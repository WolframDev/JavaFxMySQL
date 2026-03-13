package co.edu.poli.semana6.modelo;

public class C extends A{
	
	private int peso;

	public C(String Id, String nombre, int peso) {
		super(Id, nombre);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "C [peso=" + peso + ", getId()=" + getId() + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public int ope(int i) {
		return 3*i;
	}


}
