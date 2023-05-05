package user;

import tda.ColaTDA;

public class PasarColaACola {
	
	public static void PasarCola(ColaTDA cola, ColaTDA destino) {
		
		while (!cola.colaVacia()){
			destino.acolar(cola.primero());
			cola.desacolar();
			}
		
	}

}
