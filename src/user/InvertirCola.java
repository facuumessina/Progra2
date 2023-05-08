package user;

import impl.Cola;
import tda.ColaTDA;

public class InvertirCola {
	
	public static ColaTDA InvertirCola (ColaTDA origen) {
		
		ColaTDA inv = new Cola();
		inv.inicializarCola();
		
		if (!origen.colaVacia()) {
			int ultimo = origen.primero();
			origen.desacolar();
			inv = InvertirCola(origen);
			inv.acolar(ultimo);
		}
		
		return inv;
	}

}
