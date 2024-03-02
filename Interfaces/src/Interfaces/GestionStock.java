package Interfaces;

public class GestionStock {

	public interface Inventario {
		public static int cantidad = 0;

		public void obtenerStock();

		public void actualizarStock();

	}
}
