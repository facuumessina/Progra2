package user;


import impl.Cola;
import tda.ColaTDA;

public class InvertirColaAux {
	
	public static void InvColaAux(ColaTDA cola) {
		
		ColaTDA aux=new Cola();
		ColaTDA destino = new Cola();
		aux.inicializarCola();
		destino.inicializarCola();
		int cantidad=0;
		
		while(!cola.colaVacia()) {
			aux.acolar(cola.primero());
			cola.desacolar();
			cantidad++;
		}
		for (int i=0;i<(cantidad/2);i++){
			for (int j=cantidad-(i*2);j>1;j--) {
				cola.acolar(aux.primero());
				aux.desacolar();
				}
			destino.acolar(aux.primero());
			aux.desacolar();
			for (int j=cantidad-(i*2)-1;j>1;j--) {
				aux.acolar(cola.primero());
				cola.desacolar();
				}
			destino.acolar(cola.primero());
			cola.desacolar();
		}
		
		while(!destino.colaVacia()) {
			cola.acolar(destino.primero());
			destino.desacolar();
		}	
	}
}
