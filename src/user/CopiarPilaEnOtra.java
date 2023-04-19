package user;

import impl.Pila;
import tda.PilaTDA;

public class CopiarPilaEnOtra {
		
		public static PilaTDA copiarPila(PilaTDA original) {
			PilaTDA auxiliar = new Pila();
			PilaTDA copia = new Pila();
			auxiliar.inicializarPila();
			copia.inicializarPila();
			
			while(!original.pilaVacia()) {
				int valorAux = original.tope();
				auxiliar.apilar(valorAux);
				original.desapilar();
			}
			
			while(!auxiliar.pilaVacia()) {
				int valorCopia = auxiliar.tope();
				copia.apilar(valorCopia);
				auxiliar.desapilar();
			}
			
			return copia;
		}

	}

