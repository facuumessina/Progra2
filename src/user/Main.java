package user;

import impl.Pila;
import tda.PilaTDA;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				PilaTDA origen = new Pila();
				origen.inicializarPila();
				origen.apilar(1);
				origen.apilar(2);
				origen.apilar(3);
				origen.apilar(4);
				origen.apilar(5);
				origen.apilar(9);
				
		//////////////////////    TRABAJO PRACTICO 1    ////////////////////////
		////////////////////// TDA PILAS ACTIVIDAD 2 //////////////////////////
		/////////////////////////////     a)     ///////////////////////////// (Clonar Pila en otra orden inverso)
				
				/*PilaTDA destino =  PasarPilaInvertida.pasarPila(origen);

				while(!destino.pilaVacia()) {
					System.out.println(destino.tope());
					destino.desapilar();
				}*/
				
		 ///////////////////////////////    b)    //////////////////////////// (Clonar pila en otra igual)
				
				/*PilaTDA copia = CopiarPilaEnOtra.copiarPila(origen);
				
				while(!copia.pilaVacia()) {
					System.out.println(copia.tope());
					copia.desapilar();
				}
				*/
				
		///////////////////////////////    c)    //////////////////////////// (Invertir Pila)
				
				// Idem item a //
				
		
		///////////////////////////////    d)    //////////////////////////// (contar elementos de una pila)
				
				/*int count = ContarElementosPila.contarPila(origen);
				System.out.println(count);*/
				
		
		///////////////////////////////    e)    //////////////////////////// (Sumar elementos de una pila)
				
				/*int suma = SumarElementosPila.SumaPila(origen);
				
				System.out.println(suma);*/
				
		//////////////////////////////    f)    //////////////////////////// (Calcular el promedio)
				
				
				/*
				float promedio = PromedioPila.PromedioPila(origen);
				System.out.println(promedio);
				*/
		
	   //////////////////////TDA COLAS ACTIVIDAD 4 //////////////////////////
				
				
				
				
	}

}
