package interfazClasicable;

/**
 * Implementa el interfaz Clasificable donde:
 * <ul>
 * <li>El m�todo compare(Object) Compara la instancia actual con la recibida en
 * par�metro</li>
 * <li>Devuelve un entero cuyo valor depende de las reglas siguientes: 1 si la
 * instancia actual es superior a la recibida en par�metro (SUPERIOR)</li>
 * <li>0 si las dos instancias son iguales (IGUAL)</li>
 * <li>-1 si la instancia actual es inferior a la recibida en par�metro
 * (INFERIOR)</li>
 * <li>-99 si la comparaci�n es imposible (ERROR)
 * </ul>
 * Para comprobarlo, implementa un array de Personas. Posteriormente,
 * clasif�calo por apellidos y mu�stralo.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestClasificable {
	public static void main(String[] args) {
		Persona[] arrayPersonas = new Persona[4];
		try {
			arrayPersonas[0] = new Persona("Almansa");
			arrayPersonas[1] = new Persona("Bravo");
			arrayPersonas[2] = null;
			arrayPersonas[3] = new Persona("Zamora");
			System.out.println(arrayPersonas[0].compare(arrayPersonas[3]));
			System.out.println(arrayPersonas[0].compare(arrayPersonas[2]));
			System.out.println(arrayPersonas[1].compare(arrayPersonas[0]));
			System.out.println(arrayPersonas[0].compare(arrayPersonas[0]));

		} catch (ApellidoInvalidoException e) {
			System.err.println(e.getMessage());
		}
		// Arrays.sort(arrayPersonas);
		// for (int i = 0; i < arrayPersonas.length; i++) {
		// System.out.println(arrayPersonas[i]);
		// }
		// for (Persona persona : arrayPersonas) {
		//
		// }
		//
		// // -------------------------------
		// ArrayList<Persona> arrayList = new ArrayList<Persona>();
		// for (Persona persona : arrayPersonas) {
		// arrayList.add(persona);
		//
		// }
		// arrayList.sort(null);
	}
}