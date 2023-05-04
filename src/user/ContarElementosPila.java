package user;

import tda.PilaTDA;

public class ContarElementosPila {
	
	public static int contarPila(PilaTDA pila) {
		
		int count = 0;
		
		while (!pila.pilaVacia()) {
			pila.desapilar();
			count++;
		}
		
		return count;
		
	}

}
