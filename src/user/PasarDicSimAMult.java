package user;

import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;
import tda.DiccionarioSimpleTDA;

public class PasarDicSimAMult {
	
	public static void pasarDicSimAMult (DiccionarioSimpleTDA DicSim, DiccionarioMultipleTDA DicMult) {
		
		ConjuntoTDA claves = DicSim.claves();
		while (!claves.conjuntoVacio()) {
			int clave = claves.elegir();
			claves.sacar(clave);
			DicMult.agregar(clave,DicSim.recuperar(clave));
		}
		
	}

}
