package Exception.unchecked;

/*
 * Si heredamos de Exception tenemos una excepción que hay 
 * que gestionarla obligatoriamente (checked)
 * 
 * Si heredamos de RuntimeException tenemos una excepción 
 * que no tenemos que gestionar (unChecked) 
 */

/**
 * <p>Clase que extiende a RuntimeException para una compra repetida</p>
 * @author tecnico
 *
 */
public class CompraRepetidaException extends RuntimeException{ 
	/**
	 * Mensaje de aviso.
	 */
	public CompraRepetidaException(){
		super("Se ha agregado una compra con un código repetido.");
	}
}//fin class CompraRepetidaException
