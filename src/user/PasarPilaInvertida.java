package user;

import impl.Pila;
import tda.PilaTDA;

public class PasarPilaInvertida {
	
	public static PilaTDA pasarPila(PilaTDA origen) {
		PilaTDA destino = new Pila();
		destino.inicializarPila();
		while(!origen.pilaVacia()) {
			int valor = origen.tope();
			destino.apilar(valor);
			origen.desapilar();
		}
		return destino;
				
	}

}
