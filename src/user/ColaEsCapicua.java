package user;

import impl.Cola;
import tda.ColaTDA;
import tda.PilaTDA;
import impl.Pila;

public class ColaEsCapicua {
	
		public static boolean EsCapicua(ColaTDA cola) {
			
		PilaTDA aux = new Pila();
		
		ColaTDA aux2 = new Cola();
		
		aux.inicializarPila();
		aux2.inicializarCola();
		boolean capicua = false;
		
		while (!cola.colaVacia()) {
			aux.apilar(cola.primero());
			aux2.acolar(cola.primero());
			cola.desacolar();
		}
		
		while (!aux2.colaVacia()) {
			if (aux.tope()==aux2.primero()) {
				capicua=true;
			}
			else {
				capicua=false;
			}
			aux.desapilar();
			aux2.desacolar();
		}
		
		while(!aux2.colaVacia()) {
			cola.acolar(aux2.primero());
			aux2.desacolar();
		}
		
		return capicua;
		
	}
		
		}
