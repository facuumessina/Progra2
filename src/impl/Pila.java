package impl;

import tda.PilaTDA;

public class Pila implements PilaTDA {

	int[] arr;
	int indice;
	
	@Override
	public void inicializarPila() {
		arr = new int [100];
		indice = 0;
	}

	@Override
	public void apilar(int dato) {
		arr[indice] = dato;
		indice++;

	}

	@Override
	public void desapilar() {
		indice--;
	}

	@Override
	public boolean pilaVacia() {
		
		return (indice == 0);
		
		/*
		boolean resp;
		if(indice == 0) {
			resp = true;
		}else {
			resp = false;
		}
		
		return resp;
		*/
	}

	@Override
	public int tope() {
		
		return arr[indice-1];
	}

}
