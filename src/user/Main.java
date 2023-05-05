package user;

import impl.Pila;
import tda.PilaTDA;
import tda.ColaTDA;
import impl.Cola;

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
				
				ColaTDA cola = new Cola();
				cola.inicializarCola();
				cola.acolar(4);
				cola.acolar(8);
				cola.acolar(4);
				cola.acolar(8);
				cola.acolar(4);
				
				
		//////////////////////    TRABAJO PRACTICO 1    ////////////////////////
		////////////////////// TDA PILAS ACTIVIDAD 2 //////////////////////////
				
				/*
				 * 
				 * 
				 */
				
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
				
		/////////////////////////////////////////////////////////////////////
		
	   //////////////////////TDA COLAS ACTIVIDAD 4 //////////////////////////
				
			/*
			 * 
			 * 
			 */
				
	   /////////////////////////////     a)     ///////////////////////////// (Pasar de una cola a otra)
				
			/*	
				ColaTDA destino = new Cola();
				destino.inicializarCola();
				
				PasarColaACola.PasarCola(cola, destino);

				while(!destino.colaVacia()) {
					System.out.println(destino.primero());
					destino.desacolar();
				}
			*/
	
		///////////////////////////////    b)    //////////////////////////// (Invertir el contenido de una cola - con aux)
				
			/*	
				InvertirColaAux.InvColaAux(cola);
			
				while(!cola.colaVacia()) {
					System.out.println(cola.primero());
					cola.desacolar();
				}
			*/
				
				
		///////////////////////////////    c)    //////////////////////////// (Invertir el contenido de una cola - sin aux)
	

		///////////////////////////////    d)    //////////////////////////// (final cola C1 = final cola C2)
				
				
	


	   ///////////////////////////////    e)    //////////////////////////// (Cola es capicúa)
				
			/*	
				boolean capicua = ColaEsCapicua.EsCapicua(cola);
				
				if (capicua != false) {
					System.out.println("La cola es capicua");
				}else {
					System.out.println("La cola no es capicua");
				}
			*/
	
	   //////////////////////////////    f)    //////////////////////////// (C1 es inversa a C2)
				
			
				
				

	}

}
