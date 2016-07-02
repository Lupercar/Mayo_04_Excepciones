package consola;

import java.util.Date;

import entidades.Compra;
import entidades.GestorCompras;

public class App {
	
	public static void main(String[] args) {
		GestorCompras gc = new GestorCompras();
		
		Compra c1 = new Compra(1, new Date(), 1.00);
		Compra c2 = new Compra(2, new Date(), 1.00);
		Compra c3 = new Compra(1, new Date(), 1.00);
		Compra c4 = new Compra(3, new Date(), 1.00);
		
		gc.addCompra(c1);
		gc.addCompra(c2);
//		gc.addCompra(c3);	
		
		try {
			gc.removeCompra(c4);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println("Estas intentando borrar una compra" +
								"que no ha sido crear en gestor de compra.");
		}
		
		//captura de una excepcion de unchecked
		try {
//			double resultado = 1/0; 
			Integer.parseInt("2.3"); 
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException Error al escribir la aplicación.");
		}catch (RuntimeException ex) {
			System.out.println("RuntimeException Error al escribir la aplicación.");
		}catch (Throwable ex) {
			System.out.println("Throwable Error al escribir la aplicación.");
		}
		
		System.out.println("\nFin de la aplicación.");
		
		Compra c5 = null; 
		assert(c5!=null); 
	}
}//fin class App
