package impl;

import impl.DiccionarioSimple.Elemento;
import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {

	class Elemento{
		int clave,valor;
	}
	
	private Elemento[] arr;
	private int indice;
	
	@Override
	public void inicializarDiccionario() {
		// TODO Auto-generated method stub

	}
	
	private int clave2Indice(int cl) {
		int pos = indice - 1;
		while (pos >= 0 && arr[pos].clave!=cl) {
			pos--;
		}
		return pos ;
	}
	
	@Override
	public void agregar(int key, int v) {
		int pos = clave2Indice(key);
		if(pos == -1) { // la clave no existe
			arr[indice] = new Elemento();
			arr[indice].clave = key;
			arr[indice].valor = v;
			indice++;
		}else { //la clave ya existía
			arr[pos].valor = v;
		}

	}

	@Override
	public void eliminar(int clave) {
		int pos = clave2Indice(clave);
		if (pos != -1) {// la clave existe
			arr[pos] = arr[indice-1]; //ToDo (tener cuidado ya que estamos igualando referencias)
			// arr[indice-1] = null;
			/*arr[pos].clave = arr[indice-1].clave;
			 * arr[pos].valor = arr[indice-1].valor;
			 */
			arr[indice-1] = null; //posible
			indice--;
		}

	}

	@Override
	public int recuperar(int clave) { //muy sencillo
		return 0;

	}

	@Override
	public ConjuntoTDA claves() {
		// declarar un conjunto, inicializarlo, una vez inicializado, recorrer el arreglo con un for desde 0 a -1 o viceversa
		// agarra clave y la mete al conjunto, devuelve el conjunto completado con claves
		return null;
	}

}
