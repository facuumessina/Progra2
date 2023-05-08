package user;

import impl.Pila;
import tda.PilaTDA;
import impl.ColaPrioridad;
import tda.ColaPrioridadTDA;


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
				
				/*ColaTDA cola = new Cola();
				cola.inicializarCola();
				cola.acolar(4);
				cola.acolar(8);
				cola.acolar(12);
				cola.acolar(16);
				cola.acolar(20);
				
				ColaTDA colainv = new Cola();
				colainv.inicializarCola();
				colainv.acolar(20);
				colainv.acolar(16);
				colainv.acolar(12);
				colainv.acolar(8);
				colainv.acolar(4);
				*/
				
				ColaPrioridadTDA cp1 = new ColaPrioridad();
				cp1.inicializarCola();
				cp1.acolarPrioridad(20,1);
				cp1.acolarPrioridad(16,2);
				cp1.acolarPrioridad(12,3);
				cp1.acolarPrioridad(8,5);
				cp1.acolarPrioridad(4,6);
				
				ColaPrioridadTDA cp2 = new ColaPrioridad();
				cp2.inicializarCola();
				cp2.acolarPrioridad(20,7);
				cp2.acolarPrioridad(16,3);
				cp2.acolarPrioridad(12,2);
				cp2.acolarPrioridad(8,8);
				cp2.acolarPrioridad(4,10);
				
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
	
			/*	
				ColaTDA inv = new Cola();
				inv.inicializarCola();
				inv = InvertirCola.InvertirCola(cola);
			
				while(!inv.colaVacia()) {
					System.out.println(inv.primero());
					inv.desacolar();
				}
				
			*/
				
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
				
				/*boolean inv = ColaEsInversa.EsInversa(cola, colainv);
				
				if(inv != true) {
					System.out.println("Las colas no son inversas");
				}else {
					System.out.println("Las colas ingresadas son inversas");
				}
				*/
				
	   //////////////////////TDA COLAS CON PRIORIDAD ACTIVIDAD 5  //////////////////////////
		
	  ///////////////////////////////    b)    //////////////////////////// (Combinar dos colas con prioridad)
				
				/*
				ColaPrioridadTDA comb = new ColaPrioridad();
				comb.inicializarCola();
				
				comb = CombinarColas.CombinarColasConPri(cp1,cp2);
				
				while(!comb.colaVacia()) {
					System.out.println(comb.primero() + " / " + comb.prioridad());
					comb.desacolar();
				}
				*/
				
		////////////////////// TRABAJO PRACTICO 3    ////////////////////////
		////////////////////// TDA CONJUNTO ACTIVIDAD 3 /////////////////////////
				
		
		//////////////////////TDA DICCIONARIO ACTIVIDAD 4 ///////////////////////
				
				
		
		
	}

}
