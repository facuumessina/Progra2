package impl;

import tda.ColaPrioridadTDA;

public class ColaPrioridad implements ColaPrioridadTDA {

	class Elemento {
		int valor;
		int prioridad;
	}
	Elemento[] arr;
	int indice;
	

	@Override
	public void inicializarCola() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acolarPrioridad(int dato, int prio) {
		int i = indice;
		while(i > 0 && prio <= arr[i-1].prioridad) {
			arr[i] = new Elemento();
			arr[i].valor = arr[i-1].valor;
			arr[i].prioridad = arr[i-1].prioridad;
			i--;
		}
		arr[i].valor = dato;
		arr[i].prioridad = prio;
		indice++;

	}

	@Override
	public void desacolar() {
		indice--;
		arr[indice-1] = null;

	}

	@Override
	public int primero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int prioridad() {
		return arr[indice-1].prioridad;
	}

	@Override
	public boolean colaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

}
