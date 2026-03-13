package co.edu.poli.semana6.modelo;

public class D {

	public static A operacion1(int a) {
		if (a == 0)
			return new A("a", "objeto a");
		else if (a == 1)
			return new B("b", "objeto b", "caucho");
		else
			return new C("c", "objeto c", 12);
	}

	public static String operacion2(A obj) {
		if (obj.getClass().getSimpleName().equals("A"))
			return "este es un objeto de tipo A";
		else if (obj.getClass().getSimpleName().equals("B"))
			return "este es un objeto de tipo B";
		else
			return "este es un objeto de tipo C";
	}

}
