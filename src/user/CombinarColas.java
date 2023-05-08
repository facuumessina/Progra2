package user;

import impl.ColaPrioridad;
import tda.ColaPrioridadTDA;

public class CombinarColas {
	
	public static ColaPrioridadTDA CombinarColasConPri(ColaPrioridadTDA CP1, ColaPrioridadTDA CP2) {
		
		ColaPrioridadTDA comb = new ColaPrioridad();
		comb.inicializarCola();
		
		while (!CP1.colaVacia() && !CP2.colaVacia()) {

				if(CP1.prioridad() >= CP2.prioridad() ) {
					if(CP1.colaVacia() == true) {
						comb.acolarPrioridad(CP2.primero(), CP2.prioridad());
						CP2.desacolar();
					}else if(CP2.colaVacia() == true) {
						comb.acolarPrioridad(CP1.primero(), CP1.prioridad());
						CP1.desacolar();
					}
					comb.acolarPrioridad(CP1.primero(), CP1.prioridad());
					CP1.desacolar();
				}else {
					comb.acolarPrioridad(CP2.primero(), CP2.prioridad());
					CP2.desacolar();
				}	
		}
			
		while (!CP1.colaVacia()) {
			comb.acolarPrioridad(CP1.primero(), CP1.prioridad());
			CP1.desacolar();
		}
		
		while (!CP2.colaVacia()) {
			comb.acolarPrioridad(CP2.primero(), CP2.prioridad());
			CP2.desacolar();
		}
		
		return comb;
	}

}