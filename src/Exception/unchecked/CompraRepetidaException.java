package Exception.unchecked;

/*
 * Si heredamos de Exception tenemos una excepci�n que hay 
 * que gestionarla obligatoriamente (checked)
 * 
 * Si heredamos de RuntimeException tenemos una excepci�n 
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
		super("Se ha agregado una compra con un c�digo repetido.");
	}
}//fin class CompraRepetidaException
