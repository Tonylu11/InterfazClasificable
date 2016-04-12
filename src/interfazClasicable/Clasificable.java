package interfazClasicable;

/**
 * Implementa el interfaz Clasificable donde: El método compare(Object) Compara
 * la instancia actual con la recibida en parámetro Devuelve un entero cuyo
 * valor depende de las reglas siguientes: 1 si la instancia actual es superior
 * a la recibida en parámetro (SUPERIOR) 0 si las dos instancias son iguales
 * (IGUAL) -1 si la instancia actual es inferior a la recibida en parámetro
 * (INFERIOR) -99 si la comparación es imposible (ERROR) Para comprobarlo,
 * implementa un array de Personas. Posteriormente, clasifícalo por apellidos y
 * muéstralo.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public interface Clasificable {
	int SUPERIOR = 1;
	int INFERIOR = -1;
	int IGUAL = 0;
	int ERROR = -99;

	int compare(Object o);
}
