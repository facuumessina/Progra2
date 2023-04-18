package user;

import impl.Pila;
import tda.PilaTDA;

public class Principal {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				PilaTDA origen = new Pila();
				origen.inicializarPila();
				origen.apilar(1);
				origen.apilar(2);
				origen.apilar(3);
				origen.apilar(4);
				origen.apilar(5);
				
				PilaTDA destino = pasarPila(origen);

				while(!destino.pilaVacia()) {
					System.out.println(destino.tope());
					destino.desapilar();
				}
		
	}

}
