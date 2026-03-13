package co.edu.poli.semana6.vista;

import co.edu.poli.semana6.modelo.A;
import co.edu.poli.semana6.modelo.B;
import co.edu.poli.semana6.modelo.C;
import co.edu.poli.semana6.modelo.D;

public class Principal {

	public static void main(String[] args) {

		C c1 = new C("1", "objeto2", 5);
		B b1 = new B("1", "objeto1", "metal");
		A a1 = new A("1", "objeto1");

		A[] arreglo = new A[5];

		arreglo[0] = b1;
		arreglo[3] = c1;
		arreglo[4] = a1;
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null)
				System.out.println("val: " + arreglo[i].ope(i));
			else
				System.out.println("nulos");
		}
		
		System.out.println(D.operacion1(0));
		System.out.println(D.operacion1(1));
		System.out.println(D.operacion1(5));	
		
		System.out.println(D.operacion2(a1));
		System.out.println(D.operacion2(b1));
		System.out.println(D.operacion2(c1));

	}

}
