package impl;

import tda.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {

	int[] arr;
	int indice;
	
	@Override
	public void inicializarConjunto() {
		

	}

	@Override
	public void agregar(int x) {
		if(!this.pertenece(x)) {
			arr[indice] = x;
			indice++;
		}

	}

	@Override
	public void sacar(int x) {
		int i = 0;// constante
		while(i<indice && arr[i] != x) {
			i++; //constante
		}// lineal
		if(i != indice) { //x pertenece al conjunto lo encontramos
			arr[i] = arr[indice-1];
			indice--;
		}//constante
	}// constante + lineal + constante = (nos quedamos con el peor) --> lineal

	@Override
	public int elegir() {
		
		return 0;
	}

	@Override
	public boolean pertenece(int x) {
		int i = 0;
		while(i<indice && arr[i] != x) {
			i++;
		}
		return (i != indice);
	}

	@Override
	public boolean conjuntoVacio() {
		
		return false;
	}

}
