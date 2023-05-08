package user;

import impl.Cola;
import tda.ColaTDA;

public class ColaEsInversa {
	
	public static boolean EsInversa (ColaTDA c1, ColaTDA c2) {
		
		boolean inv = true;
		
			ColaTDA inversa = new Cola();
			inversa.inicializarCola();
			
			if (!c2.colaVacia()) {
				int ultimo = c2.primero();
				c2.desacolar();
				inversa = InvertirCola.InvertirCola(c2);
				inversa.acolar(ultimo);
			}
			
			
			
			

		
		return inv;
	}

}
