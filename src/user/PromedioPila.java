package user;

import tda.PilaTDA;

public class PromedioPila {
	
	public static float PromedioPila(PilaTDA pila) {
		
		float promedio = 0;
		int suma = 0;
		int count = 0;
		
		while(!pila.pilaVacia()) {
			suma = suma + pila.tope();
			count++;
			pila.desapilar();
		}
		
		promedio = suma/count;
		
		return promedio;
	}

}
