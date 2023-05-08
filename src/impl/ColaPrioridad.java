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
		indice = 0;
		arr = new Elemento[100];

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
		arr[i] = new Elemento();
		arr[i].valor = dato;
		arr[i].prioridad = prio;
		indice++;

	}

	@Override
	public void desacolar() {
		arr[indice-1] = null;
		indice--;

	}

	@Override
	public int primero() {
		return arr[indice-1].valor;
	}

	@Override
	
	public int prioridad() {
		return arr[indice-1].prioridad;
	}

	@Override
	public boolean colaVacia() {
		return (indice == 0);
	}

}
