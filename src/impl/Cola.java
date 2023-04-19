package impl;

import tda.ColaTDA;

public class Cola implements ColaTDA {

	int[] arr;
	int indice;
	
	@Override
	public void inicializarCola() {
		arr = new int [100];
		indice = 0;

	}

	@Override
	public void acolar(int dato) {
		for (int i = indice -1; i >= 0; i--) {
			arr[i+1] = arr[i];
			arr[0] = dato;
			indice++;
		}

	}

	@Override
	public void desacolar() {
		indice--;

	}

	@Override
	public boolean colaVacia() {
		
		return (indice == 0);
	}

	@Override
	public int primero() {
		return arr[indice-1];
	}

}
