package tda;

public interface ColaPrioridadTDA {
	void inicializarCola();
	void acolarPrioridad(int dato, int prioridad); 
	void desacolar(); 
	int primero(); 
	int prioridad();
	boolean colaVacia(); 
}
