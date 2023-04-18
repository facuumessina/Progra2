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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
