package user;

import tda.PilaTDA;

public class SumarElementosPila {
	
	public static int SumaPila(PilaTDA pila) {
		int suma = 0;
		
		while(!pila.pilaVacia()) {
			suma = suma + pila.tope();
			pila.desapilar();
		}
		
		return suma;
	}

}
