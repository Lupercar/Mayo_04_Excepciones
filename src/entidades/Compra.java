package entidades;

import java.util.Date;
/**
 * <p>Clase plantilla de una Compra</p> 
 * @author tecnico
 * @since 01/07/2016
 * @version 1.0
 */
public class Compra {
	//campos
	private int codigo; 
	private Date fecha; 
	private double precio;
	
	/**
	 * Constructor sin parámetros de una compra
	 */
	public Compra(){
		
	}
	
	/**
	 * Constructor que se le pasa los parámetros
	 * @param codigo - Codigo compra
	 * @param fecha - fecha de compra
	 * @param precio - precio total de la compra
	 */
	public Compra(int codigo, Date fecha, double precio){
		setCodigo(codigo);
		setFecha(fecha);
		setPrecio(precio);
	}
	
	/**
	 * Devolvemos el codigo de una compra
	 * @return codigo - Codigo compra 
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Pasamos el codigo de una compra
	 * @param codigo - Codigo compra 
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Devolvemos la fecha de una compra
	 * @return - fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Compra [Codigo()=" + getCodigo() + 
				", Fecha()=" + getFecha() + 
				", Precio()=" + getPrecio() +
				"]";
	}

	@Override
	public boolean equals(Object obj) {
		Compra c = (Compra) obj;
		return getCodigo() == c.getCodigo(); 
	}
	
}//fin class Compra
