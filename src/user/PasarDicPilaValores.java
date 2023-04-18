package user;

import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;
import tda.PilaTDA;

public class PasarDicPilaValores {
	
	public static void pasarDicPilaValores (DiccionarioSimpleTDA Dic, PilaTDA valores) {
		ConjuntoTDA claves = Dic.claves();
		while (!claves.conjuntoVacio()) {
			int clave = claves.elegir();
			claves.sacar(clave);
			valores.apilar(Dic.recuperar(clave));
			
			/* valores.apilar(Dic.recuperar(claves.elegir()));
			 * claves.sacar(claves.elegir()); // MAL!
			 */
		}
	}
}
