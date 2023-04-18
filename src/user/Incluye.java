package user;

import tda.ConjuntoTDA;

public class Incluye {
	
	public boolean incluye (ConjuntoTDA conj1, ConjuntoTDA conj2) {
		
		boolean incluye = true;
		int aux;
		
		while (!conj2.conjuntoVacio() && incluye) {
			aux = conj2.elegir();
			if(!conj1.pertenece(aux)) {
				incluye = false;
			}else {
				conj2.sacar(aux);
			}
			
		}
		
		return incluye;
	}

}
