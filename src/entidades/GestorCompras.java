package entidades;

import java.util.ArrayList;
import java.util.List;

import Exception.unchecked.CompraRepetidaException;


/**
 *  <p>Clase que gestiona las diferentes compras que se realizan</p>
 * @author tecnico
 *
 */
public class GestorCompras {
	//campos GestorCompras
	private List<Compra> compras = new ArrayList<>(); 
	
	/**
	 * Añade una compra
	 * @param compra - Compra añadida
	 */
	public void addCompra(Compra compra){
		if(compras.contains(compra)){
			throw new CompraRepetidaException();
		}
		compras.add(compra); 
	}
	
	/**
	 * Elimina una compra existente
	 * 
	 * @param compra - Compra a eliminar 
	 * @throws Exception Si la compra no existe se lanza la excepcion
	 */
	public void removeCompra(Compra compra) throws Exception{
		if(compras.contains(compra))
			compras.remove(compra); 
			else
				throw new Exception(); 
	}
	
	/**
	 * Retorna el número total de compras
	 * @return - El tamaño del array compras
	 */
	public int numeroCompras(){
		return compras.size(); 
	}
	
	/**
	 *  Devuelve compras
	 * @return - lista compras
	 */
	public List<Compra> getCompras(){
		return compras; 
	}
}//fin class GestorCompras
