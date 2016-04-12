package interfazClasicable;

/**
 * Implementa el interfaz Clasificable donde: El m�todo compare(Object) Compara
 * la instancia actual con la recibida en par�metro Devuelve un entero cuyo
 * valor depende de las reglas siguientes: 1 si la instancia actual es superior
 * a la recibida en par�metro (SUPERIOR) 0 si las dos instancias son iguales
 * (IGUAL) -1 si la instancia actual es inferior a la recibida en par�metro
 * (INFERIOR) -99 si la comparaci�n es imposible (ERROR) Para comprobarlo,
 * implementa un array de Personas. Posteriormente, clasif�calo por apellidos y
 * mu�stralo.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Persona implements Clasificable {
	String apellido;

	public Persona(String apellido) throws ApellidoInvalidoException {
		setApellido(apellido);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws ApellidoInvalidoException {
		if (apellido == null) {
			throw new ApellidoInvalidoException("El apellido no puede ser null");
		}
		this.apellido = apellido;
	}

	@Override
	public int compare(Object obj) {
		if (obj == null)
			return ERROR;
		if (!(obj instanceof Persona))
			return ERROR;
		Persona other = (Persona) obj;
		int valor = getApellido().compareToIgnoreCase(other.getApellido());
		if (valor > 0)
			return INFERIOR;
		if (valor < 0)
			return SUPERIOR;
		return IGUAL;
	}

	@Override
	public String toString() {
		return "Persona [apellido=" + apellido + "]";
	}

}
