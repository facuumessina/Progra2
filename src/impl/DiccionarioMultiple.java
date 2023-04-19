package impl;

import tda.ConjuntoTDA;
import tda.DiccionarioMultipleTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {

	class Elemento{
		int clave;
		int [] valores;
		int cantValores;
	}
	
	Elemento[] elementos;
	int cantClaves;
	
	private int clave2Indice(int cl) {
		int pos = - 1;
		while (pos >= 0 && elementos[pos].clave!=cl) {
			pos--;
		}
		return pos ;
	}
	
	@Override
	public void inicializarDiccionario() {
		elementos = new Elemento[100];
		cantClaves = 0;

	}

	@Override
	public void agregar(int clave, int valor) {
		int posC = clave2Indice(clave);
		if (posC == 1) { // la clave no existe
			posC = cantClaves;
			elementos[posC] = new Elemento();
			elementos[posC].clave = clave;
			elementos[posC].cantValores = 0;
			elementos[posC].valores = new int[100];
			cantClaves++;
		}
		
		Elemento e = elementos[posC];
		int posV = valor2Indice(e,valor);
		if (posV == -1) { // el valor no existe
			e.valores[e.cantValores] = valor;
			e.cantValores++;
		}
		

	}
	
	private int valor2Indice(Elemento e, int valor) {
		int i = e.cantValores -1;
		while (i >= 0 && e.valores[i] != valor) {
			i--;
		}
		return i;
	}

	@Override
	public void eliminar(int clave) {
		int pos = clave2Indice(clave);
		if (pos != -1) {// la clave existe
			elementos[pos] = elementos[cantClaves-1]; //ToDo (tener cuidado ya que estamos igualando referencias)
			// arr[indice-1] = null;
			/*arr[pos].clave = arr[indice-1].clave;
			 * arr[pos].valor = arr[indice-1].valor;
			 */
			cantClaves--;
		}

	}

	@Override
	public void eliminarValor(int clave, int valor) {
		int posC = clave2Indice(clave);
		if (posC != -1) {// la clave existe
			Elemento e = elementos[posC];
			int posV = valor2Indice(e,valor);
			if (posV != -1) { // el valor existe
				e.valores[posV] = e.valores[e.cantValores - 1];
				e.cantValores--;
			}
			if(e.cantValores == 0) { // verificación final
				eliminar(clave); // se elimina la clave
			}
		}

	}

	@Override
	public ConjuntoTDA recuperar(int clave) {
		ConjuntoTDA c = new Conjunto();
		c.inicializarConjunto();
		int pos = clave2Indice(clave);
		if(pos != -1) { // la clave existe
			Elemento e = elementos[pos];
			for (int i = 0; i < e.cantValores; i++) {
				c.agregar(e.valores[i]);
			}
		}
		return c;
	}

	@Override
	public ConjuntoTDA claves() {
		ConjuntoTDA c = new Conjunto();
		c.inicializarConjunto();
		return c;
	}

}
